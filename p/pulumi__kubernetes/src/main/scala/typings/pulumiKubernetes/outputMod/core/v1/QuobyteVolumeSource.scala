package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
  */
trait QuobyteVolumeSource extends StObject {
  
  /**
    * Group to map volume access to Default is no group
    */
  var group: String
  
  /**
    * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
    */
  var readOnly: Boolean
  
  /**
    * Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
    */
  var registry: String
  
  /**
    * Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
    */
  var tenant: String
  
  /**
    * User to map volume access to Defaults to serivceaccount user
    */
  var user: String
  
  /**
    * Volume is a string that references an already created Quobyte volume by name.
    */
  var volume: String
}
object QuobyteVolumeSource {
  
  inline def apply(group: String, readOnly: Boolean, registry: String, tenant: String, user: String, volume: String): QuobyteVolumeSource = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], tenant = tenant.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuobyteVolumeSource]
  }
  
  extension [Self <: QuobyteVolumeSource](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: String): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}

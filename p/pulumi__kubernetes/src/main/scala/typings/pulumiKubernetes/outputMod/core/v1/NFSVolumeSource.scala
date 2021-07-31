package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
  */
trait NFSVolumeSource extends StObject {
  
  /**
    * Path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var path: String
  
  /**
    * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var readOnly: Boolean
  
  /**
    * Server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var server: String
}
object NFSVolumeSource {
  
  @scala.inline
  def apply(path: String, readOnly: Boolean, server: String): NFSVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[NFSVolumeSource]
  }
  
  @scala.inline
  implicit class NFSVolumeSourceMutableBuilder[Self <: NFSVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}

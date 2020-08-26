package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
  */
@js.native
trait QuobyteVolumeSource extends js.Object {
  /**
    * Group to map volume access to Default is no group
    */
  var group: String = js.native
  /**
    * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
    */
  var readOnly: Boolean = js.native
  /**
    * Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
    */
  var registry: String = js.native
  /**
    * Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
    */
  var tenant: String = js.native
  /**
    * User to map volume access to Defaults to serivceaccount user
    */
  var user: String = js.native
  /**
    * Volume is a string that references an already created Quobyte volume by name.
    */
  var volume: String = js.native
}

object QuobyteVolumeSource {
  @scala.inline
  def apply(group: String, readOnly: Boolean, registry: String, tenant: String, user: String, volume: String): QuobyteVolumeSource = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], tenant = tenant.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuobyteVolumeSource]
  }
  @scala.inline
  implicit class QuobyteVolumeSourceOps[Self <: QuobyteVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistry(value: String): Self = this.set("registry", value.asInstanceOf[js.Any])
    @scala.inline
    def setTenant(value: String): Self = this.set("tenant", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: String): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}


package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support
  * ownership management or SELinux relabeling.
  */
trait QuobyteVolumeSource extends js.Object {
  /**
    * Group to map volume access to Default is no group
    */
  val group: String
  /**
    * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions.
    * Defaults to false.
    */
  val readOnly: Boolean
  /**
    * Registry represents a single or multiple Quobyte Registry services specified as a string as
    * host:port pair (multiple entries are separated with commas) which acts as the central
    * registry for volumes
    */
  val registry: String
  /**
    * Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned
    * Quobyte volumes, value is set by the plugin
    */
  val tenant: String
  /**
    * User to map volume access to Defaults to serivceaccount user
    */
  val user: String
  /**
    * Volume is a string that references an already created Quobyte volume by name.
    */
  val volume: String
}

object QuobyteVolumeSource {
  @scala.inline
  def apply(group: String, readOnly: Boolean, registry: String, tenant: String, user: String, volume: String): QuobyteVolumeSource = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], tenant = tenant.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuobyteVolumeSource]
  }
}


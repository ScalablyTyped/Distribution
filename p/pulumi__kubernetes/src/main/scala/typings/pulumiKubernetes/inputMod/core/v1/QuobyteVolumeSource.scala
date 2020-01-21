package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var group: js.UndefOr[Input[String]] = js.undefined
  /**
    * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions.
    * Defaults to false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Registry represents a single or multiple Quobyte Registry services specified as a string as
    * host:port pair (multiple entries are separated with commas) which acts as the central
    * registry for volumes
    */
  var registry: Input[String]
  /**
    * Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned
    * Quobyte volumes, value is set by the plugin
    */
  var tenant: js.UndefOr[Input[String]] = js.undefined
  /**
    * User to map volume access to Defaults to serivceaccount user
    */
  var user: js.UndefOr[Input[String]] = js.undefined
  /**
    * Volume is a string that references an already created Quobyte volume by name.
    */
  var volume: Input[String]
}

object QuobyteVolumeSource {
  @scala.inline
  def apply(
    registry: Input[String],
    volume: Input[String],
    group: Input[String] = null,
    readOnly: Input[Boolean] = null,
    tenant: Input[String] = null,
    user: Input[String] = null
  ): QuobyteVolumeSource = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (tenant != null) __obj.updateDynamic("tenant")(tenant.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuobyteVolumeSource]
  }
}


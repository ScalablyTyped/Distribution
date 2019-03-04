package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val group: java.lang.String
  /**
    * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions.
    * Defaults to false.
    */
  val readOnly: scala.Boolean
  /**
    * Registry represents a single or multiple Quobyte Registry services specified as a string as
    * host:port pair (multiple entries are separated with commas) which acts as the central
    * registry for volumes
    */
  val registry: java.lang.String
  /**
    * User to map volume access to Defaults to serivceaccount user
    */
  val user: java.lang.String
  /**
    * Volume is a string that references an already created Quobyte volume by name.
    */
  val volume: java.lang.String
}

object QuobyteVolumeSource {
  @scala.inline
  def apply(
    group: java.lang.String,
    readOnly: scala.Boolean,
    registry: java.lang.String,
    user: java.lang.String,
    volume: java.lang.String
  ): QuobyteVolumeSource = {
    val __obj = js.Dynamic.literal(group = group, readOnly = readOnly, registry = registry, user = user, volume = volume)
  
    __obj.asInstanceOf[QuobyteVolumeSource]
  }
}


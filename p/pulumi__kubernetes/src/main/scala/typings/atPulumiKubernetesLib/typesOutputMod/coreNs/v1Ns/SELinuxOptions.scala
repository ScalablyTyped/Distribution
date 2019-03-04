package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SELinuxOptions are the labels to be applied to the container
  */
trait SELinuxOptions extends js.Object {
  /**
    * Level is SELinux level label that applies to the container.
    */
  val level: java.lang.String
  /**
    * Role is a SELinux role label that applies to the container.
    */
  val role: java.lang.String
  /**
    * Type is a SELinux type label that applies to the container.
    */
  val `type`: java.lang.String
  /**
    * User is a SELinux user label that applies to the container.
    */
  val user: java.lang.String
}

object SELinuxOptions {
  @scala.inline
  def apply(level: java.lang.String, role: java.lang.String, `type`: java.lang.String, user: java.lang.String): SELinuxOptions = {
    val __obj = js.Dynamic.literal(level = level, role = role, user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SELinuxOptions]
  }
}


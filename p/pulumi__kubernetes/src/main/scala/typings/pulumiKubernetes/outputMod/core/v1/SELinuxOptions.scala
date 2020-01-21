package typings.pulumiKubernetes.outputMod.core.v1

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
  val level: String
  /**
    * Role is a SELinux role label that applies to the container.
    */
  val role: String
  /**
    * Type is a SELinux type label that applies to the container.
    */
  val `type`: String
  /**
    * User is a SELinux user label that applies to the container.
    */
  val user: String
}

object SELinuxOptions {
  @scala.inline
  def apply(level: String, role: String, `type`: String, user: String): SELinuxOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELinuxOptions]
  }
}


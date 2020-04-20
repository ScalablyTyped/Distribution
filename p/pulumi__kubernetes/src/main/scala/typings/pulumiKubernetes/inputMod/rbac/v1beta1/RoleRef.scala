package typings.pulumiKubernetes.inputMod.rbac.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RoleRef contains information that points to the role being used
  */
trait RoleRef extends js.Object {
  /**
    * APIGroup is the group for the resource being referenced
    */
  var apiGroup: Input[String]
  /**
    * Kind is the type of resource being referenced
    */
  var kind: Input[String]
  /**
    * Name is the name of resource being referenced
    */
  var name: Input[String]
}

object RoleRef {
  @scala.inline
  def apply(apiGroup: Input[String], kind: Input[String], name: Input[String]): RoleRef = {
    val __obj = js.Dynamic.literal(apiGroup = apiGroup.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleRef]
  }
}


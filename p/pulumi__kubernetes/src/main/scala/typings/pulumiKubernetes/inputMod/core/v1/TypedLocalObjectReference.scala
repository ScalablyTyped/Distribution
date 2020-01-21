package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TypedLocalObjectReference contains enough information to let you locate the typed referenced
  * object inside the same namespace.
  */
trait TypedLocalObjectReference extends js.Object {
  /**
    * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the
    * specified Kind must be in the core API group. For any other third-party types, APIGroup is
    * required.
    */
  var apiGroup: js.UndefOr[Input[String]] = js.undefined
  /**
    * Kind is the type of resource being referenced
    */
  var kind: Input[String]
  /**
    * Name is the name of resource being referenced
    */
  var name: Input[String]
}

object TypedLocalObjectReference {
  @scala.inline
  def apply(kind: Input[String], name: Input[String], apiGroup: Input[String] = null): TypedLocalObjectReference = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (apiGroup != null) __obj.updateDynamic("apiGroup")(apiGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLocalObjectReference]
  }
}


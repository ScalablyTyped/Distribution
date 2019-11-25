package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val apiGroup: String
  /**
    * Kind is the type of resource being referenced
    */
  val kind: String
  /**
    * Name is the name of resource being referenced
    */
  val name: String
}

object TypedLocalObjectReference {
  @scala.inline
  def apply(apiGroup: String, kind: String, name: String): TypedLocalObjectReference = {
    val __obj = js.Dynamic.literal(apiGroup = apiGroup.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypedLocalObjectReference]
  }
}


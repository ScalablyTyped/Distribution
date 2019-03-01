package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val apiGroup: java.lang.String
  /**
    * Kind is the type of resource being referenced
    */
  val kind: java.lang.String
  /**
    * Name is the name of resource being referenced
    */
  val name: java.lang.String
}

object TypedLocalObjectReference {
  @scala.inline
  def apply(apiGroup: java.lang.String, kind: java.lang.String, name: java.lang.String): TypedLocalObjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiGroup")(apiGroup)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TypedLocalObjectReference]
  }
}


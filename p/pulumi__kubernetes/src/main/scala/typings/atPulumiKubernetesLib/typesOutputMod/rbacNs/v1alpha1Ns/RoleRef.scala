package typings
package atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns

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


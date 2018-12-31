package typings
package atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UserInfo holds the information about the user needed to implement the user.Info interface.
  */
trait UserInfo extends js.Object {
  /**
    * Any additional information provided by the authenticator.
    */
  val extra: js.Object
  /**
    * The names of groups this user is a part of.
    */
  val groups: js.Array[java.lang.String]
  /**
    * A unique value that identifies this user across time. If this user is deleted and another
    * user by the same name is added, they will have different UIDs.
    */
  val uid: java.lang.String
  /**
    * The name that uniquely identifies this user among all active users.
    */
  val username: java.lang.String
}


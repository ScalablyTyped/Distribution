package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UserSubject holds detailed information for user-kind subject.
  */
trait UserSubject extends js.Object {
  /**
    * `name` is the username that matches, or "*" to match all usernames. Required.
    */
  val name: String
}

object UserSubject {
  @scala.inline
  def apply(name: String): UserSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserSubject]
  }
}


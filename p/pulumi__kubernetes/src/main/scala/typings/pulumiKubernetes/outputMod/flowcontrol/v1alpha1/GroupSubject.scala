package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GroupSubject holds detailed information for group-kind subject.
  */
trait GroupSubject extends js.Object {
  /**
    * name is the user group that matches, or "*" to match all user groups. See
    * https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for
    * some well-known group names. Required.
    */
  val name: String
}

object GroupSubject {
  @scala.inline
  def apply(name: String): GroupSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GroupSubject]
  }
}


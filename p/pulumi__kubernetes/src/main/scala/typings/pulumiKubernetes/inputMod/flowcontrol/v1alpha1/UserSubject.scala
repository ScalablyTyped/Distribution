package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UserSubject holds detailed information for user-kind subject.
  */
@js.native
trait UserSubject extends js.Object {
  /**
    * `name` is the username that matches, or "*" to match all usernames. Required.
    */
  var name: Input[String] = js.native
}

object UserSubject {
  @scala.inline
  def apply(name: Input[String]): UserSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSubject]
  }
  @scala.inline
  implicit class UserSubjectOps[Self <: UserSubject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}


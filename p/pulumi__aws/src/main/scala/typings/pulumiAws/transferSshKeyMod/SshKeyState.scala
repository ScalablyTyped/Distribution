package typings.pulumiAws.transferSshKeyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SshKeyState extends js.Object {
  /**
    * The public key portion of an SSH key pair.
    */
  val body: js.UndefOr[Input[String]] = js.native
  /**
    * The Server ID of the Transfer Server (e.g. `s-12345678`)
    */
  val serverId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  val userName: js.UndefOr[Input[String]] = js.native
}

object SshKeyState {
  @scala.inline
  def apply(): SshKeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SshKeyState]
  }
  @scala.inline
  implicit class SshKeyStateOps[Self <: SshKeyState] (val x: Self) extends AnyVal {
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
    def setBody(value: Input[String]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setServerId(value: Input[String]): Self = this.set("serverId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerId: Self = this.set("serverId", js.undefined)
    @scala.inline
    def setUserName(value: Input[String]): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
  
}


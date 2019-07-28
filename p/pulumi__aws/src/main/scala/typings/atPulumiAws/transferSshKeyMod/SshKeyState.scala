package typings.atPulumiAws.transferSshKeyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshKeyState extends js.Object {
  /**
    * The public key portion of an SSH key pair.
    */
  val body: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Server ID of the Transfer Server (e.g. `s-12345678`)
    */
  val serverId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  val userName: js.UndefOr[Input[String]] = js.undefined
}

object SshKeyState {
  @scala.inline
  def apply(body: Input[String] = null, serverId: Input[String] = null, userName: Input[String] = null): SshKeyState = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (serverId != null) __obj.updateDynamic("serverId")(serverId.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SshKeyState]
  }
}


package typings
package atPulumiAwsLib.transferSshKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshKeyArgs extends js.Object {
  /**
    * The public key portion of an SSH key pair.
    */
  val body: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Server ID of the Transfer Server (e.g. `s-12345678`)
    */
  val serverId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  val userName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object SshKeyArgs {
  @scala.inline
  def apply(
    body: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    serverId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    userName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): SshKeyArgs = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SshKeyArgs]
  }
}


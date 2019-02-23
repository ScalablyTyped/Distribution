package typings
package atPulumiAwsLib.transferSshKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshKeyState extends js.Object {
  /**
    * The public key portion of an SSH key pair.
    */
  val body: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Server ID of the Transfer Server (e.g. `s-12345678`)
    */
  val serverId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  val userName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}


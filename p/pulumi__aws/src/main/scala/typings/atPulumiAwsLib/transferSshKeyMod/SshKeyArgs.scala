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


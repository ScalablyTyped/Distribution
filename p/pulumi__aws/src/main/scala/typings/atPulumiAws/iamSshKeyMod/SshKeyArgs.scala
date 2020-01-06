package typings.atPulumiAws.iamSshKeyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SshKeyArgs extends js.Object {
  /**
    * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
    */
  val encoding: Input[String] = js.native
  /**
    * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
    */
  val publicKey: Input[String] = js.native
  /**
    * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the IAM user to associate the SSH public key with.
    */
  val username: Input[String] = js.native
}

object SshKeyArgs {
  @scala.inline
  def apply(
    encoding: Input[String],
    publicKey: Input[String],
    username: Input[String],
    status: Input[String] = null
  ): SshKeyArgs = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SshKeyArgs]
  }
}


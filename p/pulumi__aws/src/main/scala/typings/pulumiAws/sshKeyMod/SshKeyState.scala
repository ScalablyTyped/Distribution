package typings.pulumiAws.sshKeyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SshKeyState extends js.Object {
  /**
    * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
    */
  val encoding: js.UndefOr[Input[String]] = js.native
  /**
    * The MD5 message digest of the SSH public key.
    */
  val fingerprint: js.UndefOr[Input[String]] = js.native
  /**
    * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
    */
  val publicKey: js.UndefOr[Input[String]] = js.native
  /**
    * The unique identifier for the SSH public key.
    */
  val sshPublicKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the IAM user to associate the SSH public key with.
    */
  val username: js.UndefOr[Input[String]] = js.native
}

object SshKeyState {
  @scala.inline
  def apply(
    encoding: Input[String] = null,
    fingerprint: Input[String] = null,
    publicKey: Input[String] = null,
    sshPublicKeyId: Input[String] = null,
    status: Input[String] = null,
    username: Input[String] = null
  ): SshKeyState = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    if (sshPublicKeyId != null) __obj.updateDynamic("sshPublicKeyId")(sshPublicKeyId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SshKeyState]
  }
}


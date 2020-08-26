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
    def setEncoding(value: Input[String]): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFingerprint(value: Input[String]): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setPublicKey(value: Input[String]): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    @scala.inline
    def setSshPublicKeyId(value: Input[String]): Self = this.set("sshPublicKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshPublicKeyId: Self = this.set("sshPublicKeyId", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUsername(value: Input[String]): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}


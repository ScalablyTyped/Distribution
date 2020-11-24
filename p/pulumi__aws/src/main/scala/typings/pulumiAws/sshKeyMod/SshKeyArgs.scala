package typings.pulumiAws.sshKeyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(encoding: Input[String], publicKey: Input[String], username: Input[String]): SshKeyArgs = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SshKeyArgs]
  }
  
  @scala.inline
  implicit class SshKeyArgsOps[Self <: SshKeyArgs] (val x: Self) extends AnyVal {
    
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
    def setPublicKey(value: Input[String]): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: Input[String]): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}

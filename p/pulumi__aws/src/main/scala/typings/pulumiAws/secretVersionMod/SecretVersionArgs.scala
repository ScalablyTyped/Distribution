package typings.pulumiAws.secretVersionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretVersionArgs extends js.Object {
  
  /**
    * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
    */
  val secretBinary: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
    */
  val secretId: Input[String] = js.native
  
  /**
    * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
    */
  val secretString: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
    */
  val versionStages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object SecretVersionArgs {
  
  @scala.inline
  def apply(secretId: Input[String]): SecretVersionArgs = {
    val __obj = js.Dynamic.literal(secretId = secretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretVersionArgs]
  }
  
  @scala.inline
  implicit class SecretVersionArgsOps[Self <: SecretVersionArgs] (val x: Self) extends AnyVal {
    
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
    def setSecretId(value: Input[String]): Self = this.set("secretId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretBinary(value: Input[String]): Self = this.set("secretBinary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretBinary: Self = this.set("secretBinary", js.undefined)
    
    @scala.inline
    def setSecretString(value: Input[String]): Self = this.set("secretString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretString: Self = this.set("secretString", js.undefined)
    
    @scala.inline
    def setVersionStagesVarargs(value: Input[String]*): Self = this.set("versionStages", js.Array(value :_*))
    
    @scala.inline
    def setVersionStages(value: Input[js.Array[Input[String]]]): Self = this.set("versionStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionStages: Self = this.set("versionStages", js.undefined)
  }
}

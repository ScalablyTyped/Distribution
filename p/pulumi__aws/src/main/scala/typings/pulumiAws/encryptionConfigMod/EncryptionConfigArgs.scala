package typings.pulumiAws.encryptionConfigMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionConfigArgs extends js.Object {
  
  /**
    * An AWS KMS customer master key (CMK) ARN.
    */
  val keyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
    */
  val `type`: Input[String] = js.native
}
object EncryptionConfigArgs {
  
  @scala.inline
  def apply(`type`: Input[String]): EncryptionConfigArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfigArgs]
  }
  
  @scala.inline
  implicit class EncryptionConfigArgsOps[Self <: EncryptionConfigArgs] (val x: Self) extends AnyVal {
    
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyId(value: Input[String]): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
  }
}

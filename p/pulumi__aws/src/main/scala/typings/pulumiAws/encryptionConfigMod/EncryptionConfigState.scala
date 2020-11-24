package typings.pulumiAws.encryptionConfigMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionConfigState extends js.Object {
  
  /**
    * An AWS KMS customer master key (CMK) ARN.
    */
  val keyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}
object EncryptionConfigState {
  
  @scala.inline
  def apply(): EncryptionConfigState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfigState]
  }
  
  @scala.inline
  implicit class EncryptionConfigStateOps[Self <: EncryptionConfigState] (val x: Self) extends AnyVal {
    
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
    def setKeyId(value: Input[String]): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

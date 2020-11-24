package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamServerSideEncryption extends js.Object {
  
  /**
    * Whether to enable encryption at rest. Default is `false`.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the encryption key. Required when `keyType` is `CUSTOMER_MANAGED_CMK`.
    */
  var keyArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Type of encryption key. Default is `AWS_OWNED_CMK`. Valid values are `AWS_OWNED_CMK` and `CUSTOMER_MANAGED_CMK`
    */
  var keyType: js.UndefOr[Input[String]] = js.native
}
object FirehoseDeliveryStreamServerSideEncryption {
  
  @scala.inline
  def apply(): FirehoseDeliveryStreamServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamServerSideEncryption]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamServerSideEncryptionOps[Self <: FirehoseDeliveryStreamServerSideEncryption] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setKeyArn(value: Input[String]): Self = this.set("keyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyArn: Self = this.set("keyArn", js.undefined)
    
    @scala.inline
    def setKeyType(value: Input[String]): Self = this.set("keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
  }
}

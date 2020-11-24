package typings.pulumiAws.keyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyArgs extends js.Object {
  
  /**
    * Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
    * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
    */
  val customerMasterKeySpec: js.UndefOr[Input[String]] = js.native
  
  /**
    * Duration in days after which the key is deleted after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
    */
  val deletionWindowInDays: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The description of the key as viewed in AWS console.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to false.
    */
  val enableKeyRotation: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies whether the key is enabled. Defaults to true.
    */
  val isEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT` or `SIGN_VERIFY`.
    * Defaults to `ENCRYPT_DECRYPT`.
    */
  val keyUsage: js.UndefOr[Input[String]] = js.native
  
  /**
    * A valid policy JSON document.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object KeyArgs {
  
  @scala.inline
  def apply(): KeyArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyArgs]
  }
  
  @scala.inline
  implicit class KeyArgsOps[Self <: KeyArgs] (val x: Self) extends AnyVal {
    
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
    def setCustomerMasterKeySpec(value: Input[String]): Self = this.set("customerMasterKeySpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerMasterKeySpec: Self = this.set("customerMasterKeySpec", js.undefined)
    
    @scala.inline
    def setDeletionWindowInDays(value: Input[Double]): Self = this.set("deletionWindowInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionWindowInDays: Self = this.set("deletionWindowInDays", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnableKeyRotation(value: Input[Boolean]): Self = this.set("enableKeyRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableKeyRotation: Self = this.set("enableKeyRotation", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Input[Boolean]): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setKeyUsage(value: Input[String]): Self = this.set("keyUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyUsage: Self = this.set("keyUsage", js.undefined)
    
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

package typings.pulumiAws.inputMod.kms

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrantConstraint extends js.Object {
  
  /**
    * A list of key-value pairs that must match the encryption context in subsequent cryptographic operation requests. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint. Conflicts with `encryptionContextSubset`.
    */
  var encryptionContextEquals: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A list of key-value pairs that must be included in the encryption context of subsequent cryptographic operation requests. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs. Conflicts with `encryptionContextEquals`.
    */
  var encryptionContextSubset: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object GrantConstraint {
  
  @scala.inline
  def apply(): GrantConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantConstraint]
  }
  
  @scala.inline
  implicit class GrantConstraintOps[Self <: GrantConstraint] (val x: Self) extends AnyVal {
    
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
    def setEncryptionContextEquals(value: Input[StringDictionary[Input[String]]]): Self = this.set("encryptionContextEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionContextEquals: Self = this.set("encryptionContextEquals", js.undefined)
    
    @scala.inline
    def setEncryptionContextSubset(value: Input[StringDictionary[Input[String]]]): Self = this.set("encryptionContextSubset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionContextSubset: Self = this.set("encryptionContextSubset", js.undefined)
  }
}

package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentDetailsModifier extends js.Object {
  
  var additionalDisplayItems: js.UndefOr[js.Array[PaymentItem]] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var supportedMethods: java.lang.String | js.Array[java.lang.String] = js.native
  
  var total: js.UndefOr[PaymentItem] = js.native
}
object PaymentDetailsModifier {
  
  @scala.inline
  def apply(supportedMethods: java.lang.String | js.Array[java.lang.String]): PaymentDetailsModifier = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsModifier]
  }
  
  @scala.inline
  implicit class PaymentDetailsModifierOps[Self <: PaymentDetailsModifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSupportedMethodsVarargs(value: java.lang.String*): Self = this.set("supportedMethods", js.Array(value :_*))
    
    @scala.inline
    def setSupportedMethods(value: java.lang.String | js.Array[java.lang.String]): Self = this.set("supportedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDisplayItemsVarargs(value: PaymentItem*): Self = this.set("additionalDisplayItems", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalDisplayItems(value: js.Array[PaymentItem]): Self = this.set("additionalDisplayItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalDisplayItems: Self = this.set("additionalDisplayItems", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setTotal(value: PaymentItem): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}

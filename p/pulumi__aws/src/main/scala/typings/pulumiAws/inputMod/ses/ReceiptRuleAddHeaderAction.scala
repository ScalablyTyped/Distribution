package typings.pulumiAws.inputMod.ses

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiptRuleAddHeaderAction extends js.Object {
  
  /**
    * The name of the header to add
    */
  var headerName: Input[String] = js.native
  
  /**
    * The value of the header to add
    */
  var headerValue: Input[String] = js.native
  
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double] = js.native
}
object ReceiptRuleAddHeaderAction {
  
  @scala.inline
  def apply(headerName: Input[String], headerValue: Input[String], position: Input[Double]): ReceiptRuleAddHeaderAction = {
    val __obj = js.Dynamic.literal(headerName = headerName.asInstanceOf[js.Any], headerValue = headerValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleAddHeaderAction]
  }
  
  @scala.inline
  implicit class ReceiptRuleAddHeaderActionOps[Self <: ReceiptRuleAddHeaderAction] (val x: Self) extends AnyVal {
    
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
    def setHeaderName(value: Input[String]): Self = this.set("headerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderValue(value: Input[String]): Self = this.set("headerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Input[Double]): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}

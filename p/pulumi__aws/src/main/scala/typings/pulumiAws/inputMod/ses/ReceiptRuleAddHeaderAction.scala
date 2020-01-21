package typings.pulumiAws.inputMod.ses

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}


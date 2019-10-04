package typings.atPulumiAws.typesInputMod.sesNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleAddHeaderAction extends js.Object {
  /**
    * The name of the header to add
    */
  var headerName: Input[String]
  /**
    * The value of the header to add
    */
  var headerValue: Input[String]
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double]
}

object ReceiptRuleAddHeaderAction {
  @scala.inline
  def apply(headerName: Input[String], headerValue: Input[String], position: Input[Double]): ReceiptRuleAddHeaderAction = {
    val __obj = js.Dynamic.literal(headerName = headerName.asInstanceOf[js.Any], headerValue = headerValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReceiptRuleAddHeaderAction]
  }
}


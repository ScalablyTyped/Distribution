package typings.atPulumiAws.typesOutputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleAddHeaderAction extends js.Object {
  /**
    * The name of the header to add
    */
  var headerName: String
  /**
    * The value of the header to add
    */
  var headerValue: String
  /**
    * The position of the action in the receipt rule
    */
  var position: Double
}

object ReceiptRuleAddHeaderAction {
  @scala.inline
  def apply(headerName: String, headerValue: String, position: Double): ReceiptRuleAddHeaderAction = {
    val __obj = js.Dynamic.literal(headerName = headerName, headerValue = headerValue, position = position)
  
    __obj.asInstanceOf[ReceiptRuleAddHeaderAction]
  }
}


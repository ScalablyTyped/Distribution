package typings.shopifyDashBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionValue extends js.Object {
  var name: String
  var option_id: String
  var value: js.Any
}

object OptionValue {
  @scala.inline
  def apply(name: String, option_id: String, value: js.Any): OptionValue = {
    val __obj = js.Dynamic.literal(name = name, option_id = option_id, value = value)
  
    __obj.asInstanceOf[OptionValue]
  }
}


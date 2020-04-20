package typings.shopifyBuy.ShopifyBuy

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], option_id = option_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionValue]
  }
}


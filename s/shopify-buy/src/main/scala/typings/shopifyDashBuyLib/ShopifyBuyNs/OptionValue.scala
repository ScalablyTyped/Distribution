package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionValue extends js.Object {
  var name: java.lang.String
  var option_id: java.lang.String
  var value: js.Any
}

object OptionValue {
  @scala.inline
  def apply(name: java.lang.String, option_id: java.lang.String, value: js.Any): OptionValue = {
    val __obj = js.Dynamic.literal(name = name, option_id = option_id, value = value)
  
    __obj.asInstanceOf[OptionValue]
  }
}


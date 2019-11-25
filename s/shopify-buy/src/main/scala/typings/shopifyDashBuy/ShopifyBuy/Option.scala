package typings.shopifyDashBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  /**
    * name of option (ex. "Size", "Color")
    */
  var name: String
  /**
    * get/set the currently selected option value with one of the values from the Product Options/values array.
    * For instance if the option values array had the following ["Large", "Medium", "Small"] setting selected to be
    * "Large", "Medium", or "Small" would be valid any other value would throw an Error.
    */
  var selected: String
  /**
    * an Array possible values for option. For instance if this option
    * is a "Size" option an example value for values could be: ["Large", "Medium", "Small"]
    */
  var values: js.Array[OptionValue]
}

object Option {
  @scala.inline
  def apply(name: String, selected: String, values: js.Array[OptionValue]): Option = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Option]
  }
}


package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionValue extends js.Object {
  var name: String = js.native
  var option_id: String = js.native
  var value: js.Any = js.native
}

object OptionValue {
  @scala.inline
  def apply(name: String, option_id: String, value: js.Any): OptionValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], option_id = option_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionValue]
  }
  @scala.inline
  implicit class OptionValueOps[Self <: OptionValue] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOption_id(value: String): Self = this.set("option_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


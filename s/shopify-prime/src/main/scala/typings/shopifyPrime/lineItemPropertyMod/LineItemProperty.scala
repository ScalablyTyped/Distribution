package typings.shopifyPrime.lineItemPropertyMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineItemProperty extends ShopifyObject {
  /**
    * The name of the note attribute.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the note attribute.
    */
  var value: js.UndefOr[js.Any] = js.native
}

object LineItemProperty {
  @scala.inline
  def apply(): LineItemProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItemProperty]
  }
  @scala.inline
  implicit class LineItemPropertyOps[Self <: LineItemProperty] (val x: Self) extends AnyVal {
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
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


package typings.shopifyPrime.ordersMod

import typings.shopifyPrime.optionsBaseMod.FieldOptions
import typings.shopifyPrime.optionsBaseMod.ListOptions
import typings.shopifyPrime.optionsBaseMod.ProcessedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderListOptions
  extends ListOptions
     with FieldOptions
     with ProcessedOptions
     with OrderCountOptions {
  /**
    * A comma-separated list of order ids.
    */
  var ids: js.UndefOr[String] = js.native
}

object OrderListOptions {
  @scala.inline
  def apply(): OrderListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderListOptions]
  }
  @scala.inline
  implicit class OrderListOptionsOps[Self <: OrderListOptions] (val x: Self) extends AnyVal {
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
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
  }
  
}


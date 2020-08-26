package typings.shopifyPrime.taxLineMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaxLine extends ShopifyObject {
  /**
    * The amount of tax to be charged.
    */
  var price: js.UndefOr[Double] = js.native
  /**
    * The rate of tax to be applied.
    */
  var rate: js.UndefOr[Double] = js.native
  /**
    * The name of the tax.
    */
  var title: js.UndefOr[String] = js.native
}

object TaxLine {
  @scala.inline
  def apply(): TaxLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaxLine]
  }
  @scala.inline
  implicit class TaxLineOps[Self <: TaxLine] (val x: Self) extends AnyVal {
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
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}


package typings.shopifyPrime.optionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicListOptions extends js.Object {
  /**
    * The maximum number of objects that should be returned, up to 250. Setting this parameter above 250 will result in an error.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The page number of the result list to retrieve. Use this in tandem with limit to page through the webhooks in a shop.
    */
  var page: js.UndefOr[Double] = js.native
}

object BasicListOptions {
  @scala.inline
  def apply(): BasicListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicListOptions]
  }
  @scala.inline
  implicit class BasicListOptionsOps[Self <: BasicListOptions] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
  }
  
}


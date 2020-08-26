package typings.shopifyPrime.anon

import typings.shopifyPrime.publishedStatusMod.PublishedStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  title :string | undefined,   product_id :number | undefined} & shopify-prime.shopify-prime/dist/options.DateOptions & shopify-prime.shopify-prime/dist/options.PublishedOptions */
@js.native
trait titlestringundefinedprodu extends js.Object {
  /**
    * Retrieve only objects that were created before the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var created_at_max: js.UndefOr[String] = js.native
  /**
    * Retrieve only objects that were created after the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var created_at_min: js.UndefOr[String] = js.native
  var product_id: js.UndefOr[Double] = js.native
  /**
    * Filter results to those published before date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_max: js.UndefOr[String] = js.native
  /**
    * Filter results to those published after date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_min: js.UndefOr[String] = js.native
  /**
    * Filter results to those with the given publish status.
    */
  var published_status: js.UndefOr[PublishedStatus] = js.native
  var title: js.UndefOr[String] = js.native
  /**
    * Retrieve only objects that were created before the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var updated_at_max: js.UndefOr[String] = js.native
  /**
    * Retrieve only objects that were created after the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var updated_at_min: js.UndefOr[String] = js.native
}

object titlestringundefinedprodu {
  @scala.inline
  def apply(): titlestringundefinedprodu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[titlestringundefinedprodu]
  }
  @scala.inline
  implicit class titlestringundefinedproduOps[Self <: titlestringundefinedprodu] (val x: Self) extends AnyVal {
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
    def setCreated_at_max(value: String): Self = this.set("created_at_max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at_max: Self = this.set("created_at_max", js.undefined)
    @scala.inline
    def setCreated_at_min(value: String): Self = this.set("created_at_min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at_min: Self = this.set("created_at_min", js.undefined)
    @scala.inline
    def setProduct_id(value: Double): Self = this.set("product_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct_id: Self = this.set("product_id", js.undefined)
    @scala.inline
    def setPublished_at_max(value: String): Self = this.set("published_at_max", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished_at_max: Self = this.set("published_at_max", js.undefined)
    @scala.inline
    def setPublished_at_min(value: String): Self = this.set("published_at_min", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished_at_min: Self = this.set("published_at_min", js.undefined)
    @scala.inline
    def setPublished_status(value: PublishedStatus): Self = this.set("published_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished_status: Self = this.set("published_status", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated_at_max(value: String): Self = this.set("updated_at_max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at_max: Self = this.set("updated_at_max", js.undefined)
    @scala.inline
    def setUpdated_at_min(value: String): Self = this.set("updated_at_min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at_min: Self = this.set("updated_at_min", js.undefined)
  }
  
}


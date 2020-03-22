package typings.shopifyPrime

import typings.shopifyPrime.publishedStatusMod.PublishedStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  title ? :string,   product_id ? :number} & shopify-prime.shopify-prime/dist/options.DateOptions & shopify-prime.shopify-prime/dist/options.PublishedOptions */
trait titlestringproductidnumbe extends js.Object {
  /**
    * Retrieve only objects that were created before the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var created_at_max: js.UndefOr[String] = js.undefined
  /**
    * Retrieve only objects that were created after the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var created_at_min: js.UndefOr[String] = js.undefined
  var product_id: js.UndefOr[Double] = js.undefined
  /**
    * Filter results to those published before date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_max: js.UndefOr[String] = js.undefined
  /**
    * Filter results to those published after date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_min: js.UndefOr[String] = js.undefined
  /**
    * Filter results to those with the given publish status.
    */
  var published_status: js.UndefOr[PublishedStatus] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  /**
    * Retrieve only objects that were created before the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var updated_at_max: js.UndefOr[String] = js.undefined
  /**
    * Retrieve only objects that were created after the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var updated_at_min: js.UndefOr[String] = js.undefined
}

object titlestringproductidnumbe {
  @scala.inline
  def apply(
    created_at_max: String = null,
    created_at_min: String = null,
    product_id: Int | Double = null,
    published_at_max: String = null,
    published_at_min: String = null,
    published_status: PublishedStatus = null,
    title: String = null,
    updated_at_max: String = null,
    updated_at_min: String = null
  ): titlestringproductidnumbe = {
    val __obj = js.Dynamic.literal()
    if (created_at_max != null) __obj.updateDynamic("created_at_max")(created_at_max.asInstanceOf[js.Any])
    if (created_at_min != null) __obj.updateDynamic("created_at_min")(created_at_min.asInstanceOf[js.Any])
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    if (published_at_max != null) __obj.updateDynamic("published_at_max")(published_at_max.asInstanceOf[js.Any])
    if (published_at_min != null) __obj.updateDynamic("published_at_min")(published_at_min.asInstanceOf[js.Any])
    if (published_status != null) __obj.updateDynamic("published_status")(published_status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated_at_max != null) __obj.updateDynamic("updated_at_max")(updated_at_max.asInstanceOf[js.Any])
    if (updated_at_min != null) __obj.updateDynamic("updated_at_min")(updated_at_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[titlestringproductidnumbe]
  }
}


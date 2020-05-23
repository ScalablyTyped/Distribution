package typings.shopifyPrime.optionsProductCollectionMod

import typings.shopifyPrime.optionsBaseMod.FieldOptions
import typings.shopifyPrime.optionsBaseMod.ListOptions
import typings.shopifyPrime.optionsBaseMod.PublishedOptions
import typings.shopifyPrime.publishedStatusMod.PublishedStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionListOptions
  extends ListOptions
     with FieldOptions
     with PublishedOptions {
  var handle: js.UndefOr[String] = js.undefined
  var ids: js.UndefOr[String] = js.undefined
  var product_id: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object CollectionListOptions {
  @scala.inline
  def apply(
    fields: String = null,
    handle: String = null,
    ids: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    product_id: js.UndefOr[Double] = js.undefined,
    published_at_max: String = null,
    published_at_min: String = null,
    published_status: PublishedStatus = null,
    since_id: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): CollectionListOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(product_id)) __obj.updateDynamic("product_id")(product_id.get.asInstanceOf[js.Any])
    if (published_at_max != null) __obj.updateDynamic("published_at_max")(published_at_max.asInstanceOf[js.Any])
    if (published_at_min != null) __obj.updateDynamic("published_at_min")(published_at_min.asInstanceOf[js.Any])
    if (published_status != null) __obj.updateDynamic("published_status")(published_status.asInstanceOf[js.Any])
    if (!js.isUndefined(since_id)) __obj.updateDynamic("since_id")(since_id.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionListOptions]
  }
}


package typings.shopifyDashPrime.distOptionsProductUnderscoreCollectionMod

import typings.shopifyDashPrime.distEnumsPublishedUnderscoreStatusMod.PublishedStatus
import typings.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import typings.shopifyDashPrime.distOptionsBaseMod.ListOptions
import typings.shopifyDashPrime.distOptionsBaseMod.PublishedOptions
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
    limit: Int | Double = null,
    page: Int | Double = null,
    product_id: Int | Double = null,
    published_at_max: String = null,
    published_at_min: String = null,
    published_status: PublishedStatus = null,
    since_id: Int | Double = null,
    title: String = null
  ): CollectionListOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    if (published_at_max != null) __obj.updateDynamic("published_at_max")(published_at_max.asInstanceOf[js.Any])
    if (published_at_min != null) __obj.updateDynamic("published_at_min")(published_at_min.asInstanceOf[js.Any])
    if (published_status != null) __obj.updateDynamic("published_status")(published_status.asInstanceOf[js.Any])
    if (since_id != null) __obj.updateDynamic("since_id")(since_id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionListOptions]
  }
}


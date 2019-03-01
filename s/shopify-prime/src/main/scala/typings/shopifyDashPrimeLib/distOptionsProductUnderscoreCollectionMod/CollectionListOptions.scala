package typings
package shopifyDashPrimeLib.distOptionsProductUnderscoreCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionListOptions
  extends shopifyDashPrimeLib.distOptionsBaseMod.ListOptions
     with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
     with shopifyDashPrimeLib.distOptionsBaseMod.PublishedOptions {
  var handle: js.UndefOr[java.lang.String] = js.undefined
  var ids: js.UndefOr[java.lang.String] = js.undefined
  var product_id: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object CollectionListOptions {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    handle: java.lang.String = null,
    ids: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    product_id: scala.Int | scala.Double = null,
    published_at_max: java.lang.String = null,
    published_at_min: java.lang.String = null,
    published_status: shopifyDashPrimeLib.distEnumsPublishedUnderscoreStatusMod.PublishedStatus = null,
    since_id: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): CollectionListOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    if (published_at_max != null) __obj.updateDynamic("published_at_max")(published_at_max)
    if (published_at_min != null) __obj.updateDynamic("published_at_min")(published_at_min)
    if (published_status != null) __obj.updateDynamic("published_status")(published_status.asInstanceOf[js.Any])
    if (since_id != null) __obj.updateDynamic("since_id")(since_id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CollectionListOptions]
  }
}


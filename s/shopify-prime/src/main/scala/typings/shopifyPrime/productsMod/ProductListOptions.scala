package typings.shopifyPrime.productsMod

import typings.shopifyPrime.optionsBaseMod.DateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductListOptions
  extends ProductBaseOptions
     with DateOptions {
  /**
    * A comma-separated list of product ids
    */
  var ids: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object ProductListOptions {
  @scala.inline
  def apply(
    collection_id: String = null,
    created_at_max: String = null,
    created_at_min: String = null,
    ids: String = null,
    product_type: String = null,
    title: String = null,
    updated_at_max: String = null,
    updated_at_min: String = null,
    vendor: String = null
  ): ProductListOptions = {
    val __obj = js.Dynamic.literal()
    if (collection_id != null) __obj.updateDynamic("collection_id")(collection_id.asInstanceOf[js.Any])
    if (created_at_max != null) __obj.updateDynamic("created_at_max")(created_at_max.asInstanceOf[js.Any])
    if (created_at_min != null) __obj.updateDynamic("created_at_min")(created_at_min.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (product_type != null) __obj.updateDynamic("product_type")(product_type.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated_at_max != null) __obj.updateDynamic("updated_at_max")(updated_at_max.asInstanceOf[js.Any])
    if (updated_at_min != null) __obj.updateDynamic("updated_at_min")(updated_at_min.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductListOptions]
  }
}


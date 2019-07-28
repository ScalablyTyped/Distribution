package typings.shopifyDashPrime.distOptionsProductsMod

import typings.shopifyDashPrime.distOptionsBaseMod.DateOptions
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
    if (collection_id != null) __obj.updateDynamic("collection_id")(collection_id)
    if (created_at_max != null) __obj.updateDynamic("created_at_max")(created_at_max)
    if (created_at_min != null) __obj.updateDynamic("created_at_min")(created_at_min)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (product_type != null) __obj.updateDynamic("product_type")(product_type)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated_at_max != null) __obj.updateDynamic("updated_at_max")(updated_at_max)
    if (updated_at_min != null) __obj.updateDynamic("updated_at_min")(updated_at_min)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[ProductListOptions]
  }
}


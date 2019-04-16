package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogInfoResponseLimits")
@js.native
class CatalogInfoResponseLimits () extends js.Object {
  /**
    * The maximum number of object IDs that may be included in a single `/v2/catalog/batch-delete` request.
    */
  var batch_delete_max_object_ids: js.UndefOr[scala.Double] = js.native
  /**
    * The maximum number of object IDs that may appear in a `/v2/catalog/batch-retrieve` request.
    */
  var batch_retrieve_max_object_ids: js.UndefOr[scala.Double] = js.native
  /**
    * The maximum number of objects that may appear within a single batch in a `/v2/catalog/batch-upsert` request.
    */
  var batch_upsert_max_objects_per_batch: js.UndefOr[scala.Double] = js.native
  /**
    * The maximum number of objects that may appear across all batches in a `/v2/catalog/batch-upsert` request.
    */
  var batch_upsert_max_total_objects: js.UndefOr[scala.Double] = js.native
  /**
    * The maximum number of results that may be returned in a page of a `/v2/catalog/search` response.
    */
  var search_max_page_limit: js.UndefOr[scala.Double] = js.native
  /**
    * The maximum number of item IDs that may be included in a single `/v2/catalog/update-item-modifier-lists` request.
    */
  var update_item_modifier_lists_max_item_ids: js.UndefOr[scala.Double] = js.native
  /**
    * The maximum number of modifier list IDs to be disabled that may be included in a single
    * `/v2/catalog/update-item-modifier-lists` request.
    */
  var update_item_modifier_lists_max_modifier_lists_to_disable: js.UndefOr[scala.Double] = js.native
  /**
    * The maximum number of modifier list IDs to be enabled that may be included in a single
    * `/v2/catalog/update-item-modifier-lists` request.
    */
  var update_item_modifier_lists_max_modifier_lists_to_enable: js.UndefOr[scala.Double] = js.native
  /**
    * The maximum number of item IDs that may be included in a single `/v2/catalog/update-item-taxes` request.
    */
  var update_item_taxes_max_item_ids: js.UndefOr[scala.Double] = js.native
  /**
    * The maximum number of tax IDs to be disabled that may be included in a single `/v2/catalog/update-item-taxes` request.
    */
  var update_item_taxes_max_taxes_to_disable: js.UndefOr[scala.Double] = js.native
  /**
    * The maximum number of tax IDs to be enabled that may be included in a single `/v2/catalog/update-item-taxes` request.
    */
  var update_item_taxes_max_taxes_to_enable: js.UndefOr[scala.Double] = js.native
}


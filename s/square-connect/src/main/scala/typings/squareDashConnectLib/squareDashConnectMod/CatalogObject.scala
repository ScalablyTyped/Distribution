package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogObject")
@js.native
class CatalogObject () extends js.Object {
  /**
    * A list of locations where the object is not present, even if `present_at_all_locations` is `true`.
    */
  var absent_at_location_ids: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * The Connect V1 IDs for this object at each [location](#type-location) where it is present, where they differ from
    * the object's Connect V2 ID. The field will only be present for objects that have been created or modified by
    * legacy APIs.
    */
  var catalog_v1_ids: js.UndefOr[js.Array[CatalogV1Id]] = js.native
  /**
    * Structured data for a [CatalogCategory](#type-catalogcategory), set for CatalogObjects of type `CATEGORY`.
    */
  var category_data: js.UndefOr[CatalogCategory] = js.native
  /**
    * Structured data for a [CatalogDiscount](#type-catalogdiscount), set for CatalogObjects of type `DISCOUNT`.
    */
  var discount_data: js.UndefOr[CatalogDiscount] = js.native
  /**
    * An identifier to reference this object in the catalog. When a new CatalogObject is inserted, the client should
    * set the id to a temporary identifier starting with a `'#'` character. Other objects being inserted or updated
    * within the same request may use this identifier to refer to the new object.  When the server receives the new
    * object, it will supply a unique identifier that replaces the temporary identifier for all future references.
    */
  var id: java.lang.String = js.native
  /**
    * If `true`, the object has been deleted from the database. Must be `false` for new objects being inserted. When
    * deleted, the `updated_at` field will equal the deletion time.
    */
  var is_deleted: js.UndefOr[scala.Boolean] = js.native
  /**
    * Structured data for a [CatalogItem](#type-catalogitem), set for CatalogObjects of type `ITEM`.
    */
  var item_data: js.UndefOr[CatalogItem] = js.native
  /**
    * Structured data for a [CatalogItemVariation](#type-catalogitemvariation), set for CatalogObjects of type
    * `ITEM_VARIATION`.
    */
  var item_variation_data: js.UndefOr[CatalogItemVariation] = js.native
  /**
    * Structured data for a [CatalogModifier](#type-catalogmodifier), set for CatalogObjects of type `MODIFIER`.
    */
  var modifier_data: js.UndefOr[CatalogModifier] = js.native
  /**
    * Structured data for a [CatalogModifierList](#type-catalogmodifierlist), set for CatalogObjects of type
    * `MODIFIER_LIST`.
    */
  var modifier_list_data: js.UndefOr[CatalogModifierList] = js.native
  /**
    * If `true`, this object is present at all locations (including future locations), except where specified in the
    * `absent_at_location_ids` field. If `false`, this object is not present at any locations (including future
    * locations), except where specified in the `present_at_location_ids` field. If not specified, defaults to `true`.
    */
  var present_at_all_locations: js.UndefOr[scala.Boolean] = js.native
  /**
    * A list of locations where the object is present, even if `present_at_all_locations` is `false`.
    */
  var present_at_location_ids: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Structured data for a [CatalogTax](#type-catalogtax), set for CatalogObjects of type `TAX`.
    */
  var tax_data: js.UndefOr[CatalogTax] = js.native
  /**
    * The type of this object. Each object type has expected properties expressed in a structured format within its
    * corresponding `*_data` field below. See [CatalogObjectType](#type-catalogobjecttype) for all possible values.
    */
  var `type`: squareDashConnectLib.squareDashConnectMod.CatalogObjectNs.TypeEnum = js.native
  /**
    * Last modification [timestamp](#workingwithdates) in RFC 3339 format, e.g., `\"2016-08-15T23:59:33.123Z\"` would
    * indicate the UTC time (denoted by `Z`) of August 15, 2016 at 23:59:33 and 123 milliseconds.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.native
  /**
    * The version of the object. When updating an object, the version supplied by the must match the version in the
    * database, otherwise the write will be rejected as conflicting.
    */
  var version: js.UndefOr[scala.Double] = js.native
}


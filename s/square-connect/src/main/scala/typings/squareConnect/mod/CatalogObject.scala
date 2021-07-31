package typings.squareConnect.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogObject")
@js.native
class CatalogObject () extends StObject {
  
  /**
    * A list of locations where the object is not present, even if `present_at_all_locations` is `true`.
    */
  var absent_at_location_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The Connect v1 IDs for this object at each location where it is present, where they differ from the object's Connect V2 ID.
    * The field will only be present for objects that have been created or modified by legacy APIs.
    */
  var catalog_v1_ids: js.UndefOr[js.Array[Record[String, js.Any]]] = js.native
  
  /**
    * Structured data for a `CatalogCategory`, set for CatalogObjects of type `CATEGORY`.
    */
  var category_data: js.UndefOr[CatalogCategory] = js.native
  
  /**
    * Structured data for a `CatalogCustomAttributeDefinition`, set for CatalogObjects of type `CUSTOM_ATTRIBUTE_DEFINITION`.
    */
  var custom_attribute_definition_data: js.UndefOr[CatalogCustomAttributeDefinition] = js.native
  
  /**
    * A map (key-value pairs) of application-defined custom attribute values.
    * The value of a key-value pair is a `CatalogCustomAttributeValue` object.
    * The key is the `key` attribute value defined in the associated `CatalogCustomAttributeDefinition` object defined by the application making the request.
    * If the `CatalogCustomAttributeDefinition` object is defined by another application, the `CatalogCustomAttributeDefinition`'s key attribute value is prefixed by the defining application ID.
    * For example, if the `CatalogCustomAttributeDefinition` has a `key` attribute of `\"cocoa_brand\"` and the defining
    * application ID is `\"abcd1234\"`, the key in the map is `\"abcd1234:cocoa_brand\"` if the application making the
    * request is different from the application defining the custom attribute definition.
    * Otherwise, the key used in the map is simply `\"cocoa_brand\"`. Application-defined custom attributes that are set at a global (location-independent) level.
    * Custom attribute values are intended to store additional information about a catalog object or associations with
    * an entity in another system. Do not use custom attributes to store any sensitive information (personally identifiable information, card details, etc.).
    */
  var custom_attribute_values: js.UndefOr[Record[String, CatalogCustomAttributeValue]] = js.native
  
  /**
    * Structured data for a `CatalogDiscount`, set for CatalogObjects of type `DISCOUNT`.
    */
  var discount_data: js.UndefOr[CatalogDiscount] = js.native
  
  /**
    * An identifier to reference this object in the catalog. When a new `CatalogObject` is inserted, the client should
    * set the id to a temporary identifier starting with a `#` character. Other objects being inserted or updated
    * within the same request may use this identifier to refer to the new object. When the server receives the new object,
    * it will supply a unique identifier that replaces the temporary identifier for all future references.
    */
  var id: String = js.native
  
  /**
    * Structured data for a `CatalogImage`, set for CatalogObjects of type `IMAGE`.
    */
  var image_data: js.UndefOr[CatalogImage] = js.native
  
  /**
    * Identifies the `CatalogImage` attached to this `CatalogObject`.
    */
  var image_id: js.UndefOr[String] = js.native
  
  /**
    * If `true`, the object has been deleted from the database. Must be `false` for new objects being inserted. When
    * deleted, the `updated_at` field will equal the deletion time.
    */
  var is_deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Structured data for a `CatalogItem`, set for CatalogObjects of type `ITEM`.
    */
  var item_data: js.UndefOr[CatalogItem] = js.native
  
  /**
    * Structured data for a `CatalogItemOption`, set for CatalogObjects of type `ITEM_OPTION`.
    */
  var item_option_data: js.UndefOr[CatalogItemOption] = js.native
  
  /**
    * Structured data for a `CatalogItemOptionValue`, set for CatalogObjects of type `ITEM_OPTION_VAL`.
    */
  var item_option_value_data: js.UndefOr[CatalogItemOptionValue] = js.native
  
  /**
    * Structured data for a `CatalogItemVariation`, set for CatalogObjects of type `ITEM_VARIATION`.
    */
  var item_variation_data: js.UndefOr[CatalogItemVariation] = js.native
  
  /**
    * Structured data for a `CatalogMeasurementUnit`, set for CatalogObjects of type `MEASUREMENT_UNIT`.
    */
  var measurement_unit_data: js.UndefOr[CatalogMeasurementUnit] = js.native
  
  /**
    * Structured data for a `CatalogModifier`, set for CatalogObjects of type `MODIFIER`.
    */
  var modifier_data: js.UndefOr[CatalogModifier] = js.native
  
  /**
    * Structured data for a `CatalogModifierList`, set for CatalogObjects of type `MODIFIER_LIST`.
    */
  var modifier_list_data: js.UndefOr[CatalogModifierList] = js.native
  
  /**
    * If `true`, this object is present at all locations (including future locations), except where specified in the
    * `absent_at_location_ids` field. If `false`, this object is not present at any locations (including future
    * locations), except where specified in the `present_at_location_ids` field. If not specified, defaults to `true`.
    */
  var present_at_all_locations: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of locations where the object is present, even if `present_at_all_locations` is `false`.
    */
  var present_at_location_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Structured data for a `CatalogPricingRule`, set for CatalogObjects of type `PRICING_RULE`.
    * A `CatalogPricingRule` object often works with a `CatalogProductSet` object or a `CatalogTimePeriod` object.
    */
  var pricing_rule_data: js.UndefOr[CatalogPricingRule] = js.native
  
  /**
    * Structured data for a `CatalogProductSet`, set for CatalogObjects of type `PRODUCT_SET`.
    */
  var product_set_data: js.UndefOr[CatalogProductSet] = js.native
  
  /**
    * Structured data for a `CatalogQuickAmountsSettings`, set for CatalogObjects of type `QUICK_AMOUNTS_SETTINGS`.
    */
  var quick_amounts_settings_data: js.UndefOr[CatalogQuickAmountsSettings] = js.native
  
  /**
    * Structured data for a `CatalogSubscriptionPlan`, set for CatalogObjects of type `SUBSCRIPTION_PLAN`.
    */
  var subscription_plan_data: js.UndefOr[CatalogSubscriptionPlan] = js.native
  
  /**
    * Structured data for a `CatalogTax`, set for CatalogObjects of type `TAX`.
    */
  var tax_data: js.UndefOr[CatalogTax] = js.native
  
  /**
    * Structured data for a `CatalogTimePeriod`, set for CatalogObjects of type `TIME_PERIOD`.
    */
  var time_period_data: js.UndefOr[CatalogTimePeriod] = js.native
  
  /**
    * The type of this object. Each object type has expected properties expressed in a structured format within its
    * corresponding `*_data` field below. See [CatalogObjectType](#type-catalogobjecttype) for possible values.
    */
  var `type`: ObjectType = js.native
  
  /**
    * Last modification [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates) in RFC 3339 format,
    * e.g., "2016-08-15T23:59:33.123Z" would indicate the UTC time (denoted by `Z`) of August 15, 2016 at 23:59:33 and 123 milliseconds.
    */
  var updated_at: js.UndefOr[String] = js.native
  
  /**
    * The version of the object. When updating an object, the version supplied must match the version in the database,
    * otherwise the write will be rejected as conflicting.
    */
  var version: js.UndefOr[Double] = js.native
}

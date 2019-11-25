package typings.shopifyDashPrime.distModelsMetaUnderscoreFieldMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import typings.shopifyDashPrime.shopifyDashPrimeStrings.integer
import typings.shopifyDashPrime.shopifyDashPrimeStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaField extends ShopifyObject {
  /**
    * The date and time when the metafield was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * Additional information about the metafield.
    */
  var description: String
  /**
    * Identifier for the metafield (maximum of 30 characters).
    */
  var key: String
  /**
    * Container for a set of metadata. Namespaces help distinguish between metadata you created and metadata created by another individual with a similar namespace (maximum of 20 characters).
    */
  var namespace: String
  /**
    * The Id of the Shopify Resource that the metafield is associated with. This value could be the id of things like product, order, variant, collection.
    */
  var owner_id: js.UndefOr[Double] = js.undefined
  /**
    * The name of the Shopify Resource that the metafield is associated with. This could be things like product, order, variant, collection.
    */
  var owner_resource: String
  /**
    * The date and time when the metafield was last updated.
    */
  var updated_at: js.UndefOr[String] = js.undefined
  /**
    * Information to be stored as metadata. Must be either a string or an int.
    */
  var value: String | Double
  /**
    * States whether the information in the value is stored as a 'string' or 'integer.'
    */
  var value_type: string | integer
}

object MetaField {
  @scala.inline
  def apply(
    description: String,
    key: String,
    namespace: String,
    owner_resource: String,
    value: String | Double,
    value_type: string | integer,
    admin_graphql_api_id: String = null,
    created_at: String = null,
    id: Int | Double = null,
    owner_id: Int | Double = null,
    updated_at: String = null
  ): MetaField = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], owner_resource = owner_resource.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], value_type = value_type.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (owner_id != null) __obj.updateDynamic("owner_id")(owner_id.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaField]
  }
}


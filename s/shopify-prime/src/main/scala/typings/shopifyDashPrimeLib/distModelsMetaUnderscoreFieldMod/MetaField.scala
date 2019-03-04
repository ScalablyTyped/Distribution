package typings
package shopifyDashPrimeLib.distModelsMetaUnderscoreFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaField
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The date and time when the metafield was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional information about the metafield.
    */
  var description: java.lang.String
  /**
    * Identifier for the metafield (maximum of 30 characters).
    */
  var key: java.lang.String
  /**
    * Container for a set of metadata. Namespaces help distinguish between metadata you created and metadata created by another individual with a similar namespace (maximum of 20 characters).
    */
  var namespace: java.lang.String
  /**
    * The Id of the Shopify Resource that the metafield is associated with. This value could be the id of things like product, order, variant, collection.
    */
  var owner_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the Shopify Resource that the metafield is associated with. This could be things like product, order, variant, collection.
    */
  var owner_resource: java.lang.String
  /**
    * The date and time when the metafield was last updated.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Information to be stored as metadata. Must be either a string or an int.
    */
  var value: java.lang.String | scala.Double
  /**
    * States whether the information in the value is stored as a 'string' or 'integer.'
    */
  var value_type: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.string | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.integer
}

object MetaField {
  @scala.inline
  def apply(
    description: java.lang.String,
    key: java.lang.String,
    namespace: java.lang.String,
    owner_resource: java.lang.String,
    value: java.lang.String | scala.Double,
    value_type: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.string | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.integer,
    admin_graphql_api_id: java.lang.String = null,
    created_at: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    owner_id: scala.Int | scala.Double = null,
    updated_at: java.lang.String = null
  ): MetaField = {
    val __obj = js.Dynamic.literal(description = description, key = key, namespace = namespace, owner_resource = owner_resource, value = value.asInstanceOf[js.Any], value_type = value_type.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (owner_id != null) __obj.updateDynamic("owner_id")(owner_id.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[MetaField]
  }
}


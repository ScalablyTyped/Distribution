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


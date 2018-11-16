package typings
package shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CustomCollection extends ProductCollection {
  /**
       * Array of products in the collection
       *
       * position - Product position in array
       * product_id - Required when adding a new item
       * id - Required when shifting the position of a product that was previously added to the collection
       */
  var collects: js.Array[shopifyDashPrimeLib.Anon_ProductidPosition]
  /**
       * "key": "new"
       * "value": "newvalue"
       * "value_type": "string"
       * "namespace": "global"
       *
       * Attaches additional metadata to a shop's resources:
       *
       * - key (required): Identifier for the metafield (maximum of 30 characters).
       * - namespace (required): Container for a set of metadata. Namespaces help distinguish between metadata you created and metadata created by another individual with a similar namespace (maximum of 20 characters).
       * - value (required): Information to be stored as metadata.
       * - value_type (required): States whether the information in the value is stored as a 'string' or 'integer.'
       * - description (optional): Additional information about the metafield.
       */
  var metafield: js.UndefOr[java.lang.String] = js.undefined
  /**
       * States whether the custom collection is visible. Valid values are "true" for visible and "false" for hidden.
       */
  var published: js.UndefOr[scala.Boolean] = js.undefined
}


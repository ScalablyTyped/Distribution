package typings
package shopifyDashPrimeLib.distModelsProductUnderscoreImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProductImage
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
       * A base64 image attachment. Only used when creating a <see cref="ProductImage"/>, where it's then converted into the <see cref="Src"/>.
       */
  var attachment: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The date and time when the product image was created. The API returns this value in ISO 8601 format.
       */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Specifies the file name of the image when creating a <see cref="ProductImage"/>, where it's then converted into the <see cref="Src"/> path
       */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The order of the product image in the list. The first product image is at position 1 and is the "main" image for the product.
       */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
       * The id of the product associated with the image.
       */
  var product_id: js.UndefOr[scala.Double] = js.undefined
  /**
       * Specifies the location of the product image.
       */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The date and time when the product image was last modified. The API returns this value in ISO 8601 format.
       */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An array of variant ids associated with the image.
       */
  var variant_ids: js.UndefOr[js.Array[scala.Double]] = js.undefined
}


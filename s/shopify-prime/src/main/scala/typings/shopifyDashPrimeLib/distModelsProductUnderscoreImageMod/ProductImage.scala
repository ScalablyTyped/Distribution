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

object ProductImage {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    attachment: java.lang.String = null,
    created_at: java.lang.String = null,
    filename: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    position: scala.Int | scala.Double = null,
    product_id: scala.Int | scala.Double = null,
    src: java.lang.String = null,
    updated_at: java.lang.String = null,
    variant_ids: js.Array[scala.Double] = null
  ): ProductImage = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (attachment != null) __obj.updateDynamic("attachment")(attachment)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    if (variant_ids != null) __obj.updateDynamic("variant_ids")(variant_ids)
    __obj.asInstanceOf[ProductImage]
  }
}


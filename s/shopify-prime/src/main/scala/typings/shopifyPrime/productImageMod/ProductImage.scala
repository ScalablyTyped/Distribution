package typings.shopifyPrime.productImageMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductImage extends ShopifyObject {
  /**
    * A base64 image attachment. Only used when creating a <see cref="ProductImage"/>, where it's then converted into the <see cref="Src"/>.
    */
  var attachment: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the product image was created. The API returns this value in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * Specifies the file name of the image when creating a <see cref="ProductImage"/>, where it's then converted into the <see cref="Src"/> path
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * The order of the product image in the list. The first product image is at position 1 and is the "main" image for the product.
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    * The id of the product associated with the image.
    */
  var product_id: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the location of the product image.
    */
  var src: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the product image was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.undefined
  /**
    * An array of variant ids associated with the image.
    */
  var variant_ids: js.UndefOr[js.Array[Double]] = js.undefined
}

object ProductImage {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    attachment: String = null,
    created_at: String = null,
    filename: String = null,
    id: Int | Double = null,
    position: Int | Double = null,
    product_id: Int | Double = null,
    src: String = null,
    updated_at: String = null,
    variant_ids: js.Array[Double] = null
  ): ProductImage = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (variant_ids != null) __obj.updateDynamic("variant_ids")(variant_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductImage]
  }
}


package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageVariant extends Image {
  var dimensions: java.lang.String
  var name: java.lang.String
  /**
    * Returns src URL for new image size/variant
    * @param image The image you would like a different size for.
    * @param options Image Max width and height configuration.
    */
  def imageForSize(image: Image, options: ImageOptions): java.lang.String
}


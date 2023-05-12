package typings.shopifyBuy.mod

import typings.shopifyBuy.anon.ImageForSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Image resource
  *
  * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/image-resource.js
  */
@JSImport("shopify-buy", "ImageResource")
@js.native
open class ImageResource protected () extends Resource {
  def this(client: GraphQLJSClient) = this()
  
  var helpers: ImageForSize = js.native
}

package typings.shopifyDashBuy.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var domain: String
  var storefrontAccessToken: String
}

object Config {
  @scala.inline
  def apply(domain: String, storefrontAccessToken: String): Config = {
    val __obj = js.Dynamic.literal(domain = domain, storefrontAccessToken = storefrontAccessToken)
  
    __obj.asInstanceOf[Config]
  }
}


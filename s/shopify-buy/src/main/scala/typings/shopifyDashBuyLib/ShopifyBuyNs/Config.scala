package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var domain: java.lang.String
  var storefrontAccessToken: java.lang.String
}

object Config {
  @scala.inline
  def apply(domain: java.lang.String, storefrontAccessToken: java.lang.String): Config = {
    val __obj = js.Dynamic.literal(domain = domain, storefrontAccessToken = storefrontAccessToken)
  
    __obj.asInstanceOf[Config]
  }
}


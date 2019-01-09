package typings
package shopifyDashPrimeLib.distInfrastructureShopifyUnderscoreErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/infrastructure/shopify_error", "ShopifyError")
@js.native
class ShopifyError protected ()
  extends nodeLib.Error {
  def this(response: shopifyDashPrimeLib.Anon_Status, body: ErrorType1) = this()
  def this(response: shopifyDashPrimeLib.Anon_Status, body: ErrorType2) = this()
  def this(response: shopifyDashPrimeLib.Anon_Status, body: ErrorType3) = this()
  /**
    * True when the requesting application has made too many requests and reached Shopify's API rate limit.
    */
  var apiRateLimitReached: scala.Boolean = js.native
  var body: ErrorType1 | ErrorType2 | ErrorType3 = js.native
  var errors: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  val isShopifyPrime: scala.Boolean = js.native
  var statusCode: scala.Double = js.native
  var statusText: java.lang.String = js.native
}


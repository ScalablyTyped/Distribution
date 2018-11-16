package typings
package shopifyDashPrimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/auth", JSImport.Namespace)
@js.native
object distAuthMod extends js.Object {
  def authorize(
    code: java.lang.String,
    shopDomain: java.lang.String,
    shopifyApiKey: java.lang.String,
    shopifySecretKey: java.lang.String
  ): stdLib.Promise[java.lang.String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[shopifyDashPrimeLib.distEnumsAuthUnderscoreScopeMod.AuthScope],
    shopifyDomain: java.lang.String,
    shopifyApiKey: java.lang.String
  ): stdLib.Promise[java.lang.String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[shopifyDashPrimeLib.distEnumsAuthUnderscoreScopeMod.AuthScope],
    shopifyDomain: java.lang.String,
    shopifyApiKey: java.lang.String,
    redirectUrl: java.lang.String
  ): stdLib.Promise[java.lang.String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[shopifyDashPrimeLib.distEnumsAuthUnderscoreScopeMod.AuthScope],
    shopifyDomain: java.lang.String,
    shopifyApiKey: java.lang.String,
    redirectUrl: java.lang.String,
    state: java.lang.String
  ): stdLib.Promise[java.lang.String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[shopifyDashPrimeLib.distEnumsAuthUnderscoreScopeMod.AuthScope],
    shopifyDomain: java.lang.String,
    shopifyApiKey: java.lang.String,
    redirectUrl: java.lang.String,
    state: java.lang.String,
    grants: js.Array[shopifyDashPrimeLib.distEnumsAuthUnderscoreGrantMod.AuthGrant]
  ): stdLib.Promise[java.lang.String] = js.native
  def isAuthenticProxyRequest(querystring: ScalablyTyped.runtime.StringDictionary[js.Any], shopifySecretKey: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def isAuthenticRequest(querystring: ScalablyTyped.runtime.StringDictionary[js.Any], shopifySecretKey: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def isAuthenticWebhook(
    headers: ScalablyTyped.runtime.StringDictionary[js.Any],
    requestBody: java.lang.String,
    shopifySecretKey: java.lang.String
  ): stdLib.Promise[scala.Boolean] = js.native
  def isAuthenticWebhook(headers: java.lang.String, requestBody: java.lang.String, shopifySecretKey: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def isValidShopifyDomain(shopifyDomain: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
}


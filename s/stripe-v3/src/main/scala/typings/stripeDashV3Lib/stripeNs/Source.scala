package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var card: js.UndefOr[Card] = js.undefined
  var client_secret: java.lang.String
  var created: scala.Double
  var currency: java.lang.String
  var id: java.lang.String
  var owner: stripeDashV3Lib.Anon_Address
  var redirect: js.UndefOr[stripeDashV3Lib.Anon_Status] = js.undefined
  var sepa_debit: js.UndefOr[stripeDashV3Lib.Anon_Bankcode] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var three_d_secure: js.UndefOr[stripeDashV3Lib.Anon_Authenticated] = js.undefined
}


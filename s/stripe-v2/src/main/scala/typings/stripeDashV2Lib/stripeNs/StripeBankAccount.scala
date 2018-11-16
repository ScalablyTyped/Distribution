package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeBankAccount extends js.Object {
  def createToken(
    params: StripeBankTokenParams,
    stripeResponseHandler: js.Function2[/* status */ scala.Double, /* response */ StripeBankTokenResponse, scala.Unit]
  ): scala.Unit = js.native
  def validateAccountNumber(accountNumber: java.lang.String, countryCode: java.lang.String): scala.Boolean = js.native
  def validateAccountNumber(accountNumber: scala.Double, countryCode: java.lang.String): scala.Boolean = js.native
  def validateRoutingNumber(routingNumber: java.lang.String, countryCode: java.lang.String): scala.Boolean = js.native
  def validateRoutingNumber(routingNumber: scala.Double, countryCode: java.lang.String): scala.Boolean = js.native
}


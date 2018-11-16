package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stripe extends js.Object {
  def createSource(element: stripeDashV3Lib.stripeNs.elementsNs.Element): stdLib.Promise[SourceResponse] = js.native
  def createSource(element: stripeDashV3Lib.stripeNs.elementsNs.Element, options: stripeDashV3Lib.Anon_Owner): stdLib.Promise[SourceResponse] = js.native
  def createSource(options: SourceOptions): stdLib.Promise[SourceResponse] = js.native
  def createToken(element: stripeDashV3Lib.stripeNs.elementsNs.Element): stdLib.Promise[TokenResponse] = js.native
  def createToken(element: stripeDashV3Lib.stripeNs.elementsNs.Element, options: TokenOptions): stdLib.Promise[TokenResponse] = js.native
  @JSName("createToken")
  def createToken_bank_account(name: stripeDashV3Lib.stripeDashV3LibStrings.bank_account, options: BankAccountTokenOptions): stdLib.Promise[TokenResponse] = js.native
  @JSName("createToken")
  def createToken_pii(name: stripeDashV3Lib.stripeDashV3LibStrings.pii, options: PiiTokenOptions): stdLib.Promise[TokenResponse] = js.native
  def elements(): stripeDashV3Lib.stripeNs.elementsNs.Elements = js.native
  def elements(options: stripeDashV3Lib.stripeNs.elementsNs.ElementsCreateOptions): stripeDashV3Lib.stripeNs.elementsNs.Elements = js.native
  def paymentRequest(options: stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequestOptions): stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequest = js.native
  def retrieveSource(options: RetrieveSourceOptions): stdLib.Promise[SourceResponse] = js.native
}


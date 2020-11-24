package typings.recurlyRecurlyJs.bankAccountMod

import typings.recurlyRecurlyJs.tokenMod.TokenHandler
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BankAccount extends js.Object {
  
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#recurlybankaccountbankinfo|BankInfo}
    */
  def bankInfo(bankInfoOptions: BankInfoOptions, BankInfoHandler: BankInfoHandler): Unit = js.native
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#recurlybankaccountbankinfo|BankInfo}
    */
  @JSName("bankInfo")
  var bankInfo_Original: BankInfo = js.native
  
  def token(data: BillingInfo, tokenHandler: TokenHandler): Unit = js.native
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#getting-a-token-1|Getting a token}
    */
  def token(data: HTMLFormElement, tokenHandler: TokenHandler): Unit = js.native
}

package typings.recurlyRecurlyJs.bankAccountMod

import typings.recurlyRecurlyJs.tokenMod.TokenHandler
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BankAccount extends js.Object {
  @JSName("bankInfo")
  var bankInfo_Original: BankInfo = js.native
  def bankInfo(bankInfoOptions: BankInfoOptions, BankInfoHandler: BankInfoHandler): Unit = js.native
  def token(data: BillingInfo, tokenHandler: TokenHandler): Unit = js.native
  def token(data: HTMLFormElement, tokenHandler: TokenHandler): Unit = js.native
}


package typings.stellarDashSdk.stellarDashSdkMod.Server

import typings.stellarDashSdk.stellarDashSdkMod.Horizon.AccountSigner
import typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server.AccountResponse")
@js.native
class AccountResponse protected () extends AccountRecord {
  def this(response: AccountRecord) = this()
  /* CompleteClass */
  override var _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ BaseResponse with js.Any = js.native
  @JSName("_links")
  var _links_AccountResponse: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.AccountResponse with js.Any = js.native
  var inflation_destination: js.UndefOr[js.Any] = js.native
  @JSName("signers")
  var signers_AccountResponse: js.Array[AccountSigner] = js.native
  def accountId(): String = js.native
  def incrementSequenceNumber(): Unit = js.native
  def sequenceNumber(): String = js.native
}


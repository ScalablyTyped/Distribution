package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TradeRecord
  extends BaseResponse[scala.Nothing] {
  
  def base(): js.Promise[AccountRecord] = js.native
  @JSName("base")
  var base_Original: CallFunction[AccountRecord] = js.native
  
  var base_account: String = js.native
  
  var base_amount: String = js.native
  
  var base_asset_code: js.UndefOr[String] = js.native
  
  var base_asset_issuer: js.UndefOr[String] = js.native
  
  var base_asset_type: String = js.native
  
  var base_is_seller: Boolean = js.native
  
  var base_offer_id: String = js.native
  
  def counter(): js.Promise[AccountRecord] = js.native
  @JSName("counter")
  var counter_Original: CallFunction[AccountRecord] = js.native
  
  var counter_account: String = js.native
  
  var counter_amount: String = js.native
  
  var counter_asset_code: js.UndefOr[String] = js.native
  
  var counter_asset_issuer: js.UndefOr[String] = js.native
  
  var counter_asset_type: String = js.native
  
  var counter_offer_id: String = js.native
  
  var id: String = js.native
  
  var ledger_close_time: String = js.native
  
  var offer_id: String = js.native
  
  def operation(): js.Promise[OperationRecord] = js.native
  @JSName("operation")
  var operation_Original: CallFunction[OperationRecord] = js.native
  
  var paging_token: String = js.native
}

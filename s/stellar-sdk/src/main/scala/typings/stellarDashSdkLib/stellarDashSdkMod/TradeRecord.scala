package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TradeRecord extends Record {
  @JSName("base")
  var base_Original: CallFunction[AccountRecord] = js.native
  var base_account: java.lang.String = js.native
  var base_amount: java.lang.String = js.native
  var base_asset_code: java.lang.String = js.native
  var base_asset_issuer: java.lang.String = js.native
  var base_asset_type: java.lang.String = js.native
  var base_is_seller: scala.Boolean = js.native
  @JSName("counter")
  var counter_Original: CallFunction[AccountRecord] = js.native
  var counter_account: java.lang.String = js.native
  var counter_amount: java.lang.String = js.native
  var counter_asset_code: java.lang.String = js.native
  var counter_asset_issuer: java.lang.String = js.native
  var counter_asset_type: java.lang.String = js.native
  var id: java.lang.String = js.native
  var ledger_close_time: java.lang.String = js.native
  @JSName("operation")
  var operation_Original: CallFunction[OperationRecord] = js.native
  var paging_token: java.lang.String = js.native
  def base(): stdLib.Promise[AccountRecord] = js.native
  def counter(): stdLib.Promise[AccountRecord] = js.native
  def operation(): stdLib.Promise[OperationRecord] = js.native
}


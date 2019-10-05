package typings.stellarDashSdk.stellarDashSdkMod.Server

import org.scalablytyped.runtime.StringDictionary
import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashSdk.Anon_Publickey
import typings.stellarDashSdk.Anon_Value
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.AccountThresholds
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.BalanceLine
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseResponse
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRecord
  extends BaseResponse[scala.Nothing] {
  var account_id: String = js.native
  var balances: js.Array[BalanceLine[AssetType]] = js.native
  var data_attr: StringDictionary[String] = js.native
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  var flags: Flags = js.native
  var id: String = js.native
  @JSName("offers")
  var offers_Original: CallCollectionFunction[OfferRecord] = js.native
  @JSName("operations")
  var operations_Original: CallCollectionFunction[OperationRecord] = js.native
  var paging_token: String = js.native
  @JSName("payments")
  var payments_Original: CallCollectionFunction[PaymentOperationRecord] = js.native
  var sequence: Double = js.native
  var signers: js.Array[Anon_Publickey] = js.native
  var subentry_count: Double = js.native
  var thresholds: AccountThresholds = js.native
  @JSName("trades")
  var trades_Original: CallCollectionFunction[TradeRecord] = js.native
  def data(options: Anon_Value): js.Promise[Anon_Value] = js.native
  def effects(): js.Promise[CollectionRecord[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[EffectRecord]] = js.native
  def offers(): js.Promise[CollectionRecord[OfferRecord]] = js.native
  def offers(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[OfferRecord]] = js.native
  def operations(): js.Promise[CollectionRecord[OperationRecord]] = js.native
  def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[OperationRecord]] = js.native
  def payments(): js.Promise[CollectionRecord[PaymentOperationRecord]] = js.native
  def payments(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[PaymentOperationRecord]] = js.native
  def trades(): js.Promise[CollectionRecord[TradeRecord]] = js.native
  def trades(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[TradeRecord]] = js.native
}


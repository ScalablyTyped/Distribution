package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRecord extends Record {
  var account_id: java.lang.String = js.native
  var balances: js.Array[BalanceLine] = js.native
  var data_attr: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  var flags: stellarDashSdkLib.Anon_Authrevocable = js.native
  var id: java.lang.String = js.native
  @JSName("offers")
  var offers_Original: CallCollectionFunction[OfferRecord] = js.native
  @JSName("operations")
  var operations_Original: CallCollectionFunction[OperationRecord] = js.native
  var paging_token: java.lang.String = js.native
  @JSName("payments")
  var payments_Original: CallCollectionFunction[PaymentOperationRecord] = js.native
  var sequence: scala.Double = js.native
  var signers: js.Array[stellarDashSdkLib.Anon_Weight] = js.native
  var subentry_count: scala.Double = js.native
  var thresholds: stellarDashSdkLib.Anon_Medthreshold = js.native
  @JSName("trades")
  var trades_Original: CallCollectionFunction[TradeRecord] = js.native
  def data(options: stellarDashSdkLib.Anon_Value): js.Promise[stellarDashSdkLib.Anon_Value] = js.native
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


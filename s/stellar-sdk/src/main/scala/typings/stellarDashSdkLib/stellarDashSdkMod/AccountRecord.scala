package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRecord extends Record {
  var account_id: java.lang.String = js.native
  var balances: js.Array[stellarDashSdkLib.Anon_Balance | stellarDashSdkLib.Anon_Assettype] = js.native
  var data_attr: ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
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
  def data(options: stellarDashSdkLib.Anon_Value): stdLib.Promise[stellarDashSdkLib.Anon_Value] = js.native
  def effects(): stdLib.Promise[CollectionRecord[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): stdLib.Promise[CollectionRecord[EffectRecord]] = js.native
  def offers(): stdLib.Promise[CollectionRecord[OfferRecord]] = js.native
  def offers(options: CallFunctionTemplateOptions): stdLib.Promise[CollectionRecord[OfferRecord]] = js.native
  def operations(): stdLib.Promise[CollectionRecord[OperationRecord]] = js.native
  def operations(options: CallFunctionTemplateOptions): stdLib.Promise[CollectionRecord[OperationRecord]] = js.native
  def payments(): stdLib.Promise[CollectionRecord[PaymentOperationRecord]] = js.native
  def payments(options: CallFunctionTemplateOptions): stdLib.Promise[CollectionRecord[PaymentOperationRecord]] = js.native
  def trades(): stdLib.Promise[CollectionRecord[TradeRecord]] = js.native
  def trades(options: CallFunctionTemplateOptions): stdLib.Promise[CollectionRecord[TradeRecord]] = js.native
}


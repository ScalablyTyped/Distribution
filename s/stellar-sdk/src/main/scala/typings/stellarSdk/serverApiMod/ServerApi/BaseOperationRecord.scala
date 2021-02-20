package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOperationRecord[T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */] extends BaseOperationResponse[T, TI] {
  
  def effects(): js.Promise[CollectionPage[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[EffectRecord]] = js.native
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  
  def precedes(): js.Promise[OperationRecord] = js.native
  @JSName("precedes")
  var precedes_Original: CallFunction[OperationRecord] = js.native
  
  def self(): js.Promise[OperationRecord] = js.native
  @JSName("self")
  var self_Original: CallFunction[OperationRecord] = js.native
  
  def succeeds(): js.Promise[OperationRecord] = js.native
  @JSName("succeeds")
  var succeeds_Original: CallFunction[OperationRecord] = js.native
  
  def transaction(): js.Promise[TransactionRecord] = js.native
  @JSName("transaction")
  var transaction_Original: CallFunction[TransactionRecord] = js.native
}

package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOperationRecord extends Record {
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  var id: java.lang.String = js.native
  var paging_token: java.lang.String = js.native
  @JSName("precedes")
  var precedes_Original: CallFunction[OperationRecord] = js.native
  @JSName("self")
  var self_Original: CallFunction[OperationRecord] = js.native
  @JSName("succeeds")
  var succeeds_Original: CallFunction[OperationRecord] = js.native
  @JSName("transaction")
  var transaction_Original: CallFunction[TransactionRecord] = js.native
  var `type`: java.lang.String = js.native
  var type_i: scala.Double = js.native
  def effects(): stdLib.Promise[CollectionRecord[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): stdLib.Promise[CollectionRecord[EffectRecord]] = js.native
  def precedes(): stdLib.Promise[OperationRecord] = js.native
  def self(): stdLib.Promise[OperationRecord] = js.native
  def succeeds(): stdLib.Promise[OperationRecord] = js.native
  def transaction(): stdLib.Promise[TransactionRecord] = js.native
}


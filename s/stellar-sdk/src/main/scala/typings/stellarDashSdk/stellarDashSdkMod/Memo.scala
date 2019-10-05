package typings.stellarDashSdk.stellarDashSdkMod

import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.MemoType
import typings.stellarDashBase.stellarDashBaseMod.MemoType.Hash
import typings.stellarDashBase.stellarDashBaseMod.MemoType.ID
import typings.stellarDashBase.stellarDashBaseMod.MemoType.None
import typings.stellarDashBase.stellarDashBaseMod.MemoType.Return
import typings.stellarDashBase.stellarDashBaseMod.MemoType.Text
import typings.stellarDashBase.stellarDashBaseMod.MemoValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Memo")
@js.native
class Memo[T /* <: MemoType */] protected ()
  extends typings.stellarDashBase.stellarDashBaseMod.Memo[T] {
  def this(`type`: None) = this()
  def this(`type`: T, value: MemoValue) = this()
  def this(`type`: Hash, value: String) = this()
  def this(`type`: Hash, value: Buffer) = this()
  def this(`type`: ID, value: String) = this()
  def this(`type`: Return, value: String) = this()
  def this(`type`: Return, value: Buffer) = this()
  def this(`type`: Text, value: String) = this()
}

/* static members */
@JSImport("stellar-sdk", "Memo")
@js.native
object Memo extends js.Object {
  def fromXDRObject(memo: typings.stellarDashBase.stellarDashBaseMod.xdr.Memo): typings.stellarDashBase.stellarDashBaseMod.Memo[MemoType] = js.native
  def hash(hash: String): typings.stellarDashBase.stellarDashBaseMod.Memo[Hash] = js.native
  def id(id: String): typings.stellarDashBase.stellarDashBaseMod.Memo[ID] = js.native
  def none(): typings.stellarDashBase.stellarDashBaseMod.Memo[None] = js.native
  def `return`(hash: String): typings.stellarDashBase.stellarDashBaseMod.Memo[Return] = js.native
  def text(text: String): typings.stellarDashBase.stellarDashBaseMod.Memo[Text] = js.native
}


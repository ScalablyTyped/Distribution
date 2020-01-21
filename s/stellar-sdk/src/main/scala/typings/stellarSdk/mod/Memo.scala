package typings.stellarSdk.mod

import typings.node.Buffer
import typings.stellarBase.mod.MemoType
import typings.stellarBase.mod.MemoType.Hash
import typings.stellarBase.mod.MemoType.ID
import typings.stellarBase.mod.MemoType.None
import typings.stellarBase.mod.MemoType.Return
import typings.stellarBase.mod.MemoType.Text
import typings.stellarBase.mod.MemoValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Memo")
@js.native
class Memo[T /* <: MemoType */] protected ()
  extends typings.stellarBase.mod.Memo[T] {
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
  def fromXDRObject(memo: typings.stellarBase.mod.xdr.Memo): typings.stellarBase.mod.Memo[MemoType] = js.native
  def hash(hash: String): typings.stellarBase.mod.Memo[Hash] = js.native
  def id(id: String): typings.stellarBase.mod.Memo[ID] = js.native
  def none(): typings.stellarBase.mod.Memo[None] = js.native
  def `return`(hash: String): typings.stellarBase.mod.Memo[Return] = js.native
  def text(text: String): typings.stellarBase.mod.Memo[Text] = js.native
}


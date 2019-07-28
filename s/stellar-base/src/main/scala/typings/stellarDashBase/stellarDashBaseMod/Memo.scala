package typings.stellarDashBase.stellarDashBaseMod

import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.MemoTypeNs.Hash
import typings.stellarDashBase.stellarDashBaseMod.MemoTypeNs.ID
import typings.stellarDashBase.stellarDashBaseMod.MemoTypeNs.None
import typings.stellarDashBase.stellarDashBaseMod.MemoTypeNs.Return
import typings.stellarDashBase.stellarDashBaseMod.MemoTypeNs.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Memo")
@js.native
class Memo[T /* <: MemoType */] protected () extends js.Object {
  def this(`type`: None) = this()
  def this(`type`: T, value: MemoValue) = this()
  def this(`type`: Hash, value: String) = this()
  def this(`type`: Hash, value: Buffer) = this()
  def this(`type`: ID, value: String) = this()
  def this(`type`: Return, value: String) = this()
  def this(`type`: Return, value: Buffer) = this()
  def this(`type`: Text, value: String) = this()
  var `type`: T = js.native
  var value: MemoValue | Buffer | String | Null = js.native
  def toXDRObject(): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Memo = js.native
}

/* static members */
@JSImport("stellar-base", "Memo")
@js.native
object Memo extends js.Object {
  def fromXDRObject(memo: typings.stellarDashBase.stellarDashBaseMod.xdrNs.Memo): Memo[MemoType] = js.native
  def hash(hash: String): Memo[Hash] = js.native
  def id(id: String): Memo[ID] = js.native
  def none(): Memo[None] = js.native
  def `return`(hash: String): Memo[Return] = js.native
  def text(text: String): Memo[Text] = js.native
}


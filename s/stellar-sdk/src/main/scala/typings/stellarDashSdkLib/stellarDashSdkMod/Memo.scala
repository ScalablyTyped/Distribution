package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Memo")
@js.native
class Memo[T /* <: stellarDashBaseLib.stellarDashBaseMod.MemoType */] protected ()
  extends stellarDashBaseLib.stellarDashBaseMod.Memo[T] {
  def this(`type`: stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.None) = this()
  def this(`type`: T, value: stellarDashBaseLib.stellarDashBaseMod.MemoValue) = this()
  def this(`type`: stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.Hash, value: java.lang.String) = this()
  def this(`type`: stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.Hash, value: nodeLib.Buffer) = this()
  def this(`type`: stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.ID, value: java.lang.String) = this()
  def this(`type`: stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.Return, value: java.lang.String) = this()
  def this(`type`: stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.Return, value: nodeLib.Buffer) = this()
  def this(`type`: stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.Text, value: java.lang.String) = this()
}

@JSImport("stellar-sdk", "Memo")
@js.native
object Memo extends js.Object {
  def fromXDRObject(memo: stellarDashBaseLib.stellarDashBaseMod.xdrNs.Memo): stellarDashBaseLib.stellarDashBaseMod.Memo[stellarDashBaseLib.stellarDashBaseMod.MemoType] = js.native
  def hash(hash: java.lang.String): stellarDashBaseLib.stellarDashBaseMod.Memo[stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.Hash] = js.native
  def id(id: java.lang.String): stellarDashBaseLib.stellarDashBaseMod.Memo[stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.ID] = js.native
  def none(): stellarDashBaseLib.stellarDashBaseMod.Memo[stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.None] = js.native
  def `return`(hash: java.lang.String): stellarDashBaseLib.stellarDashBaseMod.Memo[stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.Return] = js.native
  def text(text: java.lang.String): stellarDashBaseLib.stellarDashBaseMod.Memo[stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.Text] = js.native
}


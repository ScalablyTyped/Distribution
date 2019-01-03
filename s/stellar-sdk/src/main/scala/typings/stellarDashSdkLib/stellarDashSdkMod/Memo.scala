package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Memo")
@js.native
class Memo[T /* <: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNs.AnyType */] protected ()
  extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[T] {
  def this(`type`: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNone) = this()
  def this(`type`: T, value: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNs.AnyValue) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoHash, value: java.lang.String) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoHash, value: nodeLib.Buffer) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoID, value: java.lang.String) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoReturn, value: java.lang.String) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoReturn, value: nodeLib.Buffer) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoText, value: java.lang.String) = this()
}

@JSImport("stellar-sdk", "Memo")
@js.native
object Memo extends js.Object {
  def fromXDRObject(memo: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Memo): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNs.AnyType] = js.native
  def hash(hash: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoHash] = js.native
  def id(id: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoID] = js.native
  def none(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNone] = js.native
  def `return`(hash: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoReturn] = js.native
  def text(text: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoText] = js.native
}


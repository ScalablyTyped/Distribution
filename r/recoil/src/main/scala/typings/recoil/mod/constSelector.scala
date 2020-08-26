package typings.recoil.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recoil", "constSelector")
@js.native
object constSelector extends js.Object {
  def apply(constant: js.UndefOr[scala.Nothing]): RecoilValueReadOnly[js.UndefOr[scala.Nothing]] = js.native
  def apply(constant: String): RecoilValueReadOnly[String] = js.native
  def apply(constant: js.Array[SerializableParam]): RecoilValueReadOnly[js.Array[SerializableParam]] = js.native
  def apply(constant: js.Symbol): RecoilValueReadOnly[js.Symbol] = js.native
  def apply(constant: Boolean): RecoilValueReadOnly[Boolean] = js.native
  def apply(constant: Double): RecoilValueReadOnly[Double] = js.native
  def apply(constant: Null): RecoilValueReadOnly[Null] = js.native
  def apply[T /* <: StringDictionary[SerializableParam] */](constant: T): RecoilValueReadOnly[T] = js.native
}


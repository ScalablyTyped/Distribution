package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recoil", "selector")
@js.native
object selector extends js.Object {
  def apply[T](options: ReadOnlySelectorOptions[T]): RecoilValueReadOnly[T] = js.native
  def apply[T](options: ReadWriteSelectorOptions[T]): RecoilState[T] = js.native
}


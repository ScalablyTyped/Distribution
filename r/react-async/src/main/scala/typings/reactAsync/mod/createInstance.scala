package typings.reactAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", "createInstance")
@js.native
object createInstance extends js.Object {
  def apply[T](): AsyncConstructor[T] = js.native
  def apply[T](defaultOptions: AsyncProps[T]): AsyncConstructor[T] = js.native
  def apply[T](defaultOptions: AsyncProps[T], displayName: String): AsyncConstructor[T] = js.native
}


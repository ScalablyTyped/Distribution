package typings.reactAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", "createInstance")
@js.native
object createInstance extends js.Object {
  /**
    * createInstance allows you to create instances of Async that are bound to a specific promise.
    * A unique instance also uses its own React context for better nesting capability.
    */
  def apply[T](): AsyncConstructor[T] = js.native
  def apply[T](defaultOptions: js.UndefOr[scala.Nothing], displayName: String): AsyncConstructor[T] = js.native
  def apply[T](defaultOptions: AsyncProps[T]): AsyncConstructor[T] = js.native
  def apply[T](defaultOptions: AsyncProps[T], displayName: String): AsyncConstructor[T] = js.native
}


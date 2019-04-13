package typings
package ramdaLib.ramdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  def apply[T](fn: js.Function1[/* value */ T, scala.Boolean]): FilterOnceApplied[T] = js.native
  def apply[T](fn: js.Function1[/* value */ T, scala.Boolean], list: js.Array[T]): js.Array[T] = js.native
  def apply[T](fn: js.Function1[/* value */ T, scala.Boolean], obj: Dictionary[T]): Dictionary[T] = js.native
}


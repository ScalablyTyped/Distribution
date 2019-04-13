package typings
package ramdaLib.ramdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOnceApplied[T] extends js.Object {
  def apply(list: js.Array[T]): js.Array[T] = js.native
  def apply(obj: Dictionary[T]): Dictionary[T] = js.native
}


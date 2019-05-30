package typings
package rsvpLib.rsvpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "race")
@js.native
object race extends js.Object {
  def apply[T](values: js.Array[T]): js.Promise[T] = js.native
  def apply[T](values: stdLib.Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
}


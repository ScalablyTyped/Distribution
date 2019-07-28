package typings.rsvp.rsvpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "asap")
@js.native
object asap extends js.Object {
  def apply[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
}


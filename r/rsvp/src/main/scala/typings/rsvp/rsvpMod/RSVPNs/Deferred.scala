package typings.rsvp.rsvpMod.RSVPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[T] extends js.Object {
  var promise: typings.rsvp.rsvpMod.RSVPNs.Promise[T] = js.native
  def reject(): Unit = js.native
  def reject(reason: js.Any): Unit = js.native
  def resolve(): Unit = js.native
  def resolve(value: Arg[T]): Unit = js.native
}


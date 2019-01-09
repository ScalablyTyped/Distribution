package typings
package rsvpLib.rsvpMod.RSVPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[T] extends js.Object {
  var promise: Promise[T] = js.native
  def reject(): scala.Unit = js.native
  def reject(reason: js.Any): scala.Unit = js.native
  def resolve(): scala.Unit = js.native
  def resolve(value: Arg[T]): scala.Unit = js.native
}


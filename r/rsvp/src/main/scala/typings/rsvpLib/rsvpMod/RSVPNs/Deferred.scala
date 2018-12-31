package typings
package rsvpLib.rsvpMod.RSVPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred[T] extends js.Object {
  var promise: Promise[T]
  var reject: js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit]
  var resolve: js.Function1[/* value */ js.UndefOr[Arg[T]], scala.Unit]
}


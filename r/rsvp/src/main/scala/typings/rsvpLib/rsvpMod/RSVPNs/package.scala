package typings
package rsvpLib.rsvpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RSVPNs {
  // All the Promise methods essentially flatten existing promises, so that
  // you don't end up with `Promise<Promise<Promise<string>>>` if you happen
  // to return another `Promise` from a `.then()` invocation, etc. So all of
  // them can take a type or a promise-like/then-able type.
  type Arg[T] = T | js.Thenable[T]
  type PromiseState[T] = _PromiseState[T] | Rejected[js.Any]
}

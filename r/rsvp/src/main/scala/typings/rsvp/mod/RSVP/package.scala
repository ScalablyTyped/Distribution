package typings.rsvp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RSVP {
  // All the Promise methods essentially flatten existing promises, so that
  // you don't end up with `Promise<Promise<Promise<string>>>` if you happen
  // to return another `Promise` from a `.then()` invocation, etc. So all of
  // them can take a type or a promise-like/then-able type.
  type Arg[T] = T | js.Thenable[T]
  /* Rewritten from type alias, can be one of: 
    - typings.rsvp.mod.RSVP.Resolved[T]
    - typings.rsvp.mod.RSVP.Rejected[js.Any]
    - typings.rsvp.mod.RSVP.Pending
  */
  type PromiseState[T] = typings.rsvp.mod.RSVP._PromiseState[T] | typings.rsvp.mod.RSVP.Rejected[js.Any]
}

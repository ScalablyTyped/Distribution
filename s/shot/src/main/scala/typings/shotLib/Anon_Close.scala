package typings
package shotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  /** whether the request will emit a close event. Defaults to undefined, meaning no close event will be emitted. */
  var close: js.UndefOr[scala.Boolean] = js.undefined
  /** indicates whether the request will fire an end event. Defaults to undefined, meaning an end event will fire. */
  var end: js.UndefOr[scala.Boolean] = js.undefined
  /** whether the request will emit an error event. Defaults to undefined, meaning no error event will be emitted. If set to true, the emitted error will have a message of 'Simulated'. */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /** indicates whether the request payload will be split into chunks. Defaults to `undefined`, meaning payload will not be chunked. */
  var split: js.UndefOr[scala.Boolean] = js.undefined
}


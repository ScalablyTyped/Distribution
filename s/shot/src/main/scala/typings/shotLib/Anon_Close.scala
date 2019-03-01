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

object Anon_Close {
  @scala.inline
  def apply(
    close: js.UndefOr[scala.Boolean] = js.undefined,
    end: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    split: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Close = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split)
    __obj.asInstanceOf[Anon_Close]
  }
}


package typings
package promptlyLib.promptlyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var input: js.UndefOr[nodeLib.NodeJSNs.ReadableStream] = js.undefined
  var output: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var retry: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var trim: js.UndefOr[scala.Boolean] = js.undefined
  var validator: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    default: java.lang.String = null,
    input: nodeLib.NodeJSNs.ReadableStream = null,
    output: nodeLib.NodeJSNs.WritableStream = null,
    retry: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    validator: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (input != null) __obj.updateDynamic("input")(input)
    if (output != null) __obj.updateDynamic("output")(output)
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[Options]
  }
}


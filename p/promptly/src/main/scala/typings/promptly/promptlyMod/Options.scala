package typings.promptly.promptlyMod

import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[ReadableStream] = js.undefined
  var output: js.UndefOr[WritableStream] = js.undefined
  var replace: js.UndefOr[String] = js.undefined
  var retry: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
  var validator: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    default: String = null,
    input: ReadableStream = null,
    output: WritableStream = null,
    replace: String = null,
    retry: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined,
    validator: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (input != null) __obj.updateDynamic("input")(input)
    if (output != null) __obj.updateDynamic("output")(output)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[Options]
  }
}


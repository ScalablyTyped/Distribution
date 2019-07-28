package typings.read.readMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var edit: js.UndefOr[Boolean] = js.undefined
  var input: js.UndefOr[js.Any] = js.undefined
  var output: js.UndefOr[js.Any] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var replace: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var terminal: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    default: String = null,
    edit: js.UndefOr[Boolean] = js.undefined,
    input: js.Any = null,
    output: js.Any = null,
    prompt: String = null,
    replace: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    terminal: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(edit)) __obj.updateDynamic("edit")(edit)
    if (input != null) __obj.updateDynamic("input")(input)
    if (output != null) __obj.updateDynamic("output")(output)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


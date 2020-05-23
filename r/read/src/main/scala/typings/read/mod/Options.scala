package typings.read.mod

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
    timeout: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(edit)) __obj.updateDynamic("edit")(edit.get.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


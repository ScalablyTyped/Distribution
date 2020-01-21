package typings.pythonShell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var parser: js.UndefOr[String] = js.undefined
  var pythonOptions: js.UndefOr[js.Array[String]] = js.undefined
  var pythonPath: js.UndefOr[String] = js.undefined
  var scriptPath: js.UndefOr[String] = js.undefined
}

object RunOptions {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    encoding: String = null,
    formatter: String = null,
    mode: String = null,
    parser: String = null,
    pythonOptions: js.Array[String] = null,
    pythonPath: String = null,
    scriptPath: String = null
  ): RunOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (pythonOptions != null) __obj.updateDynamic("pythonOptions")(pythonOptions.asInstanceOf[js.Any])
    if (pythonPath != null) __obj.updateDynamic("pythonPath")(pythonPath.asInstanceOf[js.Any])
    if (scriptPath != null) __obj.updateDynamic("scriptPath")(scriptPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOptions]
  }
}


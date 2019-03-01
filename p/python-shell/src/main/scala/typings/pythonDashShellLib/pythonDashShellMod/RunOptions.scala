package typings
package pythonDashShellLib.pythonDashShellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var formatter: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var parser: js.UndefOr[java.lang.String] = js.undefined
  var pythonOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var pythonPath: js.UndefOr[java.lang.String] = js.undefined
  var scriptPath: js.UndefOr[java.lang.String] = js.undefined
}

object RunOptions {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    encoding: java.lang.String = null,
    formatter: java.lang.String = null,
    mode: java.lang.String = null,
    parser: java.lang.String = null,
    pythonOptions: js.Array[java.lang.String] = null,
    pythonPath: java.lang.String = null,
    scriptPath: java.lang.String = null
  ): RunOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (pythonOptions != null) __obj.updateDynamic("pythonOptions")(pythonOptions)
    if (pythonPath != null) __obj.updateDynamic("pythonPath")(pythonPath)
    if (scriptPath != null) __obj.updateDynamic("scriptPath")(scriptPath)
    __obj.asInstanceOf[RunOptions]
  }
}


package typings.snykPythonPlugin.dependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PythonInspectOptions extends js.Object {
  var allowMissing: js.UndefOr[Boolean] = js.undefined
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var command: js.UndefOr[String] = js.undefined
}

object PythonInspectOptions {
  @scala.inline
  def apply(
    allowMissing: js.UndefOr[Boolean] = js.undefined,
    args: js.Array[String] = null,
    command: String = null
  ): PythonInspectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMissing)) __obj.updateDynamic("allowMissing")(allowMissing.get.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    __obj.asInstanceOf[PythonInspectOptions]
  }
}


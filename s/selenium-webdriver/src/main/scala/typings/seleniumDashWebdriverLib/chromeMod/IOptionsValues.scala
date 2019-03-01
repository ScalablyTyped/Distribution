package typings
package seleniumDashWebdriverLib.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionsValues extends js.Object {
  var args: js.Array[java.lang.String]
  var binary: js.UndefOr[java.lang.String] = js.undefined
  var detach: scala.Boolean
  var extensions: js.Array[java.lang.String]
  var localState: js.UndefOr[js.Any] = js.undefined
  var logFile: js.UndefOr[java.lang.String] = js.undefined
  var prefs: js.UndefOr[js.Any] = js.undefined
}

object IOptionsValues {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String],
    detach: scala.Boolean,
    extensions: js.Array[java.lang.String],
    binary: java.lang.String = null,
    localState: js.Any = null,
    logFile: java.lang.String = null,
    prefs: js.Any = null
  ): IOptionsValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("detach")(detach)
    __obj.updateDynamic("extensions")(extensions)
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (localState != null) __obj.updateDynamic("localState")(localState)
    if (logFile != null) __obj.updateDynamic("logFile")(logFile)
    if (prefs != null) __obj.updateDynamic("prefs")(prefs)
    __obj.asInstanceOf[IOptionsValues]
  }
}


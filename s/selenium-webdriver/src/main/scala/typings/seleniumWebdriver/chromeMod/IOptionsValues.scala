package typings.seleniumWebdriver.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionsValues extends js.Object {
  var args: js.Array[String]
  var binary: js.UndefOr[String] = js.undefined
  var detach: Boolean
  var extensions: js.Array[String]
  var localState: js.UndefOr[js.Any] = js.undefined
  var logFile: js.UndefOr[String] = js.undefined
  var prefs: js.UndefOr[js.Any] = js.undefined
}

object IOptionsValues {
  @scala.inline
  def apply(
    args: js.Array[String],
    detach: Boolean,
    extensions: js.Array[String],
    binary: String = null,
    localState: js.Any = null,
    logFile: String = null,
    prefs: js.Any = null
  ): IOptionsValues = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], detach = detach.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (localState != null) __obj.updateDynamic("localState")(localState.asInstanceOf[js.Any])
    if (logFile != null) __obj.updateDynamic("logFile")(logFile.asInstanceOf[js.Any])
    if (prefs != null) __obj.updateDynamic("prefs")(prefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptionsValues]
  }
}


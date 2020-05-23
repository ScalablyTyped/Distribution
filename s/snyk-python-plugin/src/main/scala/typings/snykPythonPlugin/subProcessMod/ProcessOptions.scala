package typings.snykPythonPlugin.subProcessMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[StringDictionary[String]] = js.undefined
}

object ProcessOptions {
  @scala.inline
  def apply(cwd: String = null, env: StringDictionary[String] = null): ProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessOptions]
  }
}


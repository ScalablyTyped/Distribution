package typings
package scriptDashExtDashHtmlDashWebpackDashPluginLib.scriptDashExtDashHtmlDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Custom extends js.Object {
  var attribute: java.lang.String
  var test: ScriptMatchingPattern
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Custom {
  @scala.inline
  def apply(attribute: java.lang.String, test: ScriptMatchingPattern, value: java.lang.String = null): Custom = {
    val __obj = js.Dynamic.literal(attribute = attribute, test = test.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Custom]
  }
}


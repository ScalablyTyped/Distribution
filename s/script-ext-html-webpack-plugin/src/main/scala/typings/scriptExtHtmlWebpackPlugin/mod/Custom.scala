package typings.scriptExtHtmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Custom extends js.Object {
  var attribute: String
  var test: ScriptMatchingPattern
  var value: js.UndefOr[String] = js.undefined
}

object Custom {
  @scala.inline
  def apply(attribute: String, test: ScriptMatchingPattern, value: String = null): Custom = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
}


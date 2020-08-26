package typings.scriptExtHtmlWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Custom extends js.Object {
  var attribute: String = js.native
  var test: ScriptMatchingPattern = js.native
  var value: js.UndefOr[String] = js.native
}

object Custom {
  @scala.inline
  def apply(attribute: String, test: ScriptMatchingPattern): Custom = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
  @scala.inline
  implicit class CustomOps[Self <: Custom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestVarargs(value: (String | RegExp)*): Self = this.set("test", js.Array(value :_*))
    @scala.inline
    def setTest(value: ScriptMatchingPattern): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


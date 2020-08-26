package typings.stringReplaceWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplacementItem extends js.Object {
  /**
    * a regex to match against the file contents
    */
  var pattern: RegExp = js.native
  /**
    * an ECMAScript string replacement function
    * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace#Specifying_a_function_as_a_parameter
    */
  def replacement(substring: String, args: js.Any*): String = js.native
}

object ReplacementItem {
  @scala.inline
  def apply(pattern: RegExp, replacement: (String, /* repeated */ js.Any) => String): ReplacementItem = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], replacement = js.Any.fromFunction2(replacement))
    __obj.asInstanceOf[ReplacementItem]
  }
  @scala.inline
  implicit class ReplacementItemOps[Self <: ReplacementItem] (val x: Self) extends AnyVal {
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
    def setPattern(value: RegExp): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacement(value: (String, /* repeated */ js.Any) => String): Self = this.set("replacement", js.Any.fromFunction2(value))
  }
  
}


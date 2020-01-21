package typings.stringReplaceWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplacementItem extends js.Object {
  /**
    * a regex to match against the file contents
    */
  var pattern: RegExp
  /**
    * an ECMAScript string replacement function
    * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace#Specifying_a_function_as_a_parameter
    */
  def replacement(substring: String, args: js.Any*): String
}

object ReplacementItem {
  @scala.inline
  def apply(pattern: RegExp, replacement: (String, /* repeated */ js.Any) => String): ReplacementItem = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], replacement = js.Any.fromFunction2(replacement))
  
    __obj.asInstanceOf[ReplacementItem]
  }
}


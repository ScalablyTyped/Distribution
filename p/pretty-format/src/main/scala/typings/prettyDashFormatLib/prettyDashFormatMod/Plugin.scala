package typings
package prettyDashFormatLib.prettyDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  def print(value: js.Any, serialize: Print, indent: Indent, options: Options, colors: Colors): java.lang.String
  def test(value: js.Any): scala.Boolean
}

object Plugin {
  @scala.inline
  def apply(print: (js.Any, Print, Indent, Options, Colors) => java.lang.String, test: js.Any => scala.Boolean): Plugin = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction5(print), test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[Plugin]
  }
}


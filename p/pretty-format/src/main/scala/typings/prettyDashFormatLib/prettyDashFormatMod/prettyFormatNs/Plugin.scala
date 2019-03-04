package typings
package prettyDashFormatLib.prettyDashFormatMod.prettyFormatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  def print(value: js.Any, serialize: Print, indent: Indent, options: Options, colors: Colors): java.lang.String
  def test(value: js.Any): scala.Boolean
}

object Plugin {
  @scala.inline
  def apply(
    print: js.Function5[js.Any, Print, Indent, Options, Colors, java.lang.String],
    test: js.Function1[js.Any, scala.Boolean]
  ): Plugin = {
    val __obj = js.Dynamic.literal(print = print, test = test)
  
    __obj.asInstanceOf[Plugin]
  }
}


package typings.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.prettyFormat.typesMod.NewPlugin
  - typings.prettyFormat.typesMod.OldPlugin
*/
trait Plugin extends js.Object

object Plugin {
  @scala.inline
  def NewPlugin(
    serialize: (js.Any, Config, String, Double, Refs, Printer) => String,
    test: /* arg0 */ js.Any => Boolean
  ): Plugin = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction6(serialize), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  def OldPlugin(
    print: (js.Any, Print, Indent, PluginOptions, Colors) => String,
    test: /* arg0 */ js.Any => Boolean
  ): Plugin = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction5(print), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[Plugin]
  }
}


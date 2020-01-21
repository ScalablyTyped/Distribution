package typings.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldPlugin extends Plugin {
  var test: Test
  def print(`val`: js.Any, print: Print, indent: Indent, options: PluginOptions, colors: Colors): String
}

object OldPlugin {
  @scala.inline
  def apply(
    print: (js.Any, Print, Indent, PluginOptions, Colors) => String,
    test: /* arg0 */ js.Any => Boolean
  ): OldPlugin = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction5(print), test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[OldPlugin]
  }
}


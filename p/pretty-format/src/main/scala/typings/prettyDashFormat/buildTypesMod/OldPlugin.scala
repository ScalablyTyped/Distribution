package typings.prettyDashFormat.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldPlugin extends Plugin {
  var test: Test
  def print(`val`: js.Any, print: Print, indent: Indent, options: PluginOptions, colors: Colors): String
}

object OldPlugin {
  @scala.inline
  def apply(print: (js.Any, Print, Indent, PluginOptions, Colors) => String, test: Test): OldPlugin = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction5(print), test = test)
  
    __obj.asInstanceOf[OldPlugin]
  }
}


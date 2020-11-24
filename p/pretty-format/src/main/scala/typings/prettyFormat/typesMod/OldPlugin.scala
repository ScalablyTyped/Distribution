package typings.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldPlugin extends Plugin {
  
  def print(`val`: js.Any, print: Print, indent: Indent, options: PluginOptions, colors: Colors): String = js.native
  
  var test: Test = js.native
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
  
  @scala.inline
  implicit class OldPluginOps[Self <: OldPlugin] (val x: Self) extends AnyVal {
    
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
    def setPrint(value: (js.Any, Print, Indent, PluginOptions, Colors) => String): Self = this.set("print", js.Any.fromFunction5(value))
    
    @scala.inline
    def setTest(value: /* arg0 */ js.Any => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
  }
}

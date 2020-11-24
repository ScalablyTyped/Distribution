package typings.remarkable.anon

import typings.remarkable.libMod.InlineParsingRule
import typings.remarkable.rulerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ruler extends js.Object {
  
  var ruler: ^[InlineParsingRule] = js.native
}
object Ruler {
  
  @scala.inline
  def apply(ruler: ^[InlineParsingRule]): Ruler = {
    val __obj = js.Dynamic.literal(ruler = ruler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruler]
  }
  
  @scala.inline
  implicit class RulerOps[Self <: Ruler] (val x: Self) extends AnyVal {
    
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
    def setRuler(value: ^[InlineParsingRule]): Self = this.set("ruler", value.asInstanceOf[js.Any])
  }
}

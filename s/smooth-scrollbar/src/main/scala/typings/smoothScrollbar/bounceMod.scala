package typings.smoothScrollbar

import typings.smoothScrollbar.anon.X
import typings.smoothScrollbar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/plugins/overscroll/bounce", JSImport.Namespace)
@js.native
object bounceMod extends js.Object {
  
  @js.native
  class Bounce protected () extends js.Object {
    def this(_scrollbar: default) = this()
    
    var _scrollbar: js.Any = js.native
    
    def render(hasXY: X): Unit = js.native
  }
}

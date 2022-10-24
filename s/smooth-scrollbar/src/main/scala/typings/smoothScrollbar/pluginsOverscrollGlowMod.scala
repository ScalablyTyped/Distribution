package typings.smoothScrollbar

import typings.smoothScrollbar.anon.X
import typings.smoothScrollbar.mod.default
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsOverscrollGlowMod {
  
  @JSImport("smooth-scrollbar/plugins/overscroll/glow", "Glow")
  @js.native
  open class Glow protected () extends StObject {
    def this(_scrollbar: default) = this()
    
    /* private */ var _canvas: Any = js.native
    
    /* private */ var _ctx: Any = js.native
    
    /* private */ var _getMaxOverscroll: Any = js.native
    
    /* private */ var _renderX: Any = js.native
    
    /* private */ var _renderY: Any = js.native
    
    /* private */ var _scrollbar: Any = js.native
    
    /* private */ var _touchX: Any = js.native
    
    /* private */ var _touchY: Any = js.native
    
    def adjust(): Unit = js.native
    
    def mount(): Unit = js.native
    
    def recordTouch(event: TouchEvent): Unit = js.native
    
    def render(param0: X, color: String): Unit = js.native
    
    def unmount(): Unit = js.native
  }
}

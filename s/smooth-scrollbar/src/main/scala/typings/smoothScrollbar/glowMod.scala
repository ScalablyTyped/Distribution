package typings.smoothScrollbar

import typings.smoothScrollbar.anon.X
import typings.smoothScrollbar.mod.default
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glowMod {
  
  @JSImport("smooth-scrollbar/plugins/overscroll/glow", "Glow")
  @js.native
  class Glow protected () extends StObject {
    def this(_scrollbar: default) = this()
    
    /* private */ var _canvas: js.Any = js.native
    
    /* private */ var _ctx: js.Any = js.native
    
    /* private */ var _getMaxOverscroll: js.Any = js.native
    
    /* private */ var _renderX: js.Any = js.native
    
    /* private */ var _renderY: js.Any = js.native
    
    /* private */ var _scrollbar: js.Any = js.native
    
    /* private */ var _touchX: js.Any = js.native
    
    /* private */ var _touchY: js.Any = js.native
    
    def adjust(): Unit = js.native
    
    def mount(): Unit = js.native
    
    def recordTouch(event: TouchEvent): Unit = js.native
    
    def render(hasXY: X, color: String): Unit = js.native
    
    def unmount(): Unit = js.native
  }
}

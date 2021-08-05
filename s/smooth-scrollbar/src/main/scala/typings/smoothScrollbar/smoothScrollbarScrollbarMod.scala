package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollbarOptions
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smoothScrollbarScrollbarMod {
  
  @JSImport("smooth-scrollbar/scrollbar", "Scrollbar")
  @js.native
  class Scrollbar protected ()
    extends StObject
       with typings.smoothScrollbar.scrollbarMod.Scrollbar {
    def this(containerEl: HTMLElement) = this()
    def this(containerEl: HTMLElement, options: PartialScrollbarOptions) = this()
    
    /* private */ var _init: js.Any = js.native
    
    /* private */ var _listeners: js.Any = js.native
    
    /* private */ var _momentum: js.Any = js.native
    
    /* private */ var _nextTick: js.Any = js.native
    
    /* private */ var _observer: js.Any = js.native
    
    /* private */ var _plugins: js.Any = js.native
    
    /* private */ var _render: js.Any = js.native
    
    /* private */ var _renderID: js.Any = js.native
    
    /* private */ var _shouldPropagateMomentum: js.Any = js.native
    
    /* private */ var _updateDebounced: js.Any = js.native
  }
  
  @JSImport("smooth-scrollbar/scrollbar", "scrollbarMap")
  @js.native
  val scrollbarMap: Map[HTMLElement, Scrollbar] = js.native
}

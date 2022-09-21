package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollbarOptions
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("smooth-scrollbar/options", "Options")
  @js.native
  open class Options () extends StObject {
    def this(config: PartialScrollbarOptions) = this()
    
    /**
      * Keep scrollbar tracks visible
      */
    var alwaysShowTracks: Boolean = js.native
    
    /**
      * Set to `true` to allow outer scrollbars continue scrolling
      * when current scrollbar reaches edge.
      */
    var continuousScrolling: Boolean = js.native
    
    /**
      * Momentum reduction damping factor, a float value between `(0, 1)`.
      * The lower the value is, the more smooth the scrolling will be
      * (also the more paint frames).
      */
    var damping: Double = js.native
    
    /**
      * Delegate wheel events and touch events to the given element.
      * By default, the container element is used.
      * This option will be useful for dealing with fixed elements.
      */
    var delegateTo: EventTarget | Null = js.native
    
    /**
      * Options for plugins. Syntax:
      *   plugins[pluginName] = pluginOptions: any
      */
    val plugins: Any = js.native
    
    /**
      * Render every frame in integer pixel values
      * set to `true` to improve scrolling performance.
      */
    var renderByPixels: Boolean = js.native
    
    /**
      * Minimal size for scrollbar thumbs.
      */
    var thumbMinSize: Double = js.native
    
    var wheelEventTarget: EventTarget | Null = js.native
  }
}

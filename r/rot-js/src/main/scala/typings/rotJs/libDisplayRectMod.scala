package typings.rotJs

import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.libDisplayTypesMod.DisplayData
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDisplayRectMod {
  
  @JSImport("rot-js/lib/display/rect", JSImport.Default)
  @js.native
  open class default () extends Rect
  /* static members */
  object default {
    
    @JSImport("rot-js/lib/display/rect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rot-js/lib/display/rect", "default.cache")
    @js.native
    def cache: Boolean = js.native
    inline def cache_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Rect
    extends typings.rotJs.libDisplayCanvasMod.default {
    
    var _canvasCache: StringDictionary[HTMLCanvasElement] = js.native
    
    def _drawNoCache(data: DisplayData, clearBefore: Boolean): Unit = js.native
    
    def _drawWithCache(data: DisplayData): Unit = js.native
    
    var _spacingX: Double = js.native
    
    var _spacingY: Double = js.native
  }
}

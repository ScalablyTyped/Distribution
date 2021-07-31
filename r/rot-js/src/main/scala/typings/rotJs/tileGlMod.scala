package typings.rotJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLImageElement
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileGlMod {
  
  @JSImport("rot-js/lib/display/tile-gl", JSImport.Default)
  @js.native
  class default () extends TileGL
  /* static members */
  object default {
    
    @JSImport("rot-js/lib/display/tile-gl", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait TileGL
    extends typings.rotJs.backendMod.default {
    
    var _gl: WebGLRenderingContext = js.native
    
    def _initWebGL(): WebGLRenderingContext = js.native
    
    def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
    
    var _program: WebGLProgram = js.native
    
    var _uniforms: StringDictionary[WebGLUniformLocation | Null] = js.native
    
    def _updateSize(): Unit = js.native
    
    def _updateTexture(tileSet: HTMLImageElement): Unit = js.native
    
    def computeFontSize(): Double = js.native
  }
}

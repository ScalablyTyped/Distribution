package typings.requestAnimationFramePolyfill

import typings.requestAnimationFramePolyfill.distRequestAnimationFramePolyfillMod.TCancelAnimationFrame
import typings.requestAnimationFramePolyfill.distRequestAnimationFramePolyfillMod.TRequestAnimationFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("request-animation-frame-polyfill", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def cancelAnimationFrame(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimationFrame")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def requestAnimationFrame(callback: js.Function): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("request-animation-frame-polyfill", "cancelAnimationFrame")
  @js.native
  val cancelAnimationFrame: TCancelAnimationFrame = js.native
  
  @JSImport("request-animation-frame-polyfill", "requestAnimationFrame")
  @js.native
  val requestAnimationFrame: TRequestAnimationFrame = js.native
}

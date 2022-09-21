package typings.requestAnimationFramePolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestAnimationFramePolyfillMod {
  
  @JSImport("request-animation-frame-polyfill/dist/request-animation-frame-polyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("request-animation-frame-polyfill/dist/request-animation-frame-polyfill", "caf")
  @js.native
  val caf: TCancelAnimationFrame = js.native
  
  inline def pnow(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pnow")().asInstanceOf[Double]
  
  @JSImport("request-animation-frame-polyfill/dist/request-animation-frame-polyfill", "raf")
  @js.native
  val raf: TRequestAnimationFrame = js.native
  
  @JSImport("request-animation-frame-polyfill/dist/request-animation-frame-polyfill", "root")
  @js.native
  val root: Any = js.native
  
  type TCancelAnimationFrame = js.Function1[/* id */ Double, Unit]
  
  type TRequestAnimationFrame = js.Function1[/* callback */ js.Function, Double]
}

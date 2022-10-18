package typings.ssimJs

import typings.ssimJs.distTypesMod.Matrix
import typings.ssimJs.distTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSsimMod {
  
  @JSImport("ssim.js/dist/ssim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ssim(pixels1: Matrix, pixels2: Matrix, options: Options): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("ssim")(pixels1.asInstanceOf[js.Any], pixels2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}

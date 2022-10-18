package typings.ssimJs

import typings.ssimJs.distTypesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabOnesMod {
  
  @JSImport("ssim.js/dist/matlab/ones", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ones(height: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")(height.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def ones(height: Double, width: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}

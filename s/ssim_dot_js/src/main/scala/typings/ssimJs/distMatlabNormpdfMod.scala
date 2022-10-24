package typings.ssimJs

import typings.ssimJs.distTypesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabNormpdfMod {
  
  @JSImport("ssim.js/dist/matlab/normpdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normpdf(param0: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(param0.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def normpdf(param0: Matrix, µ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(param0.asInstanceOf[js.Any], µ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def normpdf(param0: Matrix, µ: Double, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(param0.asInstanceOf[js.Any], µ.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def normpdf(param0: Matrix, µ: Unit, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(param0.asInstanceOf[js.Any], µ.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}

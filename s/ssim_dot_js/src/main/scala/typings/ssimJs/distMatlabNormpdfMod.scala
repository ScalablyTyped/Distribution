package typings.ssimJs

import typings.ssimJs.distTypesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabNormpdfMod {
  
  @JSImport("ssim.js/dist/matlab/normpdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normpdf(hasRefWidthHeight: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(hasRefWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def normpdf(hasRefWidthHeight: Matrix, µ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(hasRefWidthHeight.asInstanceOf[js.Any], µ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def normpdf(hasRefWidthHeight: Matrix, µ: Double, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(hasRefWidthHeight.asInstanceOf[js.Any], µ.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def normpdf(hasRefWidthHeight: Matrix, µ: Unit, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(hasRefWidthHeight.asInstanceOf[js.Any], µ.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}

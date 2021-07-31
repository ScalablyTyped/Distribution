package typings.ssimJs

import typings.ssimJs.typesMod.Matrix
import typings.ssimJs.typesMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filter2Mod {
  
  @JSImport("ssim.js/dist/matlab/filter2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filter2(h: Matrix, X: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2")(h.asInstanceOf[js.Any], X.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  @scala.inline
  def filter2(h: Matrix, X: Matrix, shape: Shape): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2")(h.asInstanceOf[js.Any], X.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}

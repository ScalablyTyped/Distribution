package typings.ssimJs

import typings.ssimJs.typesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zerosMod {
  
  @JSImport("ssim.js/dist/matlab/zeros", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def zeros(height: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(height.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  @scala.inline
  def zeros(height: Double, width: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}

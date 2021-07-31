package typings.ssimJs

import typings.ssimJs.ssimJsStrings.gaussian
import typings.ssimJs.typesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fspecialMod {
  
  @JSImport("ssim.js/dist/matlab/fspecial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fspecial(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")().asInstanceOf[Matrix]
  @scala.inline
  def fspecial(_type: Unit, hsize: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  @scala.inline
  def fspecial(_type: Unit, hsize: Double, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  @scala.inline
  def fspecial(_type: Unit, hsize: Unit, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  @scala.inline
  def fspecial_gaussian(_type: gaussian): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  @scala.inline
  def fspecial_gaussian(_type: gaussian, hsize: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  @scala.inline
  def fspecial_gaussian(_type: gaussian, hsize: Double, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  @scala.inline
  def fspecial_gaussian(_type: gaussian, hsize: Unit, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}

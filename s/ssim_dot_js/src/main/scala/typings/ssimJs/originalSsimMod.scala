package typings.ssimJs

import typings.ssimJs.typesMod.Matrix
import typings.ssimJs.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object originalSsimMod {
  
  @JSImport("ssim.js/dist/originalSsim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def originalSsim(pixels1: Matrix, pixels2: Matrix, options: Options): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("originalSsim")(pixels1.asInstanceOf[js.Any], pixels2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}

package typings.ssimJs

import typings.ssimJs.anon.Data
import typings.ssimJs.typesMod.Matrix
import typings.ssimJs.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bezkrovnySsimMod {
  
  @JSImport("ssim.js/dist/bezkrovnySsim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bezkrovnySsim(pixels1: Matrix, pixels2: Matrix, options: Options): Data = (^.asInstanceOf[js.Dynamic].applyDynamic("bezkrovnySsim")(pixels1.asInstanceOf[js.Any], pixels2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Data]
}

package typings.ssimJs

import typings.ssimJs.distTypesMod.Matrix
import typings.ssimJs.distTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDownsampleMod {
  
  @JSImport("ssim.js/dist/downsample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def downsample(pixels: js.Tuple2[Matrix, Matrix], options: Options): js.Tuple2[Matrix, Matrix] = (^.asInstanceOf[js.Dynamic].applyDynamic("downsample")(pixels.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Matrix, Matrix]]
}

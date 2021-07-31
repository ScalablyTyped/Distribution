package typings.ssimJs

import typings.ssimJs.typesMod.Matrix
import typings.ssimJs.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downsampleMod {
  
  @JSImport("ssim.js/dist/downsample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def downsample(pixels: js.Tuple2[Matrix, Matrix], options: Options): js.Tuple2[Matrix, Matrix] = (^.asInstanceOf[js.Dynamic].applyDynamic("downsample")(pixels.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Matrix, Matrix]]
}

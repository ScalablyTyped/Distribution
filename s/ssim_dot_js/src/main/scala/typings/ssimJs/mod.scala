package typings.ssimJs

import typings.ssimJs.anon.Mssim
import typings.ssimJs.anon.PartialOptions
import typings.ssimJs.distTypesMod.ImageData
import typings.ssimJs.distTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssim.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(image1: ImageData, image2: ImageData): Mssim = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any])).asInstanceOf[Mssim]
  inline def default(image1: ImageData, image2: ImageData, userOptions: PartialOptions): Mssim = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Mssim]
  
  inline def getOptions(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[Options]
  inline def getOptions(userOptions: PartialOptions): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(userOptions.asInstanceOf[js.Any]).asInstanceOf[Options]
  
  inline def ssim(image1: ImageData, image2: ImageData): Mssim = (^.asInstanceOf[js.Dynamic].applyDynamic("ssim")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any])).asInstanceOf[Mssim]
  inline def ssim(image1: ImageData, image2: ImageData, userOptions: PartialOptions): Mssim = (^.asInstanceOf[js.Dynamic].applyDynamic("ssim")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Mssim]
}

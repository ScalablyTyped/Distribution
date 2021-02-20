package typings.ssimJs

import typings.ssimJs.anon.Mssim
import typings.ssimJs.anon.PartialOptions
import typings.ssimJs.typesMod.ImageData
import typings.ssimJs.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssim.js", JSImport.Default)
  @js.native
  def default(image1: ImageData, image2: ImageData): Mssim = js.native
  @JSImport("ssim.js", JSImport.Default)
  @js.native
  def default(image1: ImageData, image2: ImageData, userOptions: PartialOptions): Mssim = js.native
  
  @JSImport("ssim.js", "getOptions")
  @js.native
  def getOptions(): Options = js.native
  @JSImport("ssim.js", "getOptions")
  @js.native
  def getOptions(userOptions: PartialOptions): Options = js.native
  
  @JSImport("ssim.js", "ssim")
  @js.native
  def ssim(image1: ImageData, image2: ImageData): Mssim = js.native
  @JSImport("ssim.js", "ssim")
  @js.native
  def ssim(image1: ImageData, image2: ImageData, userOptions: PartialOptions): Mssim = js.native
}

package typings
package reactDashImageDashCropLib.reactDashImageDashCropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-image-crop", JSImport.Namespace)
@js.native
class ^ () extends ReactCrop

@JSImport("react-image-crop", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def containCrop(previousCrop: Crop, crop: Crop, imageAspect: scala.Double): Crop = js.native
  def getPixelCrop(image: stdLib.HTMLImageElement, percentCrop: Crop): Crop = js.native
  def makeAspectCrop(crop: Crop, imageAspect: scala.Double): Crop = js.native
}


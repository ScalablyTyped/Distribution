package typings
package reactDashImgproLib.reactDashImgproMod.ReactImgproNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessImageProps extends js.Object {
   /* should be 0 - 1 */ var blur: js.UndefOr[scala.Double] = js.undefined
  var brightness: js.UndefOr[scala.Double] = js.undefined
  var colors: js.UndefOr[reactDashImgproLib.Anon_Tint] = js.undefined
  var contain: js.UndefOr[Size] = js.undefined
   /* should be -1 to 1 */ var contrast: js.UndefOr[scala.Double] = js.undefined
   /* should be 0 - 100 */ var cover: js.UndefOr[Size] = js.undefined
  var customCdn: js.UndefOr[java.lang.String] = js.undefined
  var disableRerender: js.UndefOr[scala.Boolean] = js.undefined
  var disableWebWorker: js.UndefOr[scala.Boolean] = js.undefined
  var dither565: js.UndefOr[scala.Boolean] = js.undefined
   /* should be -1 to 1 */ var fade: js.UndefOr[scala.Double] = js.undefined
  var flip: js.UndefOr[reactDashImgproLib.Anon_Horizontal] = js.undefined
  var greyscale: js.UndefOr[scala.Boolean] = js.undefined
  var image: java.lang.String
  var invert: js.UndefOr[scala.Boolean] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
   /* should be 0 - 1 */ var opacity: js.UndefOr[scala.Double] = js.undefined
  var opaque: js.UndefOr[scala.Boolean] = js.undefined
   /* should be 0 - 100 */ var posterize: js.UndefOr[scala.Double] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var resize: js.UndefOr[Shape] = js.undefined
  var rotate: js.UndefOr[reactDashImgproLib.Anon_Degree] = js.undefined
  var scale: js.UndefOr[scala.Boolean] = js.undefined
  var scaleToFitImage: js.UndefOr[reactDashImgproLib.Anon_Height] = js.undefined
  var sepia: js.UndefOr[scala.Boolean] = js.undefined
  var storage: js.UndefOr[scala.Boolean] = js.undefined
  def onProcessFinish(): scala.Unit
}


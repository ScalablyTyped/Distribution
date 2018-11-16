package typings
package projectDashOxfordLib.projectDashOxfordMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Analyze extends js.Object {
   // Detects if faces are present.If present, generate coordinates, gender and age.
  var Adult: js.UndefOr[scala.Boolean] = js.undefined
   // Detects if image is pornographic in nature(nudity or sex act).Sexually suggestive content is also detected.
  var Categories: js.UndefOr[scala.Boolean] = js.undefined
   // Detects if image is clipart or a line drawing.
  var Color: js.UndefOr[scala.Boolean] = js.undefined
   // Determines the accent color, dominant color, if image is black& white.
  var Faces: js.UndefOr[scala.Boolean] = js.undefined
   // Path to image to be analyzed
  var ImageType: js.UndefOr[scala.Boolean] = js.undefined
   // Url to image to be analyzed
  var path: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}


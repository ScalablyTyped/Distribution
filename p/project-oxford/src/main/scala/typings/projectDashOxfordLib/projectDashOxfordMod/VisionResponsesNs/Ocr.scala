package typings
package projectDashOxfordLib.projectDashOxfordMod.VisionResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ocr extends js.Object {
  var language: java.lang.String
  var orientation: java.lang.String
  var regions: js.Array[projectDashOxfordLib.Anon_BoundingBoxLines]
  var textAngle: scala.Double
}

object Ocr {
  @scala.inline
  def apply(
    language: java.lang.String,
    orientation: java.lang.String,
    regions: js.Array[projectDashOxfordLib.Anon_BoundingBoxLines],
    textAngle: scala.Double
  ): Ocr = {
    val __obj = js.Dynamic.literal(language = language, orientation = orientation, regions = regions, textAngle = textAngle)
  
    __obj.asInstanceOf[Ocr]
  }
}


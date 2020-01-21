package typings.projectOxford.mod.VisionResponses

import typings.projectOxford.AnonBoundingBoxLines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ocr extends js.Object {
  var language: String
  var orientation: String
  var regions: js.Array[AnonBoundingBoxLines]
  var textAngle: Double
}

object Ocr {
  @scala.inline
  def apply(language: String, orientation: String, regions: js.Array[AnonBoundingBoxLines], textAngle: Double): Ocr = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any], textAngle = textAngle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Ocr]
  }
}


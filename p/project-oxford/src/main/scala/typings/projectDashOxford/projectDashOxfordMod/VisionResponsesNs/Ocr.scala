package typings.projectDashOxford.projectDashOxfordMod.VisionResponsesNs

import typings.projectDashOxford.Anon_BoundingBoxLines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ocr extends js.Object {
  var language: String
  var orientation: String
  var regions: js.Array[Anon_BoundingBoxLines]
  var textAngle: Double
}

object Ocr {
  @scala.inline
  def apply(language: String, orientation: String, regions: js.Array[Anon_BoundingBoxLines], textAngle: Double): Ocr = {
    val __obj = js.Dynamic.literal(language = language, orientation = orientation, regions = regions, textAngle = textAngle)
  
    __obj.asInstanceOf[Ocr]
  }
}


package typings.projectDashOxford.projectDashOxfordMod.VisionResponses

import typings.projectDashOxford.Anon_AccentColor
import typings.projectDashOxford.Anon_AdultScore
import typings.projectDashOxford.Anon_Age
import typings.projectDashOxford.Anon_ClipArtType
import typings.projectDashOxford.Anon_Format
import typings.projectDashOxford.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyze extends js.Object {
  var adult: Anon_AdultScore
  var categories: js.Array[Anon_Name]
  var color: Anon_AccentColor
  var faces: js.Array[Anon_Age]
  var imageType: Anon_ClipArtType
  var metadata: Anon_Format
  var requestId: String
}

object Analyze {
  @scala.inline
  def apply(
    adult: Anon_AdultScore,
    categories: js.Array[Anon_Name],
    color: Anon_AccentColor,
    faces: js.Array[Anon_Age],
    imageType: Anon_ClipArtType,
    metadata: Anon_Format,
    requestId: String
  ): Analyze = {
    val __obj = js.Dynamic.literal(adult = adult, categories = categories, color = color, faces = faces, imageType = imageType, metadata = metadata, requestId = requestId)
  
    __obj.asInstanceOf[Analyze]
  }
}


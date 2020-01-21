package typings.projectOxford.mod.VisionResponses

import typings.projectOxford.AnonAccentColor
import typings.projectOxford.AnonAdultScore
import typings.projectOxford.AnonAge
import typings.projectOxford.AnonClipArtType
import typings.projectOxford.AnonFormat
import typings.projectOxford.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyze extends js.Object {
  var adult: AnonAdultScore
  var categories: js.Array[AnonName]
  var color: AnonAccentColor
  var faces: js.Array[AnonAge]
  var imageType: AnonClipArtType
  var metadata: AnonFormat
  var requestId: String
}

object Analyze {
  @scala.inline
  def apply(
    adult: AnonAdultScore,
    categories: js.Array[AnonName],
    color: AnonAccentColor,
    faces: js.Array[AnonAge],
    imageType: AnonClipArtType,
    metadata: AnonFormat,
    requestId: String
  ): Analyze = {
    val __obj = js.Dynamic.literal(adult = adult.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], faces = faces.asInstanceOf[js.Any], imageType = imageType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Analyze]
  }
}


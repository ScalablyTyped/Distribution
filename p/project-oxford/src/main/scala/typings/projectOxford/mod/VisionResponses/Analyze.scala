package typings.projectOxford.mod.VisionResponses

import typings.projectOxford.anon.AccentColor
import typings.projectOxford.anon.AdultScore
import typings.projectOxford.anon.Age
import typings.projectOxford.anon.ClipArtType
import typings.projectOxford.anon.Format
import typings.projectOxford.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyze extends js.Object {
  var adult: AdultScore
  var categories: js.Array[Name]
  var color: AccentColor
  var faces: js.Array[Age]
  var imageType: ClipArtType
  var metadata: Format
  var requestId: String
}

object Analyze {
  @scala.inline
  def apply(
    adult: AdultScore,
    categories: js.Array[Name],
    color: AccentColor,
    faces: js.Array[Age],
    imageType: ClipArtType,
    metadata: Format,
    requestId: String
  ): Analyze = {
    val __obj = js.Dynamic.literal(adult = adult.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], faces = faces.asInstanceOf[js.Any], imageType = imageType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analyze]
  }
}


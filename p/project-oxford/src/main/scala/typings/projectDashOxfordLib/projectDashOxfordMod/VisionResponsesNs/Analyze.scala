package typings
package projectDashOxfordLib.projectDashOxfordMod.VisionResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyze extends js.Object {
  var adult: projectDashOxfordLib.Anon_AdultScore
  var categories: js.Array[projectDashOxfordLib.Anon_Name]
  var color: projectDashOxfordLib.Anon_AccentColor
  var faces: js.Array[projectDashOxfordLib.Anon_Age]
  var imageType: projectDashOxfordLib.Anon_ClipArtType
  var metadata: projectDashOxfordLib.Anon_Format
  var requestId: java.lang.String
}

object Analyze {
  @scala.inline
  def apply(
    adult: projectDashOxfordLib.Anon_AdultScore,
    categories: js.Array[projectDashOxfordLib.Anon_Name],
    color: projectDashOxfordLib.Anon_AccentColor,
    faces: js.Array[projectDashOxfordLib.Anon_Age],
    imageType: projectDashOxfordLib.Anon_ClipArtType,
    metadata: projectDashOxfordLib.Anon_Format,
    requestId: java.lang.String
  ): Analyze = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adult")(adult)
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("faces")(faces)
    __obj.updateDynamic("imageType")(imageType)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[Analyze]
  }
}


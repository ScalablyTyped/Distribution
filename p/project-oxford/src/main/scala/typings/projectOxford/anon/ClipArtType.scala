package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipArtType extends js.Object {
  var clipArtType: Double
  var lineDrawingType: Double
}

object ClipArtType {
  @scala.inline
  def apply(clipArtType: Double, lineDrawingType: Double): ClipArtType = {
    val __obj = js.Dynamic.literal(clipArtType = clipArtType.asInstanceOf[js.Any], lineDrawingType = lineDrawingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipArtType]
  }
}


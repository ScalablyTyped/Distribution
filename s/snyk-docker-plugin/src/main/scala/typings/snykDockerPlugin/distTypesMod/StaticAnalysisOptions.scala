package typings.snykDockerPlugin.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticAnalysisOptions extends js.Object {
  var distroless: Boolean
  var imagePath: String
  var imageType: ImageType
}

object StaticAnalysisOptions {
  @scala.inline
  def apply(distroless: Boolean, imagePath: String, imageType: ImageType): StaticAnalysisOptions = {
    val __obj = js.Dynamic.literal(distroless = distroless.asInstanceOf[js.Any], imagePath = imagePath.asInstanceOf[js.Any], imageType = imageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticAnalysisOptions]
  }
}


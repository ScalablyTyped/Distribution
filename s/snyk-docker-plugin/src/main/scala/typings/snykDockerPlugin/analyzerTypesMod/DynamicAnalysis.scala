package typings.snykDockerPlugin.analyzerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicAnalysis extends js.Object {
  var binaries: ImageAnalysis
  var imageId: String
  var imageLayers: js.Array[String]
  var osRelease: OSRelease
  var results: js.Array[ImageAnalysis]
}

object DynamicAnalysis {
  @scala.inline
  def apply(
    binaries: ImageAnalysis,
    imageId: String,
    imageLayers: js.Array[String],
    osRelease: OSRelease,
    results: js.Array[ImageAnalysis]
  ): DynamicAnalysis = {
    val __obj = js.Dynamic.literal(binaries = binaries.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], imageLayers = imageLayers.asInstanceOf[js.Any], osRelease = osRelease.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicAnalysis]
  }
}


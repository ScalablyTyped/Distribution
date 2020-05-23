package typings.snykDockerPlugin.analyzerTypesMod

import typings.snykDockerPlugin.distTypesMod.ScannedProjectCustom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticAnalysis extends js.Object {
  var applicationDependenciesScanResults: js.Array[ScannedProjectCustom]
  var binaries: js.Array[String]
  var imageId: String
  var imageLayers: js.Array[String]
  var osRelease: OSRelease
  var results: js.Array[ImageAnalysis]
}

object StaticAnalysis {
  @scala.inline
  def apply(
    applicationDependenciesScanResults: js.Array[ScannedProjectCustom],
    binaries: js.Array[String],
    imageId: String,
    imageLayers: js.Array[String],
    osRelease: OSRelease,
    results: js.Array[ImageAnalysis]
  ): StaticAnalysis = {
    val __obj = js.Dynamic.literal(applicationDependenciesScanResults = applicationDependenciesScanResults.asInstanceOf[js.Any], binaries = binaries.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], imageLayers = imageLayers.asInstanceOf[js.Any], osRelease = osRelease.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticAnalysis]
  }
}


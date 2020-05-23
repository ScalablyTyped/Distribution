package typings.snykDockerPlugin.dockerFileMod

import typings.snykDockerPlugin.instructionParserMod.DockerFileLayers
import typings.snykDockerPlugin.instructionParserMod.DockerFilePackages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerFileAnalysis extends js.Object {
  var baseImage: js.UndefOr[String] = js.undefined
  var dockerfileLayers: DockerFileLayers
  var dockerfilePackages: DockerFilePackages
}

object DockerFileAnalysis {
  @scala.inline
  def apply(
    dockerfileLayers: DockerFileLayers,
    dockerfilePackages: DockerFilePackages,
    baseImage: String = null
  ): DockerFileAnalysis = {
    val __obj = js.Dynamic.literal(dockerfileLayers = dockerfileLayers.asInstanceOf[js.Any], dockerfilePackages = dockerfilePackages.asInstanceOf[js.Any])
    if (baseImage != null) __obj.updateDynamic("baseImage")(baseImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerFileAnalysis]
  }
}


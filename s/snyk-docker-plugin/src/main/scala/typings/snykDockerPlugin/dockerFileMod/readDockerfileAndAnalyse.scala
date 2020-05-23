package typings.snykDockerPlugin.dockerFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/docker-file", "readDockerfileAndAnalyse")
@js.native
object readDockerfileAndAnalyse extends js.Object {
  def apply(): js.Promise[js.UndefOr[DockerFileAnalysis]] = js.native
  def apply(targetFilePath: String): js.Promise[js.UndefOr[DockerFileAnalysis]] = js.native
}


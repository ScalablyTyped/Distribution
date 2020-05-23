package typings.snykDockerPlugin.dockerFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/docker-file", "analyseDockerfile")
@js.native
object analyseDockerfile extends js.Object {
  def apply(contents: String): js.Promise[DockerFileAnalysis] = js.native
}


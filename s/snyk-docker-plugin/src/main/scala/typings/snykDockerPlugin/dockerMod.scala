package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.OSRelease
import typings.snykDockerPlugin.distDockerMod.DockerOptions
import typings.snykDockerPlugin.dockerFileMod.DockerFileAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/os-release/docker", JSImport.Namespace)
@js.native
object dockerMod extends js.Object {
  def detect(targetImage: String): js.Promise[OSRelease] = js.native
  def detect(targetImage: String, dockerfileAnalysis: DockerFileAnalysis): js.Promise[OSRelease] = js.native
  def detect(targetImage: String, dockerfileAnalysis: DockerFileAnalysis, options: DockerOptions): js.Promise[OSRelease] = js.native
}


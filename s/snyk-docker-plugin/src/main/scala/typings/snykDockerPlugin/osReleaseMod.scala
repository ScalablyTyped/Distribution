package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.OSRelease
import typings.snykDockerPlugin.distDockerMod.DockerOptions
import typings.snykDockerPlugin.dockerFileMod.DockerFileAnalysis
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/os-release", JSImport.Namespace)
@js.native
object osReleaseMod extends js.Object {
  def detectDynamically(targetImage: String): js.Promise[OSRelease] = js.native
  def detectDynamically(targetImage: String, dockerfileAnalysis: DockerFileAnalysis): js.Promise[OSRelease] = js.native
  def detectDynamically(targetImage: String, dockerfileAnalysis: DockerFileAnalysis, options: DockerOptions): js.Promise[OSRelease] = js.native
  def detectStatically(extractedLayers: ExtractedLayers): js.Promise[OSRelease] = js.native
}


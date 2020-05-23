package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.DynamicAnalysis
import typings.snykDockerPlugin.distDockerMod.DockerOptions
import typings.snykDockerPlugin.dockerFileMod.DockerFileAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/docker-analyzer", JSImport.Namespace)
@js.native
object dockerAnalyzerMod extends js.Object {
  def analyze(targetImage: String): js.Promise[DynamicAnalysis] = js.native
  def analyze(targetImage: String, dockerfileAnalysis: DockerFileAnalysis): js.Promise[DynamicAnalysis] = js.native
  def analyze(targetImage: String, dockerfileAnalysis: DockerFileAnalysis, options: DockerOptions): js.Promise[DynamicAnalysis] = js.native
}


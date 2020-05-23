package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.DynamicAnalysis
import typings.snykDockerPlugin.analyzerTypesMod.StaticAnalysis
import typings.snykDockerPlugin.distDockerMod.DockerOptions
import typings.snykDockerPlugin.distTypesMod.StaticAnalysisOptions
import typings.snykDockerPlugin.dockerFileMod.DockerFileAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer", JSImport.Namespace)
@js.native
object analyzerMod extends js.Object {
  def analyzeDynamically(targetImage: String): js.Promise[DynamicAnalysis] = js.native
  def analyzeDynamically(targetImage: String, dockerfileAnalysis: DockerFileAnalysis): js.Promise[DynamicAnalysis] = js.native
  def analyzeDynamically(targetImage: String, dockerfileAnalysis: DockerFileAnalysis, options: DockerOptions): js.Promise[DynamicAnalysis] = js.native
  def analyzeStatically(targetImage: String, options: StaticAnalysisOptions): js.Promise[StaticAnalysis] = js.native
}


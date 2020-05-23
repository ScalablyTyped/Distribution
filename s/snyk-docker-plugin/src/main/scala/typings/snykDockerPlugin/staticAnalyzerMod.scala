package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.StaticAnalysis
import typings.snykDockerPlugin.distTypesMod.StaticAnalysisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/static-analyzer", JSImport.Namespace)
@js.native
object staticAnalyzerMod extends js.Object {
  def analyze(targetImage: String, options: StaticAnalysisOptions): js.Promise[StaticAnalysis] = js.native
}


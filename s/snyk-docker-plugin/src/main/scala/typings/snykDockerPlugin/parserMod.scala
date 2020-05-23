package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.DynamicAnalysis
import typings.snykDockerPlugin.analyzerTypesMod.StaticAnalysis
import typings.snykDockerPlugin.anon.Binaries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  def parseAnalysisResults(targetImage: js.Any, analysis: DynamicAnalysis): Binaries = js.native
  def parseAnalysisResults(targetImage: js.Any, analysis: StaticAnalysis): Binaries = js.native
}


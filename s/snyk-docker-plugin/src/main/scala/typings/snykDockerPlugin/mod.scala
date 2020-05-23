package typings.snykDockerPlugin

import typings.snykDockerPlugin.distTypesMod.PluginResponse
import typings.snykDockerPlugin.dockerFileMod.DockerFileAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def inspect(root: String): js.Promise[PluginResponse] = js.native
  def inspect(root: String, targetFile: String): js.Promise[PluginResponse] = js.native
  def inspect(root: String, targetFile: String, options: js.Any): js.Promise[PluginResponse] = js.native
  @js.native
  object dockerFile extends js.Object {
    def analyseDockerfile(contents: String): js.Promise[DockerFileAnalysis] = js.native
    def readDockerfileAndAnalyse(): js.Promise[js.UndefOr[DockerFileAnalysis]] = js.native
    def readDockerfileAndAnalyse(targetFilePath: String): js.Promise[js.UndefOr[DockerFileAnalysis]] = js.native
  }
  
}


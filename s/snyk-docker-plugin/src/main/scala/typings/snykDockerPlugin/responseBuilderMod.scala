package typings.snykDockerPlugin

import typings.snykDockerPlugin.distTypesMod.ManifestFile
import typings.snykDockerPlugin.distTypesMod.PluginResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/response-builder", JSImport.Namespace)
@js.native
object responseBuilderMod extends js.Object {
  def buildResponse(
    runtime: js.UndefOr[String],
    depsAnalysis: js.Any,
    dockerfileAnalysis: js.Any,
    manifestFiles: js.Array[ManifestFile],
    options: js.Any
  ): PluginResponse = js.native
}


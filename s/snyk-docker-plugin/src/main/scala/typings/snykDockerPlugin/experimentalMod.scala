package typings.snykDockerPlugin

import typings.snykDockerPlugin.distTypesMod.PluginResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/experimental", JSImport.Namespace)
@js.native
object experimentalMod extends js.Object {
  def distroless(targetImage: String, options: js.Any): js.Promise[PluginResponse] = js.native
  def experimentalAnalysis(targetImage: String, options: js.Any): js.Promise[PluginResponse] = js.native
}


package typings.snykDockerPlugin

import typings.snykDockerPlugin.distTypesMod.PluginResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/static", JSImport.Namespace)
@js.native
object distStaticMod extends js.Object {
  def analyzeStatically(targetImage: String, options: js.Any): js.Promise[PluginResponse] = js.native
  def isRequestingStaticAnalysis(): Boolean = js.native
  def isRequestingStaticAnalysis(options: js.Any): Boolean = js.native
}


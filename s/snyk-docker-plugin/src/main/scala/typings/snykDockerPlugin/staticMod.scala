package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.OSRelease
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/os-release/static", JSImport.Namespace)
@js.native
object staticMod extends js.Object {
  def detect(extractedLayers: ExtractedLayers): js.Promise[OSRelease] = js.native
}


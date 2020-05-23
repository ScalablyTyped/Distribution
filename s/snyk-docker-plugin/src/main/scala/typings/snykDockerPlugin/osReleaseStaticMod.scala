package typings.snykDockerPlugin

import typings.snykDockerPlugin.distTypesMod.OsReleaseFilePath
import typings.snykDockerPlugin.extractorTypesMod.ExtractAction
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/os-release/static", JSImport.Namespace)
@js.native
object osReleaseStaticMod extends js.Object {
  val getOsReleaseActions: js.Array[ExtractAction] = js.native
  def getOsRelease(extractedLayers: ExtractedLayers, releasePath: OsReleaseFilePath): String = js.native
}


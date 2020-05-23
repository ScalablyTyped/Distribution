package typings.snykDockerPlugin

import typings.snykDockerPlugin.extractorTypesMod.ExtractAction
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/distroless/static", JSImport.Namespace)
@js.native
object distrolessStaticMod extends js.Object {
  val getDpkgPackageFileContentAction: ExtractAction = js.native
  def getAptFiles(extractedLayers: ExtractedLayers): js.Array[String] = js.native
}


package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.IAptFiles
import typings.snykDockerPlugin.extractorTypesMod.ExtractAction
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/apt/static", JSImport.Namespace)
@js.native
object aptStaticMod extends js.Object {
  val getDpkgFileContentAction: ExtractAction = js.native
  val getExtFileContentAction: ExtractAction = js.native
  def getAptDbFileContent(extractedLayers: ExtractedLayers): IAptFiles = js.native
}


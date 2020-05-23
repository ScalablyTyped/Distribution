package typings.snykDockerPlugin

import typings.snykDockerPlugin.extractorTypesMod.ExtractAction
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/rpm/static", JSImport.Namespace)
@js.native
object rpmStaticMod extends js.Object {
  val getRpmDbFileContentAction: ExtractAction = js.native
  def getRpmDbFileContent(extractedLayers: ExtractedLayers): js.Promise[String] = js.native
}


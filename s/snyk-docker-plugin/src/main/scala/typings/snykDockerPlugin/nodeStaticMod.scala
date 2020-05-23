package typings.snykDockerPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.snykDockerPlugin.extractorTypesMod.ExtractAction
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/node/static", JSImport.Namespace)
@js.native
object nodeStaticMod extends js.Object {
  val getNodeAppFileContentAction: ExtractAction = js.native
  def getNodeAppFileContent(extractedLayers: ExtractedLayers): StringDictionary[String] = js.native
}


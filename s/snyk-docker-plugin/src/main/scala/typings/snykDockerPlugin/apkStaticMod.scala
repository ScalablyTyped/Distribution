package typings.snykDockerPlugin

import typings.snykDockerPlugin.extractorTypesMod.ExtractAction
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/apk/static", JSImport.Namespace)
@js.native
object apkStaticMod extends js.Object {
  val getApkDbFileContentAction: ExtractAction = js.native
  def getApkDbFileContent(extractedLayers: ExtractedLayers): String = js.native
}


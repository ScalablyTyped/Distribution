package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.ImageAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/package-managers/apk", JSImport.Namespace)
@js.native
object apkMod extends js.Object {
  def analyze(targetImage: String, apkDbFileContent: String): js.Promise[ImageAnalysis] = js.native
}


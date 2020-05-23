package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.ImageAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/package-managers/rpm", JSImport.Namespace)
@js.native
object rpmMod extends js.Object {
  def analyze(targetImage: String, rpmDbFilecontent: String): js.Promise[ImageAnalysis] = js.native
}


package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.IAptFiles
import typings.snykDockerPlugin.analyzerTypesMod.ImageAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/package-managers/apt", JSImport.Namespace)
@js.native
object aptMod extends js.Object {
  def analyze(targetImage: String, aptFiles: IAptFiles): js.Promise[ImageAnalysis] = js.native
  def analyzeDistroless(targetImage: String, aptFiles: js.Array[String]): js.Promise[ImageAnalysis] = js.native
}


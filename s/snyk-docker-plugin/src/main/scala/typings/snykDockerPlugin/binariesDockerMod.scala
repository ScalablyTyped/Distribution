package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.ImageAnalysis
import typings.snykDockerPlugin.distDockerMod.DockerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/binaries/docker", JSImport.Namespace)
@js.native
object binariesDockerMod extends js.Object {
  def analyze(targetImage: String, installedPackages: js.Array[String]): js.Promise[ImageAnalysis] = js.native
  def analyze(targetImage: String, installedPackages: js.Array[String], pkgManager: String): js.Promise[ImageAnalysis] = js.native
  def analyze(
    targetImage: String,
    installedPackages: js.Array[String],
    pkgManager: String,
    options: DockerOptions
  ): js.Promise[ImageAnalysis] = js.native
}


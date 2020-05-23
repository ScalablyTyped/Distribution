package typings.snykDockerPlugin

import typings.snykDockerPlugin.distDockerMod.Docker
import typings.snykDockerPlugin.distTypesMod.OsReleaseFilePath
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/os-release", JSImport.Namespace)
@js.native
object inputsOsReleaseMod extends js.Object {
  def getOsReleaseDynamic(docker: Docker, releasePath: OsReleaseFilePath): js.Promise[String] = js.native
  def getOsReleaseStatic(extractedLayers: ExtractedLayers, releasePath: OsReleaseFilePath): String = js.native
}


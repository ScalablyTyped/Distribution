package typings.snykDockerPlugin

import typings.snykDockerPlugin.distDockerMod.Docker
import typings.snykDockerPlugin.distTypesMod.OsReleaseFilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/os-release/docker", JSImport.Namespace)
@js.native
object osReleaseDockerMod extends js.Object {
  def getOsRelease(docker: Docker, releasePath: OsReleaseFilePath): js.Promise[String] = js.native
}


package typings.snykDockerPlugin

import typings.snykDockerPlugin.anon.DpkgFile
import typings.snykDockerPlugin.distDockerMod.DockerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/apt/docker", JSImport.Namespace)
@js.native
object aptDockerMod extends js.Object {
  def getAptDbFileContent(targetImage: String): js.Promise[DpkgFile] = js.native
  def getAptDbFileContent(targetImage: String, options: DockerOptions): js.Promise[DpkgFile] = js.native
}


package typings.snykDockerPlugin

import typings.snykDockerPlugin.distDockerMod.DockerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/rpm/docker", JSImport.Namespace)
@js.native
object rpmDockerMod extends js.Object {
  def getRpmDbFileContent(targetImage: String): js.Promise[String] = js.native
  def getRpmDbFileContent(targetImage: String, options: DockerOptions): js.Promise[String] = js.native
}


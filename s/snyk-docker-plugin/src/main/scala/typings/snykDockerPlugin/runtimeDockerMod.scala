package typings.snykDockerPlugin

import typings.snykDockerPlugin.distDockerMod.DockerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/runtime/docker", JSImport.Namespace)
@js.native
object runtimeDockerMod extends js.Object {
  def getRuntime(options: DockerOptions): js.Promise[js.UndefOr[String]] = js.native
}


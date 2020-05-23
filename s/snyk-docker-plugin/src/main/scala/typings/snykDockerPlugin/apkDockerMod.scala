package typings.snykDockerPlugin

import typings.snykDockerPlugin.distDockerMod.DockerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/apk/docker", JSImport.Namespace)
@js.native
object apkDockerMod extends js.Object {
  def getApkDbFileContent(targetImage: String): js.Promise[String] = js.native
  def getApkDbFileContent(targetImage: String, options: DockerOptions): js.Promise[String] = js.native
}


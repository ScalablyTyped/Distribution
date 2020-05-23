package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.Binary
import typings.snykDockerPlugin.distDockerMod.DockerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/binaries/docker/openjdk-jre", JSImport.Namespace)
@js.native
object openjdkJreMod extends js.Object {
  def extract(targetImage: String): js.Promise[Binary | Null] = js.native
  def extract(targetImage: String, options: DockerOptions): js.Promise[Binary | Null] = js.native
  def installedByPackageManager(installedPackages: js.Array[String]): Boolean = js.native
  def installedByPackageManager(installedPackages: js.Array[String], pkgManager: String): Boolean = js.native
}


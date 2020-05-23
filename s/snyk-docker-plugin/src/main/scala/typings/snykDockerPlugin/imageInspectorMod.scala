package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.DockerInspectOutput
import typings.snykDockerPlugin.distDockerMod.DockerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/image-inspector", JSImport.Namespace)
@js.native
object imageInspectorMod extends js.Object {
  def detect(targetImage: String): js.Promise[DockerInspectOutput] = js.native
  def detect(targetImage: String, options: DockerOptions): js.Promise[DockerInspectOutput] = js.native
  def pullIfNotLocal(targetImage: String): js.Promise[Unit] = js.native
  def pullIfNotLocal(targetImage: String, options: DockerOptions): js.Promise[Unit] = js.native
}


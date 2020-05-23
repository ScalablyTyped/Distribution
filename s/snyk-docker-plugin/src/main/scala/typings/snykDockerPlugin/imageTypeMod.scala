package typings.snykDockerPlugin

import typings.snykDockerPlugin.distTypesMod.ImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/image-type", JSImport.Namespace)
@js.native
object imageTypeMod extends js.Object {
  def getDockerArchivePath(targetImage: String): String = js.native
  def getImageType(targetImage: String): ImageType = js.native
}


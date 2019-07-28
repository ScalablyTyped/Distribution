package typings.atPulumiPulumi.assetArchiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/archive", "FileArchive")
@js.native
class FileArchive protected () extends Archive {
  def this(path: String) = this()
  def this(path: js.Promise[String]) = this()
  /**
    * The path to the asset file.
    */
  val path: js.Promise[String] = js.native
}


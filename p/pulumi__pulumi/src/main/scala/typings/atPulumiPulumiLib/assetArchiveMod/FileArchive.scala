package typings
package atPulumiPulumiLib.assetArchiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/archive", "FileArchive")
@js.native
class FileArchive protected () extends Archive {
  def this(path: java.lang.String) = this()
  def this(path: js.Promise[java.lang.String]) = this()
  /**
    * The path to the asset file.
    */
  val path: js.Promise[java.lang.String] = js.native
}


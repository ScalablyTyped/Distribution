package typings
package atPulumiPulumiLib.assetArchiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/archive", "RemoteArchive")
@js.native
class RemoteArchive protected () extends Archive {
  def this(uri: java.lang.String) = this()
  def this(uri: js.Promise[java.lang.String]) = this()
  /**
    * The URI where the archive lives.
    */
  val uri: js.Promise[java.lang.String] = js.native
}


package typings.atPulumiPulumi.assetArchiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/archive", "RemoteArchive")
@js.native
class RemoteArchive protected () extends Archive {
  def this(uri: String) = this()
  def this(uri: js.Promise[String]) = this()
  /**
    * The URI where the archive lives.
    */
  val uri: js.Promise[String] = js.native
}


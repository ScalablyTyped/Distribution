package typings
package atPulumiPulumiLib.assetArchiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/archive", "AssetArchive")
@js.native
class AssetArchive protected () extends Archive {
  def this(assets: AssetMap) = this()
  def this(assets: stdLib.Promise[AssetMap]) = this()
  /**
       * A map of names to assets.
       */
  val assets: stdLib.Promise[AssetMap] = js.native
}


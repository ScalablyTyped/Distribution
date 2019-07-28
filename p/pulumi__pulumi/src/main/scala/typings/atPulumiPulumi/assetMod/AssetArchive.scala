package typings.atPulumiPulumi.assetMod

import typings.atPulumiPulumi.assetArchiveMod.AssetMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset", "AssetArchive")
@js.native
class AssetArchive protected ()
  extends typings.atPulumiPulumi.assetArchiveMod.AssetArchive {
  def this(assets: js.Promise[AssetMap]) = this()
  def this(assets: AssetMap) = this()
}


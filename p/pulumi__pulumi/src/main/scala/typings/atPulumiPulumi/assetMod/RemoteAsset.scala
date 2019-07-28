package typings.atPulumiPulumi.assetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset", "RemoteAsset")
@js.native
class RemoteAsset protected ()
  extends typings.atPulumiPulumi.assetAssetMod.RemoteAsset {
  def this(uri: String) = this()
  def this(uri: js.Promise[String]) = this()
}


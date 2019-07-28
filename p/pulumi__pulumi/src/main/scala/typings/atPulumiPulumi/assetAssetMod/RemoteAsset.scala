package typings.atPulumiPulumi.assetAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/asset", "RemoteAsset")
@js.native
class RemoteAsset protected () extends Asset {
  def this(uri: String) = this()
  def this(uri: js.Promise[String]) = this()
  /**
    * The URI where the asset lives.
    */
  val uri: js.Promise[String] = js.native
}


package typings.atPulumiPulumi.assetAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/asset", "FileAsset")
@js.native
class FileAsset protected () extends Asset {
  def this(path: String) = this()
  def this(path: js.Promise[String]) = this()
  /**
    * The path to the asset file.
    */
  val path: js.Promise[String] = js.native
}


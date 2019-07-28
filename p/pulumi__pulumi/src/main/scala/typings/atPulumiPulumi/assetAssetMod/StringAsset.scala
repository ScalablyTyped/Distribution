package typings.atPulumiPulumi.assetAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/asset", "StringAsset")
@js.native
class StringAsset protected () extends Asset {
  def this(text: String) = this()
  def this(text: js.Promise[String]) = this()
  /**
    * The string contents.
    */
  val text: js.Promise[String] = js.native
}


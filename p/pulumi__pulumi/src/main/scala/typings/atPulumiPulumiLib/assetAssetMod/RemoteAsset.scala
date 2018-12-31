package typings
package atPulumiPulumiLib.assetAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/asset", "RemoteAsset")
@js.native
class RemoteAsset protected () extends Asset {
  def this(uri: java.lang.String) = this()
  def this(uri: js.Promise[java.lang.String]) = this()
  /**
    * The URI where the asset lives.
    */
  val uri: js.Promise[java.lang.String] = js.native
}


package typings
package atPulumiPulumiLib.assetAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/asset", "FileAsset")
@js.native
class FileAsset protected () extends Asset {
  def this(path: java.lang.String) = this()
  def this(path: js.Promise[java.lang.String]) = this()
  /**
       * The path to the asset file.
       */
  val path: js.Promise[java.lang.String] = js.native
}


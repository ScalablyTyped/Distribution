package typings
package atPulumiPulumiLib.assetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset", "Asset")
@js.native
abstract class Asset ()
  extends atPulumiPulumiLib.assetAssetMod.Asset

@JSImport("@pulumi/pulumi/asset", "Asset")
@js.native
object Asset extends js.Object {
  /**
       * Returns true if the given object is an instance of an Asset.  This is designed to work even when
       * multiple copies of the Pulumi SDK have been loaded into the same process.
       */
  def isInstance(obj: js.Any): /* is Asset */scala.Boolean = js.native
}


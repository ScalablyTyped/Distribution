package typings
package atPulumiAwsLib.workspacesGetBundleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBundleArgs extends js.Object {
  /**
    * The ID of the bundle.
    */
  val bundleId: java.lang.String
}

object GetBundleArgs {
  @scala.inline
  def apply(bundleId: java.lang.String): GetBundleArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bundleId")(bundleId)
    __obj.asInstanceOf[GetBundleArgs]
  }
}


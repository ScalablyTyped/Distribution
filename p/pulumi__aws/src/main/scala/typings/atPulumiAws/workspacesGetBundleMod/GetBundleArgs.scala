package typings.atPulumiAws.workspacesGetBundleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBundleArgs extends js.Object {
  /**
    * The ID of the bundle.
    */
  val bundleId: String = js.native
}

object GetBundleArgs {
  @scala.inline
  def apply(bundleId: String): GetBundleArgs = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBundleArgs]
  }
}


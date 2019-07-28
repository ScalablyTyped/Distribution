package typings.atPulumiAws.workspacesGetBundleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBundleArgs extends js.Object {
  /**
    * The ID of the bundle.
    */
  val bundleId: String
}

object GetBundleArgs {
  @scala.inline
  def apply(bundleId: String): GetBundleArgs = {
    val __obj = js.Dynamic.literal(bundleId = bundleId)
  
    __obj.asInstanceOf[GetBundleArgs]
  }
}


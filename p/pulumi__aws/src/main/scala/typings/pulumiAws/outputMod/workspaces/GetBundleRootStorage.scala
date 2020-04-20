package typings.pulumiAws.outputMod.workspaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBundleRootStorage extends js.Object {
  /**
    * The size of the user storage.
    */
  var capacity: String = js.native
}

object GetBundleRootStorage {
  @scala.inline
  def apply(capacity: String): GetBundleRootStorage = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBundleRootStorage]
  }
}


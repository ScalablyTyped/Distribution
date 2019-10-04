package typings.atPulumiAws.typesOutputMod.workspacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBundleRootStorage extends js.Object {
  /**
    * The size of the user storage.
    */
  var capacity: String
}

object GetBundleRootStorage {
  @scala.inline
  def apply(capacity: String): GetBundleRootStorage = {
    val __obj = js.Dynamic.literal(capacity = capacity)
  
    __obj.asInstanceOf[GetBundleRootStorage]
  }
}


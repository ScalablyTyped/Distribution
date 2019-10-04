package typings.atPulumiAws.typesOutputMod.workspacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBundleUserStorage extends js.Object {
  /**
    * The size of the user storage.
    */
  var capacity: String
}

object GetBundleUserStorage {
  @scala.inline
  def apply(capacity: String): GetBundleUserStorage = {
    val __obj = js.Dynamic.literal(capacity = capacity)
  
    __obj.asInstanceOf[GetBundleUserStorage]
  }
}


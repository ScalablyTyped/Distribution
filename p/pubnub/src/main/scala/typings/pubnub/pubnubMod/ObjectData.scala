package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Object
trait ObjectData extends js.Object {
  var created: String
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  var eTag: String
  var id: String
  var updated: String
}

object ObjectData {
  @scala.inline
  def apply(created: String, eTag: String, id: String, updated: String, custom: js.Object = null): ObjectData = {
    val __obj = js.Dynamic.literal(created = created, eTag = eTag, id = id, updated = updated)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    __obj.asInstanceOf[ObjectData]
  }
}


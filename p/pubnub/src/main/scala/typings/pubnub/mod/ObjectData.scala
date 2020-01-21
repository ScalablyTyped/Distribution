package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Object
trait ObjectData extends js.Object {
  var created: String
  var custom: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  var eTag: String
  var id: String
  var updated: String
}

object ObjectData {
  @scala.inline
  def apply(
    created: String,
    eTag: String,
    id: String,
    updated: String,
    custom: StringDictionary[String] = null
  ): ObjectData = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectData]
  }
}


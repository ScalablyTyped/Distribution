package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Space
trait SpaceData extends ObjectData {
  var description: js.UndefOr[String | Null] = js.undefined
  var name: String
}

object SpaceData {
  @scala.inline
  def apply(
    created: String,
    eTag: String,
    id: String,
    name: String,
    updated: String,
    custom: StringDictionary[String] = null,
    description: String = null
  ): SpaceData = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceData]
  }
}


package typings.pubnub.pubnubMod

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
    custom: js.Object = null,
    description: String = null
  ): SpaceData = {
    val __obj = js.Dynamic.literal(created = created, eTag = eTag, id = id, name = name, updated = updated)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SpaceData]
  }
}


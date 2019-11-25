package typings.pubnub.pubnubMod

import typings.pubnub.Anon_CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceInputParameters extends js.Object {
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  var description: js.UndefOr[String | Null] = js.undefined
  var id: String
  var include: js.UndefOr[Anon_CustomFields] = js.undefined
  var name: String
}

object SpaceInputParameters {
  @scala.inline
  def apply(
    id: String,
    name: String,
    custom: js.Object = null,
    description: String = null,
    include: Anon_CustomFields = null
  ): SpaceInputParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceInputParameters]
  }
}


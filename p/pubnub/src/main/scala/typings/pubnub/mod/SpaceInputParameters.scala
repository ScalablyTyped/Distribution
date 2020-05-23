package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceInputParameters extends js.Object {
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  var description: js.UndefOr[String | Null] = js.undefined
  var id: String
  var include: js.UndefOr[CustomFields] = js.undefined
  var name: String
}

object SpaceInputParameters {
  @scala.inline
  def apply(
    id: String,
    name: String,
    custom: js.UndefOr[Null | js.Object] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    include: CustomFields = null
  ): SpaceInputParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceInputParameters]
  }
}


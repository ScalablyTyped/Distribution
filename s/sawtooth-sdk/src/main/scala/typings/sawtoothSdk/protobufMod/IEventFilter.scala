package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.EventFilter.FilterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventFilter extends js.Object {
  /** EventFilter filterType */
  var filterType: js.UndefOr[FilterType | Null] = js.undefined
  /** EventFilter key */
  var key: js.UndefOr[String | Null] = js.undefined
  /** EventFilter matchString */
  var matchString: js.UndefOr[String | Null] = js.undefined
}

object IEventFilter {
  @scala.inline
  def apply(
    filterType: js.UndefOr[Null | FilterType] = js.undefined,
    key: js.UndefOr[Null | String] = js.undefined,
    matchString: js.UndefOr[Null | String] = js.undefined
  ): IEventFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filterType)) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(matchString)) __obj.updateDynamic("matchString")(matchString.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventFilter]
  }
}


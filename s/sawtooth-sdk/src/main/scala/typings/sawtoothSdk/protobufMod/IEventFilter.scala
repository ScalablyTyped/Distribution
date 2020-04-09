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
  def apply(filterType: FilterType = null, key: String = null, matchString: String = null): IEventFilter = {
    val __obj = js.Dynamic.literal()
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (matchString != null) __obj.updateDynamic("matchString")(matchString.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventFilter]
  }
}


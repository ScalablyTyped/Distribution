package typings.qlik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataDimensions extends js.Object {
  var data: js.UndefOr[AnonData] = js.undefined
  var dimensions: js.UndefOr[AnonDimensions] = js.undefined
  var measures: js.UndefOr[AnonItems] = js.undefined
  var settings: js.UndefOr[AnonItemsKeySettings] = js.undefined
  var sorting: js.UndefOr[AnonItemsKey] = js.undefined
}

object AnonDataDimensions {
  @scala.inline
  def apply(
    data: AnonData = null,
    dimensions: AnonDimensions = null,
    measures: AnonItems = null,
    settings: AnonItemsKeySettings = null,
    sorting: AnonItemsKey = null
  ): AnonDataDimensions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataDimensions]
  }
}


package typings.qlik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.UndefOr[AnonUses] = js.undefined
  var dimensions: js.UndefOr[AnonItems] = js.undefined
  var measures: js.UndefOr[AnonMax] = js.undefined
  var settings: js.UndefOr[Anon0] = js.undefined
  var sorting: js.UndefOr[AnonItemsUses] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(
    data: AnonUses = null,
    dimensions: AnonItems = null,
    measures: AnonMax = null,
    settings: Anon0 = null,
    sorting: AnonItemsUses = null
  ): AnonData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}


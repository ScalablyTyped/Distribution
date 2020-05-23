package typings.qlik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.UndefOr[Uses] = js.undefined
  var dimensions: js.UndefOr[Items] = js.undefined
  var measures: js.UndefOr[Max] = js.undefined
  var settings: js.UndefOr[`0`] = js.undefined
  var sorting: js.UndefOr[ItemsUses] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    data: Uses = null,
    dimensions: Items = null,
    measures: Max = null,
    settings: `0` = null,
    sorting: ItemsUses = null
  ): Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}


package typings
package qlikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataDimensions extends js.Object {
  var data: js.UndefOr[Anon_Data] = js.undefined
  var dimensions: js.UndefOr[Anon_Dimensions] = js.undefined
  var measures: js.UndefOr[Anon_Items] = js.undefined
  var settings: js.UndefOr[Anon_ItemsKeySettings] = js.undefined
  var sorting: js.UndefOr[Anon_ItemsKey] = js.undefined
}

object Anon_DataDimensions {
  @scala.inline
  def apply(
    data: Anon_Data = null,
    dimensions: Anon_Dimensions = null,
    measures: Anon_Items = null,
    settings: Anon_ItemsKeySettings = null,
    sorting: Anon_ItemsKey = null
  ): Anon_DataDimensions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (measures != null) __obj.updateDynamic("measures")(measures)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (sorting != null) __obj.updateDynamic("sorting")(sorting)
    __obj.asInstanceOf[Anon_DataDimensions]
  }
}


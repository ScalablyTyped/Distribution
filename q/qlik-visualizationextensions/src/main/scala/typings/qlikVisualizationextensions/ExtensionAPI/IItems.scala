package typings.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItems
  extends /* other */ StringDictionary[js.Any] {
  var AddOns: js.UndefOr[IAddOns] = js.undefined
  var appearance: js.UndefOr[IAppearance] = js.undefined
  var dimentions: js.UndefOr[IDimensions] = js.undefined
  var measures: js.UndefOr[IMeasures] = js.undefined
  var sorting: js.UndefOr[ISorting] = js.undefined
}

object IItems {
  @scala.inline
  def apply(
    AddOns: IAddOns = null,
    StringDictionary: /* other */ StringDictionary[js.Any] = null,
    appearance: IAppearance = null,
    dimentions: IDimensions = null,
    measures: IMeasures = null,
    sorting: ISorting = null
  ): IItems = {
    val __obj = js.Dynamic.literal()
    if (AddOns != null) __obj.updateDynamic("AddOns")(AddOns.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (dimentions != null) __obj.updateDynamic("dimentions")(dimentions.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItems]
  }
}


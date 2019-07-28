package typings.stormDashReactDashDiagrams.distSrcDefaultsWidgetsDefaultLabelWidgetMod

import typings.stormDashReactDashDiagrams.distSrcDefaultsModelsDefaultLabelModelMod.DefaultLabelModel
import typings.stormDashReactDashDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultLabelWidgetProps extends BaseWidgetProps {
  var model: DefaultLabelModel
}

object DefaultLabelWidgetProps {
  @scala.inline
  def apply(
    model: DefaultLabelModel,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null
  ): DefaultLabelWidgetProps = {
    val __obj = js.Dynamic.literal(model = model)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[DefaultLabelWidgetProps]
  }
}


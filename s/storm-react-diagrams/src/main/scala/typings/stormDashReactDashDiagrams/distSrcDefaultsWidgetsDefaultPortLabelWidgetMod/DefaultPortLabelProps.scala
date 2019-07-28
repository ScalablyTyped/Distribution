package typings.stormDashReactDashDiagrams.distSrcDefaultsWidgetsDefaultPortLabelWidgetMod

import typings.stormDashReactDashDiagrams.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel
import typings.stormDashReactDashDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultPortLabelProps extends BaseWidgetProps {
  var model: DefaultPortModel
}

object DefaultPortLabelProps {
  @scala.inline
  def apply(
    model: DefaultPortModel,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null
  ): DefaultPortLabelProps = {
    val __obj = js.Dynamic.literal(model = model)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[DefaultPortLabelProps]
  }
}


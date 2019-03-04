package typings
package stormDashReactDashDiagramsLib.distSrcDefaultsWidgetsDefaultLabelWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultLabelWidgetProps
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidgetProps {
  var model: stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultLabelModelMod.DefaultLabelModel
}

object DefaultLabelWidgetProps {
  @scala.inline
  def apply(
    model: stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultLabelModelMod.DefaultLabelModel,
    baseClass: java.lang.String = null,
    className: java.lang.String = null,
    extraProps: js.Any = null
  ): DefaultLabelWidgetProps = {
    val __obj = js.Dynamic.literal(model = model)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[DefaultLabelWidgetProps]
  }
}


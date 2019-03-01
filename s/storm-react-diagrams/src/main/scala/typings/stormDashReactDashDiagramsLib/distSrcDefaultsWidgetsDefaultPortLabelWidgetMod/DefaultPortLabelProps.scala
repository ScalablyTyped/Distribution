package typings
package stormDashReactDashDiagramsLib.distSrcDefaultsWidgetsDefaultPortLabelWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultPortLabelProps
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidgetProps {
  var model: stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel
}

object DefaultPortLabelProps {
  @scala.inline
  def apply(
    model: stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel,
    baseClass: java.lang.String = null,
    className: java.lang.String = null,
    extraProps: js.Any = null
  ): DefaultPortLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("model")(model)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[DefaultPortLabelProps]
  }
}


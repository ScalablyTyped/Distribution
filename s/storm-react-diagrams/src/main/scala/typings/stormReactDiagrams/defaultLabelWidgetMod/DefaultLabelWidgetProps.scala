package typings.stormReactDiagrams.defaultLabelWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultLabelModelMod.DefaultLabelModel
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
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLabelWidgetProps]
  }
}


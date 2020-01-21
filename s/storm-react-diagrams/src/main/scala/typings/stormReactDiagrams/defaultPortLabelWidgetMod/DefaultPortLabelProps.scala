package typings.stormReactDiagrams.defaultPortLabelWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultPortModelMod.DefaultPortModel
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
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPortLabelProps]
  }
}


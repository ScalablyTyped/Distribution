package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.switch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomSwitch extends js.Object {
  var component: switch
  var defaultValue: Boolean
  var options: valueOrfunc[ICustomControlOption]
}

object ICustomSwitch {
  @scala.inline
  def apply(component: switch, defaultValue: Boolean, options: valueOrfunc[ICustomControlOption]): ICustomSwitch = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICustomSwitch]
  }
}


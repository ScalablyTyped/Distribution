package typings.reactNativeNavigation.navigationComponentPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationComponentProps extends js.Object {
  var componentId: String = js.native
}

object NavigationComponentProps {
  @scala.inline
  def apply(componentId: String): NavigationComponentProps = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationComponentProps]
  }
  @scala.inline
  implicit class NavigationComponentPropsOps[Self <: NavigationComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponentId(value: String): Self = this.set("componentId", value.asInstanceOf[js.Any])
  }
  
}


package typings.reactIntl

import typings.react.mod.ComponentType
import typings.reactIntl.injectIntlMod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponent[P /* <: WrappedComponentProps[IntlPropName] */] extends js.Object {
  var WrappedComponent: ComponentType[P]
}

object AnonWrappedComponent {
  @scala.inline
  def apply[P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): AnonWrappedComponent[P] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWrappedComponent[P]]
  }
}


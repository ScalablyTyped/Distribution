package typings.reactIntl

import typings.react.mod.ComponentType
import typings.reactIntl.injectIntlMod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponentComponentType[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends js.Object {
  var WrappedComponent: ComponentType[P]
}

object AnonWrappedComponentComponentType {
  @scala.inline
  def apply[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */](WrappedComponent: ComponentType[P]): AnonWrappedComponentComponentType[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWrappedComponentComponentType[P, IntlPropName]]
  }
}


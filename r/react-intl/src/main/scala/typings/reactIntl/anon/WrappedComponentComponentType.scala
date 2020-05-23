package typings.reactIntl.anon

import typings.react.mod.ComponentType
import typings.reactIntl.injectIntlMod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedComponentComponentType[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends js.Object {
  var WrappedComponent: ComponentType[P]
}

object WrappedComponentComponentType {
  @scala.inline
  def apply[P, IntlPropName](WrappedComponent: ComponentType[P]): WrappedComponentComponentType[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponentComponentType[P, IntlPropName]]
  }
}


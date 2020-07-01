package typings.reactIntl.anon

import typings.react.mod.ComponentType
import typings.reactIntl.injectIntlMod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedComponent[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends js.Object {
  var WrappedComponent: ComponentType[P]
}

object WrappedComponent {
  @scala.inline
  def apply[/* <: typings.reactIntl.injectIntlMod.WrappedComponentProps[IntlPropName] */ P, /* <: java.lang.String */ IntlPropName](WrappedComponent: ComponentType[P]): WrappedComponent[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponent[P, IntlPropName]]
  }
}


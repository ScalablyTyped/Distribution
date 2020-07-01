package typings.reactIntl.anon

import typings.react.mod.ComponentType
import typings.reactIntl.mod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `4`[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends js.Object {
  var WrappedComponent: ComponentType[P]
}

object `4` {
  @scala.inline
  def apply[/* <: typings.reactIntl.mod.WrappedComponentProps[IntlPropName] */ P, /* <: java.lang.String */ IntlPropName](WrappedComponent: ComponentType[P]): `4`[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`[P, IntlPropName]]
  }
}


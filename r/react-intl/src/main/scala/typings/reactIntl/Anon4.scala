package typings.reactIntl

import typings.react.mod.ComponentType
import typings.reactIntl.mod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon4[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends js.Object {
  var WrappedComponent: ComponentType[P]
}

object Anon4 {
  @scala.inline
  def apply[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */](WrappedComponent: ComponentType[P]): Anon4[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon4[P, IntlPropName]]
  }
}


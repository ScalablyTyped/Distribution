package typings.reactDashIntl

import typings.react.reactMod.ComponentType
import typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WrappedComponent[P /* <: WrappedComponentProps[IntlPropName] */] extends js.Object {
  var WrappedComponent: ComponentType[P]
}

object Anon_WrappedComponent {
  @scala.inline
  def apply[P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): Anon_WrappedComponent[P] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_WrappedComponent[P]]
  }
}


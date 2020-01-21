package typings.reactIntl

import typings.react.mod.ComponentType
import typings.reactIntl.mod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponentComponentTypeP[P /* <: WrappedComponentProps[IntlPropName] */] extends js.Object {
  var WrappedComponent: ComponentType[P]
}

object AnonWrappedComponentComponentTypeP {
  @scala.inline
  def apply[P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): AnonWrappedComponentComponentTypeP[P] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWrappedComponentComponentTypeP[P]]
  }
}


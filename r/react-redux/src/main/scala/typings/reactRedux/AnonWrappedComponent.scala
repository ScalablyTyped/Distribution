package typings.reactRedux

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponent[C /* <: ComponentType[_] */] extends js.Object {
  var WrappedComponent: C
}

object AnonWrappedComponent {
  @scala.inline
  def apply[C /* <: ComponentType[_] */](WrappedComponent: C): AnonWrappedComponent[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWrappedComponent[C]]
  }
}


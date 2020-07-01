package typings.reactDnd.anon

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratedComponent[C /* <: ComponentType[_] */] extends js.Object {
  var DecoratedComponent: C
}

object DecoratedComponent {
  @scala.inline
  def apply[/* <: typings.react.mod.ComponentType[_] */ C](DecoratedComponent: C): DecoratedComponent[C] = {
    val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratedComponent[C]]
  }
}


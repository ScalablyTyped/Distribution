package typings.reactDnd

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecoratedComponent[C /* <: ComponentType[_] */] extends js.Object {
  var DecoratedComponent: C
}

object AnonDecoratedComponent {
  @scala.inline
  def apply[C /* <: ComponentType[_] */](DecoratedComponent: C): AnonDecoratedComponent[C] = {
    val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDecoratedComponent[C]]
  }
}


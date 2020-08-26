package typings.reactDnd.anon

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratedComponent[C /* <: ComponentType[_] */] extends js.Object {
  var DecoratedComponent: C = js.native
}

object DecoratedComponent {
  @scala.inline
  def apply[/* <: typings.react.mod.ComponentType[_] */ C](DecoratedComponent: C): DecoratedComponent[C] = {
    val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratedComponent[C]]
  }
  @scala.inline
  implicit class DecoratedComponentOps[Self <: DecoratedComponent[_], /* <: typings.react.mod.ComponentType[_] */ C] (val x: Self with DecoratedComponent[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecoratedComponent(value: C): Self = this.set("DecoratedComponent", value.asInstanceOf[js.Any])
  }
  
}


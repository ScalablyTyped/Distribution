package typings.slickgrid.Slick.Plugins

import typings.slickgrid.Slick.Event
import typings.slickgrid.Slick.Grid
import typings.slickgrid.Slick.OnCommandEventArgs
import typings.slickgrid.Slick.Plugin
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderButtons[T /* <: SlickData */] extends Plugin[T] {
  var onCommand: Event[OnCommandEventArgs[T]] = js.native
}

object HeaderButtons {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](destroy: () => Unit, init: Grid[T] => Unit, onCommand: Event[OnCommandEventArgs[T]]): HeaderButtons[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init), onCommand = onCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderButtons[T]]
  }
  @scala.inline
  implicit class HeaderButtonsOps[Self <: HeaderButtons[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with HeaderButtons[T]) extends AnyVal {
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
    def setOnCommand(value: Event[OnCommandEventArgs[T]]): Self = this.set("onCommand", value.asInstanceOf[js.Any])
  }
  
}


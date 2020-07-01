package typings.slickgrid.Slick.Plugins

import typings.slickgrid.Slick.Event
import typings.slickgrid.Slick.Grid
import typings.slickgrid.Slick.OnCommandEventArgs
import typings.slickgrid.Slick.Plugin
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderButtons[T /* <: SlickData */] extends Plugin[T] {
  var onCommand: Event[OnCommandEventArgs[T]]
}

object HeaderButtons {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](destroy: () => Unit, init: Grid[T] => Unit, onCommand: Event[OnCommandEventArgs[T]]): HeaderButtons[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init), onCommand = onCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderButtons[T]]
  }
}


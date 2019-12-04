package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Plugins")
@js.native
object Plugins extends js.Object {
  @js.native
  class HeaderButtons[T /* <: SlickData */] () extends Plugin[T] {
    var onCommand: Event[OnCommandEventArgs[T]] = js.native
  }
  
}


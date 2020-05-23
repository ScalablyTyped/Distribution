package typings.rcRate.starMod

import typings.react.mod.Component
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Star
  extends Component[StarProps, js.Object, js.Any] {
  var onHover: MouseEventHandler[HTMLDivElement] = js.native
  var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  def getClassName(): String = js.native
  def onClick(e: js.Any): Unit = js.native
}


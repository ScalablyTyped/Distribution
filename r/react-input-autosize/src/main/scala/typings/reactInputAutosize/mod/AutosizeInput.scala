package typings.reactInputAutosize.mod

import typings.react.mod.Component
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosizeInput
  extends Component[AutosizeInputProps, js.Object, js.Any] {
  def copyInputStyles(): Unit = js.native
  def getInput(): HTMLInputElement = js.native
}


package typings.rcSlider.handleMod

import typings.rcSlider.anon.ClickFocused
import typings.rcSlider.anon.Remove
import typings.react.mod.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handle
  extends Component[HandleProps, js.Object, js.Any] {
  var handle: HTMLElement = js.native
  var onMouseUpListener: Remove = js.native
  @JSName("state")
  var state_Handle: ClickFocused = js.native
  def blur(): Unit = js.native
  def clickFocus(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MHandle(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MHandle(): Unit = js.native
  def focus(): Unit = js.native
  def handleBlur(): Unit = js.native
  def handleKeyDown(): Unit = js.native
  def handleMouseDown(e: js.Any): Unit = js.native
  def handleMouseUp(): Unit = js.native
  def setClickFocus(focused: js.Any): Unit = js.native
  def setHandleRef(node: js.Any): Unit = js.native
}


package typings.rcTextarea.resizableTextAreaMod

import typings.rcTextarea.anon.Height
import typings.rcTextarea.mod.TextAreaProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizableTextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var nextFrameActionId: Double = js.native
  var resizeFrameId: Double = js.native
  var textArea: HTMLTextAreaElement = js.native
  @JSName("componentDidMount")
  def componentDidMount_MResizableTextArea(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MResizableTextArea(prevProps: TextAreaProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResizableTextArea(): Unit = js.native
  def fixFirefoxAutoScroll(): Unit = js.native
  def handleResize(size: Height): Unit = js.native
  def renderTextArea(): Element = js.native
  def resizeOnNextFrame(): Unit = js.native
  def resizeTextarea(): Unit = js.native
  def saveTextArea(textArea: HTMLTextAreaElement): Unit = js.native
}


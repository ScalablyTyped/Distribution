package typings.reactDashAce.libAceMod

import typings.react.reactMod.Component
import typings.reactDashAce.libAceEditorClassMod.AceEditorClass
import typings.reactDashAce.libTypesMod.IMarker
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactAce
  extends Component[IAceEditorProps, js.Object, js.Any] {
  var editor: AceEditorClass = js.native
  var refEditor: HTMLElement = js.native
  var silent: Boolean = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactAce(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactAce(prevProps: IAceEditorProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactAce(): Unit = js.native
  def debounce(fn: js.Any, delay: Double): js.Function1[/* args */ js.Any, Unit] = js.native
  def handleMarkers(markers: js.Array[IMarker]): Unit = js.native
  def handleOptions(props: IAceEditorProps): Unit = js.native
  def handleScrollMargins(): Unit = js.native
  def handleScrollMargins(margins: js.Array[Double]): Unit = js.native
  def onBlur(event: js.Any): Unit = js.native
  def onChange(event: js.Any): Unit = js.native
  def onCopy(text: String): Unit = js.native
  def onCursorChange(event: js.Any): Unit = js.native
  def onFocus(event: js.Any): Unit = js.native
  def onInput(event: js.Any): Unit = js.native
  def onPaste(text: String): Unit = js.native
  def onScroll(): Unit = js.native
  def onSelectionChange(event: js.Any): Unit = js.native
  def updatePlaceholder(): Unit = js.native
  def updateRef(item: HTMLElement): Unit = js.native
}


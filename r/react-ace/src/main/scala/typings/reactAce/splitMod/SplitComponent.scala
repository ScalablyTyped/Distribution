package typings.reactAce.splitMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactAce.typesMod.IMarker
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitComponent
  extends Component[ISplitEditorProps, js.UndefOr[scala.Nothing], js.Any]
     with /* index */ StringDictionary[js.Any] {
  var editor: IAceEditorClass = js.native
  var refEditor: HTMLElement = js.native
  var silent: Boolean = js.native
  var split: IAceEditorClass = js.native
  var splitEditor: IAceEditorClass = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSplitComponent(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSplitComponent(prevProps: ISplitEditorProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSplitComponent(): Unit = js.native
  def debounce(fn: js.Any, delay: Double): js.Function1[/* args */ js.Any, Unit] = js.native
  def handleMarkers(markers: js.Array[IMarker], editor: IAceEditorClass): Unit = js.native
  def handleOptions(props: ISplitEditorProps, editor: IAceEditorClass): Unit = js.native
  def isInShadow(node: HTMLElement): Boolean = js.native
  def onBlur(event: js.Any): Unit = js.native
  def onChange(event: js.Any): Unit = js.native
  def onCopy(text: String): Unit = js.native
  def onCursorChange(event: js.Any): Unit = js.native
  def onFocus(event: js.Any): Unit = js.native
  def onInput(event: js.Any): Unit = js.native
  def onPaste(text: String): Unit = js.native
  def onScroll(): Unit = js.native
  def onSelectionChange(event: js.Any): Unit = js.native
  def updateRef(item: HTMLElement): Unit = js.native
}


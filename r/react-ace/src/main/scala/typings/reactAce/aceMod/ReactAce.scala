package typings.reactAce.aceMod

import typings.react.mod.Component
import typings.reactAce.anon.Text
import typings.reactAce.typesMod.IAceEditor
import typings.reactAce.typesMod.IMarker
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactAce
  extends Component[IAceEditorProps, js.Object, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MReactAce(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactAce(prevProps: IAceEditorProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactAce(): Unit = js.native
  
  def debounce(fn: js.Any, delay: Double): js.Function1[/* args */ js.Any, Unit] = js.native
  
  var editor: IAceEditor = js.native
  
  def handleMarkers(markers: js.Array[IMarker]): Unit = js.native
  
  def handleOptions(props: IAceEditorProps): Unit = js.native
  
  def handleScrollMargins(): Unit = js.native
  def handleScrollMargins(margins: js.Array[Double]): Unit = js.native
  
  def isInShadow(node: HTMLElement): Boolean = js.native
  
  def onBlur(event: js.Any): Unit = js.native
  
  def onChange(event: js.Any): Unit = js.native
  
  def onCopy(hasText: Text): Unit = js.native
  
  def onCursorChange(event: js.Any): Unit = js.native
  
  def onFocus(event: js.Any): Unit = js.native
  
  def onInput(): Unit = js.native
  def onInput(event: js.Any): Unit = js.native
  
  def onPaste(hasText: Text): Unit = js.native
  
  def onScroll(): Unit = js.native
  
  def onSelectionChange(event: js.Any): Unit = js.native
  
  var refEditor: HTMLElement = js.native
  
  var silent: Boolean = js.native
  
  def updatePlaceholder(): Unit = js.native
  
  def updateRef(item: HTMLElement): Unit = js.native
}

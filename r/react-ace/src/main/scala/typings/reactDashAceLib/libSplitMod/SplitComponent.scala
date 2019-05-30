package typings
package reactDashAceLib.libSplitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitComponent
  extends reactLib.reactMod.Component[ISplitEditorProps, js.UndefOr[scala.Nothing], js.Any]
     with /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var editor: IAceEditorClass = js.native
  var refEditor: stdLib.HTMLElement = js.native
  var silent: scala.Boolean = js.native
  var split: IAceEditorClass = js.native
  var splitEditor: IAceEditorClass = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSplitComponent(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSplitComponent(prevProps: ISplitEditorProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSplitComponent(): scala.Unit = js.native
  def debounce(fn: js.Any, delay: scala.Double): js.Function1[/* args */ js.Any, scala.Unit] = js.native
  def handleMarkers(markers: js.Array[reactDashAceLib.libTypesMod.IMarker], editor: IAceEditorClass): scala.Unit = js.native
  def handleOptions(props: ISplitEditorProps, editor: IAceEditorClass): scala.Unit = js.native
  def onBlur(event: js.Any): scala.Unit = js.native
  def onChange(event: js.Any): scala.Unit = js.native
  def onCopy(text: java.lang.String): scala.Unit = js.native
  def onCursorChange(event: js.Any): scala.Unit = js.native
  def onFocus(event: js.Any): scala.Unit = js.native
  def onInput(event: js.Any): scala.Unit = js.native
  def onPaste(text: java.lang.String): scala.Unit = js.native
  def onScroll(): scala.Unit = js.native
  def onSelectionChange(event: js.Any): scala.Unit = js.native
  def updateRef(item: stdLib.HTMLElement): scala.Unit = js.native
}


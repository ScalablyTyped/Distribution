package typings
package reactDashAceLib.libAceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactAce
  extends reactLib.reactMod.Component[IAceEditorProps, js.Object, js.Any]
     with /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var editor: reactDashAceLib.libAceEditorClassMod.AceEditorClass = js.native
  var refEditor: stdLib.HTMLElement = js.native
  var silent: scala.Boolean = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactAce(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactAce(prevProps: IAceEditorProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactAce(): scala.Unit = js.native
  def debounce(fn: js.Any, delay: scala.Double): js.Function1[/* args */ js.Any, scala.Unit] = js.native
  def handleMarkers(markers: js.Array[reactDashAceLib.libTypesMod.IMarker]): scala.Unit = js.native
  def handleOptions(props: IAceEditorProps): scala.Unit = js.native
  def handleScrollMargins(): scala.Unit = js.native
  def handleScrollMargins(margins: js.Array[scala.Double]): scala.Unit = js.native
  def onBlur(event: js.Any): scala.Unit = js.native
  def onChange(event: js.Any): scala.Unit = js.native
  def onCopy(text: java.lang.String): scala.Unit = js.native
  def onCursorChange(event: js.Any): scala.Unit = js.native
  def onFocus(event: js.Any): scala.Unit = js.native
  def onInput(event: js.Any): scala.Unit = js.native
  def onPaste(text: java.lang.String): scala.Unit = js.native
  def onScroll(): scala.Unit = js.native
  def onSelectionChange(event: js.Any): scala.Unit = js.native
  def updatePlaceholder(): scala.Unit = js.native
  def updateRef(item: stdLib.HTMLElement): scala.Unit = js.native
}


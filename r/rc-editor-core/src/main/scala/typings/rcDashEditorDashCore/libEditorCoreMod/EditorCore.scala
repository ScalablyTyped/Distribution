package typings.rcDashEditorDashCore.libEditorCoreMod

import typings.draftDashJs.draftDashJsMod.EditorState
import typings.rcDashEditorDashCore.Anon_Editor
import typings.rcDashEditorDashCore.Anon_EditorStateFocusEditor
import typings.rcDashEditorDashCore.rcDashEditorDashCoreStrings.`not-handled`
import typings.rcDashEditorDashCore.rcDashEditorDashCoreStrings.handled
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorCore
  extends Component[EditorProps, EditorCoreState, js.Any] {
  var _editorWrapper: js.Any = js.native
  var _focusDummy: js.Any = js.native
  var cancelForceUpdateImmediate: js.Any = js.native
  var controlledMode: js.Any = js.native
  var forceUpdateImmediate: js.Any = js.native
  var plugins: js.Any = js.native
  @JSName("refs")
  var refs_EditorCore: Anon_Editor = js.native
  def Reset(): Unit = js.native
  def SetText(text: String): Unit = js.native
  /* private */ def _focus(ev: js.Any): js.Any = js.native
  def blockRendererFn(contentBlock: js.Any): Null = js.native
  @JSName("componentWillMount")
  def componentWillMount_MEditorCore(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MEditorCore(nextProps: js.Any): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MEditorCore(): Unit = js.native
  def customStyleFn(styleSet: js.Any): js.Object = js.native
  def eventHandle(eventName: js.Any, args: js.Any*): DraftHandleValue = js.native
  def focus(ev: js.Any): Unit = js.native
  /* private */ def focusEditor(ev: js.Any): js.Any = js.native
  def generatorDefaultValue(editorState: EditorState): EditorState = js.native
  def generatorEventHandler(eventName: js.Any): js.Function = js.native
  def getBlockStyle(contentBlock: js.Any): String = js.native
  def getChildContext(): Anon_EditorStateFocusEditor = js.native
  def getDefaultValue(): EditorState = js.native
  def getEditorState(): EditorState = js.native
  def getEditorState(needFocus: Boolean): EditorState = js.native
  def getEventHandler(): js.Object = js.native
  def getPlugins(): js.Array[Plugin] = js.native
  def getStyleMap(): js.Object = js.native
  def handleKeyBinding(ev: js.Any): js.Any = js.native
  def handleKeyCommand(command: String): DraftHandleValue = js.native
  def handlePastedText(text: String, html: String): handled | `not-handled` = js.native
  def initPlugins(): js.Array[_] = js.native
  def reloadPlugins(): js.Array[Plugin] = js.native
  def setEditorState(editorState: EditorState): Unit = js.native
  def setEditorState(editorState: EditorState, focusEditor: Boolean): Unit = js.native
  def setEditorState(editorState: EditorState, focusEditor: Boolean, triggerChange: Boolean): Unit = js.native
  def setStyleMap(customStyleMap: js.Any): Unit = js.native
}


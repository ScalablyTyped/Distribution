package typings
package rcDashEditorDashCoreLib.esEditorCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorCore
  extends reactLib.reactMod.Component[EditorProps, EditorCoreState, js.Any] {
  var _editorWrapper: js.Any = js.native
  var _focusDummy: js.Any = js.native
  var cancelForceUpdateImmediate: js.Any = js.native
  var controlledMode: js.Any = js.native
  var forceUpdateImmediate: js.Any = js.native
  var plugins: js.Any = js.native
  @JSName("refs")
  var refs_EditorCore: rcDashEditorDashCoreLib.Anon_Editor = js.native
  def Reset(): scala.Unit = js.native
  def SetText(text: java.lang.String): scala.Unit = js.native
  /* private */ def _focus(ev: js.Any): js.Any = js.native
  def blockRendererFn(contentBlock: js.Any): scala.Null = js.native
  @JSName("componentWillMount")
  def componentWillMount_MEditorCore(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MEditorCore(nextProps: js.Any): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MEditorCore(): scala.Unit = js.native
  def customStyleFn(styleSet: js.Any): js.Object = js.native
  def eventHandle(eventName: js.Any, args: js.Any*): DraftHandleValue = js.native
  def focus(ev: js.Any): scala.Unit = js.native
  /* private */ def focusEditor(ev: js.Any): js.Any = js.native
  def generatorDefaultValue(editorState: draftDashJsLib.draftDashJsMod.EditorState): draftDashJsLib.draftDashJsMod.EditorState = js.native
  def generatorEventHandler(eventName: js.Any): js.Function = js.native
  def getBlockStyle(contentBlock: js.Any): java.lang.String = js.native
  def getChildContext(): rcDashEditorDashCoreLib.Anon_EditorStateFocusEditor = js.native
  def getDefaultValue(): draftDashJsLib.draftDashJsMod.EditorState = js.native
  def getEditorState(): draftDashJsLib.draftDashJsMod.EditorState = js.native
  def getEditorState(needFocus: scala.Boolean): draftDashJsLib.draftDashJsMod.EditorState = js.native
  def getEventHandler(): js.Object = js.native
  def getPlugins(): js.Array[Plugin] = js.native
  def getStyleMap(): js.Object = js.native
  def handleKeyBinding(ev: js.Any): js.Any = js.native
  def handleKeyCommand(command: java.lang.String): DraftHandleValue = js.native
  def handlePastedText(text: java.lang.String, html: java.lang.String): rcDashEditorDashCoreLib.rcDashEditorDashCoreLibStrings.handled | rcDashEditorDashCoreLib.rcDashEditorDashCoreLibStrings.`not-handled` = js.native
  def initPlugins(): js.Array[_] = js.native
  def reloadPlugins(): js.Array[Plugin] = js.native
  def setEditorState(editorState: draftDashJsLib.draftDashJsMod.EditorState): scala.Unit = js.native
  def setEditorState(editorState: draftDashJsLib.draftDashJsMod.EditorState, focusEditor: scala.Boolean): scala.Unit = js.native
  def setEditorState(
    editorState: draftDashJsLib.draftDashJsMod.EditorState,
    focusEditor: scala.Boolean,
    triggerChange: scala.Boolean
  ): scala.Unit = js.native
  def setStyleMap(customStyleMap: js.Any): scala.Unit = js.native
}


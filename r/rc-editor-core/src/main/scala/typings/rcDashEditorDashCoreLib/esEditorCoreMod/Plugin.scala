package typings
package rcDashEditorDashCoreLib.esEditorCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var blockRendererFn: js.UndefOr[js.Function] = js.undefined
  var callbacks: rcDashEditorDashCoreLib.Anon_EditorState
  var component: js.UndefOr[js.Function] = js.undefined
  var config: js.UndefOr[js.Object] = js.undefined
  var customStyleFn: js.UndefOr[js.Function] = js.undefined
  var decorators: js.UndefOr[js.Array[_]] = js.undefined
  var name: java.lang.String
  def onChange(editorState: draftDashJsLib.draftDashJsMod.EditorState): draftDashJsLib.draftDashJsMod.EditorState
}

object Plugin {
  @scala.inline
  def apply(
    callbacks: rcDashEditorDashCoreLib.Anon_EditorState,
    name: java.lang.String,
    onChange: draftDashJsLib.draftDashJsMod.EditorState => draftDashJsLib.draftDashJsMod.EditorState,
    blockRendererFn: js.Function = null,
    component: js.Function = null,
    config: js.Object = null,
    customStyleFn: js.Function = null,
    decorators: js.Array[_] = null
  ): Plugin = {
    val __obj = js.Dynamic.literal(callbacks = callbacks, name = name, onChange = js.Any.fromFunction1(onChange))
    if (blockRendererFn != null) __obj.updateDynamic("blockRendererFn")(blockRendererFn)
    if (component != null) __obj.updateDynamic("component")(component)
    if (config != null) __obj.updateDynamic("config")(config)
    if (customStyleFn != null) __obj.updateDynamic("customStyleFn")(customStyleFn)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    __obj.asInstanceOf[Plugin]
  }
}


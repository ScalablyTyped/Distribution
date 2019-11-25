package typings.rcDashEditorDashCore.libEditorCoreMod

import typings.draftDashJs.draftDashJsMod.EditorState
import typings.rcDashEditorDashCore.Anon_EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var blockRendererFn: js.UndefOr[js.Function] = js.undefined
  var callbacks: Anon_EditorState
  var component: js.UndefOr[js.Function] = js.undefined
  var config: js.UndefOr[js.Object] = js.undefined
  var customStyleFn: js.UndefOr[js.Function] = js.undefined
  var decorators: js.UndefOr[js.Array[_]] = js.undefined
  var name: String
  def onChange(editorState: EditorState): EditorState
}

object Plugin {
  @scala.inline
  def apply(
    callbacks: Anon_EditorState,
    name: String,
    onChange: EditorState => EditorState,
    blockRendererFn: js.Function = null,
    component: js.Function = null,
    config: js.Object = null,
    customStyleFn: js.Function = null,
    decorators: js.Array[_] = null
  ): Plugin = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (blockRendererFn != null) __obj.updateDynamic("blockRendererFn")(blockRendererFn.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (customStyleFn != null) __obj.updateDynamic("customStyleFn")(customStyleFn.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
}


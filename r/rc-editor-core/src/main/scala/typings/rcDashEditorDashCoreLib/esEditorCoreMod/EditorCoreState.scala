package typings
package rcDashEditorDashCoreLib.esEditorCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorCoreState extends js.Object {
  var blockRenderMap: js.UndefOr[
    immutableLib.immutableMod.Map[
      java.lang.String, 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftBlockRenderConfig
    ]
  ] = js.undefined
  var compositeDecorator: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CompositeDecorator */ js.Any
  ] = js.undefined
  var customBlockStyleMap: js.UndefOr[js.Object] = js.undefined
  var customStyleMap: js.UndefOr[js.Object] = js.undefined
  var editorState: js.UndefOr[draftDashJsLib.draftDashJsMod.EditorState] = js.undefined
  var inlineStyleOverride: js.UndefOr[draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftInlineStyle] = js.undefined
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  var toolbarPlugins: js.UndefOr[immutableLib.immutableMod.List[Plugin]] = js.undefined
}

object EditorCoreState {
  @scala.inline
  def apply(
    blockRenderMap: immutableLib.immutableMod.Map[
      java.lang.String, 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftBlockRenderConfig
    ] = null,
    compositeDecorator: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CompositeDecorator */ js.Any = null,
    customBlockStyleMap: js.Object = null,
    customStyleMap: js.Object = null,
    editorState: draftDashJsLib.draftDashJsMod.EditorState = null,
    inlineStyleOverride: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftInlineStyle = null,
    plugins: js.Array[Plugin] = null,
    toolbarPlugins: immutableLib.immutableMod.List[Plugin] = null
  ): EditorCoreState = {
    val __obj = js.Dynamic.literal()
    if (blockRenderMap != null) __obj.updateDynamic("blockRenderMap")(blockRenderMap)
    if (compositeDecorator != null) __obj.updateDynamic("compositeDecorator")(compositeDecorator)
    if (customBlockStyleMap != null) __obj.updateDynamic("customBlockStyleMap")(customBlockStyleMap)
    if (customStyleMap != null) __obj.updateDynamic("customStyleMap")(customStyleMap)
    if (editorState != null) __obj.updateDynamic("editorState")(editorState)
    if (inlineStyleOverride != null) __obj.updateDynamic("inlineStyleOverride")(inlineStyleOverride)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (toolbarPlugins != null) __obj.updateDynamic("toolbarPlugins")(toolbarPlugins)
    __obj.asInstanceOf[EditorCoreState]
  }
}


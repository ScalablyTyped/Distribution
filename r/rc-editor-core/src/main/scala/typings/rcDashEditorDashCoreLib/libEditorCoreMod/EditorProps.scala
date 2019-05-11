package typings
package rcDashEditorDashCoreLib.libEditorCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProps extends js.Object {
  var defaultValue: js.UndefOr[draftDashJsLib.draftDashJsMod.EditorState] = js.undefined
  var multiLines: scala.Boolean
  var onBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* editorState */ draftDashJsLib.draftDashJsMod.EditorState, 
      draftDashJsLib.draftDashJsMod.EditorState
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ js.Any, scala.Boolean]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var pluginConfig: js.UndefOr[js.Object] = js.undefined
  var plugins: js.Array[Plugin]
  var prefixCls: java.lang.String
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var splitLine: java.lang.String
  var style: js.UndefOr[js.Object] = js.undefined
  var toolbars: js.Array[_]
  var value: js.UndefOr[draftDashJsLib.draftDashJsMod.EditorState | js.Any] = js.undefined
}

object EditorProps {
  @scala.inline
  def apply(
    multiLines: scala.Boolean,
    plugins: js.Array[Plugin],
    prefixCls: java.lang.String,
    splitLine: java.lang.String,
    toolbars: js.Array[_],
    defaultValue: draftDashJsLib.draftDashJsMod.EditorState = null,
    onBlur: () => scala.Unit = null,
    onChange: /* editorState */ draftDashJsLib.draftDashJsMod.EditorState => draftDashJsLib.draftDashJsMod.EditorState = null,
    onFocus: () => scala.Unit = null,
    onKeyDown: /* ev */ js.Any => scala.Boolean = null,
    placeholder: java.lang.String = null,
    pluginConfig: js.Object = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null,
    value: draftDashJsLib.draftDashJsMod.EditorState | js.Any = null
  ): EditorProps = {
    val __obj = js.Dynamic.literal(multiLines = multiLines, plugins = plugins, prefixCls = prefixCls, splitLine = splitLine, toolbars = toolbars)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (pluginConfig != null) __obj.updateDynamic("pluginConfig")(pluginConfig)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorProps]
  }
}


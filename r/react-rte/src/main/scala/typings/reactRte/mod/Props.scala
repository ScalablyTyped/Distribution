package typings.reactRte.mod

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.ContentBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var blockStyleFn: js.UndefOr[js.Function1[/* block */ ContentBlock, js.UndefOr[String]]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var customControls: js.UndefOr[js.Array[CustomControl]] = js.undefined
  var customStyleMap: js.UndefOr[StringDictionary[StringDictionary[js.Any]]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var editorClassName: js.UndefOr[String] = js.undefined
  var editorStyle: js.UndefOr[js.Object] = js.undefined
  var handleReturn: js.UndefOr[js.Function1[/* event */ js.Object, Boolean]] = js.undefined
  var keyBindingFn: js.UndefOr[js.Function1[/* event */ js.Object, js.UndefOr[String]]] = js.undefined
  var onChange: js.UndefOr[ChangeHandler] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var rootStyle: js.UndefOr[js.Object] = js.undefined
  var toolbarClassName: js.UndefOr[String] = js.undefined
   // Alias of readOnly
  var toolbarConfig: js.UndefOr[ToolbarConfig] = js.undefined
  var toolbarStyle: js.UndefOr[js.Object] = js.undefined
  var value: EditorValue
}

object Props {
  @scala.inline
  def apply(
    value: EditorValue,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    blockStyleFn: /* block */ ContentBlock => js.UndefOr[String] = null,
    className: String = null,
    customControls: js.Array[CustomControl] = null,
    customStyleMap: StringDictionary[StringDictionary[js.Any]] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editorClassName: String = null,
    editorStyle: js.Object = null,
    handleReturn: /* event */ js.Object => Boolean = null,
    keyBindingFn: /* event */ js.Object => js.UndefOr[String] = null,
    onChange: /* value */ EditorValue => js.Any = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rootStyle: js.Object = null,
    toolbarClassName: String = null,
    toolbarConfig: ToolbarConfig = null,
    toolbarStyle: js.Object = null
  ): Props = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (blockStyleFn != null) __obj.updateDynamic("blockStyleFn")(js.Any.fromFunction1(blockStyleFn))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customControls != null) __obj.updateDynamic("customControls")(customControls.asInstanceOf[js.Any])
    if (customStyleMap != null) __obj.updateDynamic("customStyleMap")(customStyleMap.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (editorClassName != null) __obj.updateDynamic("editorClassName")(editorClassName.asInstanceOf[js.Any])
    if (editorStyle != null) __obj.updateDynamic("editorStyle")(editorStyle.asInstanceOf[js.Any])
    if (handleReturn != null) __obj.updateDynamic("handleReturn")(js.Any.fromFunction1(handleReturn))
    if (keyBindingFn != null) __obj.updateDynamic("keyBindingFn")(js.Any.fromFunction1(keyBindingFn))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (rootStyle != null) __obj.updateDynamic("rootStyle")(rootStyle.asInstanceOf[js.Any])
    if (toolbarClassName != null) __obj.updateDynamic("toolbarClassName")(toolbarClassName.asInstanceOf[js.Any])
    if (toolbarConfig != null) __obj.updateDynamic("toolbarConfig")(toolbarConfig.asInstanceOf[js.Any])
    if (toolbarStyle != null) __obj.updateDynamic("toolbarStyle")(toolbarStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


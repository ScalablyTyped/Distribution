package typings
package reactDashRteLib.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var blockStyleFn: js.UndefOr[
    js.Function1[
      /* block */ draftDashJsLib.draftDashJsMod.ContentBlock, 
      js.UndefOr[java.lang.String]
    ]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var customControls: js.UndefOr[js.Array[reactDashRteLib.CustomControl]] = js.undefined
  var customStyleMap: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]]
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var editorClassName: js.UndefOr[java.lang.String] = js.undefined
  var editorStyle: js.UndefOr[js.Object] = js.undefined
  var handleReturn: js.UndefOr[js.Function1[/* event */ js.Object, scala.Boolean]] = js.undefined
  var keyBindingFn: js.UndefOr[js.Function1[/* event */ js.Object, js.UndefOr[java.lang.String]]] = js.undefined
  var onChange: js.UndefOr[reactDashRteLib.ChangeHandler] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var rootStyle: js.UndefOr[js.Object] = js.undefined
  var toolbarClassName: js.UndefOr[java.lang.String] = js.undefined
   // Alias of readOnly
  var toolbarConfig: js.UndefOr[ToolbarConfig] = js.undefined
  var toolbarStyle: js.UndefOr[js.Object] = js.undefined
  var value: EditorValue
}

object Props {
  @scala.inline
  def apply(
    value: EditorValue,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    blockStyleFn: /* block */ draftDashJsLib.draftDashJsMod.ContentBlock => js.UndefOr[java.lang.String] = null,
    className: java.lang.String = null,
    customControls: js.Array[reactDashRteLib.CustomControl] = null,
    customStyleMap: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    editorClassName: java.lang.String = null,
    editorStyle: js.Object = null,
    handleReturn: /* event */ js.Object => scala.Boolean = null,
    keyBindingFn: /* event */ js.Object => js.UndefOr[java.lang.String] = null,
    onChange: reactDashRteLib.ChangeHandler = null,
    placeholder: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    rootStyle: js.Object = null,
    toolbarClassName: java.lang.String = null,
    toolbarConfig: ToolbarConfig = null,
    toolbarStyle: js.Object = null
  ): Props = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (blockStyleFn != null) __obj.updateDynamic("blockStyleFn")(js.Any.fromFunction1(blockStyleFn))
    if (className != null) __obj.updateDynamic("className")(className)
    if (customControls != null) __obj.updateDynamic("customControls")(customControls)
    if (customStyleMap != null) __obj.updateDynamic("customStyleMap")(customStyleMap)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (editorClassName != null) __obj.updateDynamic("editorClassName")(editorClassName)
    if (editorStyle != null) __obj.updateDynamic("editorStyle")(editorStyle)
    if (handleReturn != null) __obj.updateDynamic("handleReturn")(js.Any.fromFunction1(handleReturn))
    if (keyBindingFn != null) __obj.updateDynamic("keyBindingFn")(js.Any.fromFunction1(keyBindingFn))
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (rootStyle != null) __obj.updateDynamic("rootStyle")(rootStyle)
    if (toolbarClassName != null) __obj.updateDynamic("toolbarClassName")(toolbarClassName)
    if (toolbarConfig != null) __obj.updateDynamic("toolbarConfig")(toolbarConfig)
    if (toolbarStyle != null) __obj.updateDynamic("toolbarStyle")(toolbarStyle)
    __obj.asInstanceOf[Props]
  }
}


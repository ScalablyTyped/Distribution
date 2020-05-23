package typings.reactNativeZssRichTextEditor.anon

import typings.react.mod.ReactNode
import typings.reactNativeZssRichTextEditor.mod.ACTIONS
import typings.reactNativeZssRichTextEditor.mod.ElementStyles
import typings.reactNativeZssRichTextEditor.mod.FunctionWithZeroArgs
import typings.reactNativeZssRichTextEditor.mod.IconsMap
import typings.reactNativeZssRichTextEditor.mod.RichTextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextToolbarProps> */
trait PartialRichTextToolbarPro extends js.Object {
  var actions: js.UndefOr[js.Array[ACTIONS]] = js.undefined
  var getEditor: js.UndefOr[js.Function0[RichTextEditor]] = js.undefined
  var iconMap: js.UndefOr[IconsMap] = js.undefined
  var iconTint: js.UndefOr[String] = js.undefined
  var onPressAddImage: js.UndefOr[FunctionWithZeroArgs] = js.undefined
  var onPressAddLink: js.UndefOr[FunctionWithZeroArgs] = js.undefined
  var renderAction: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var selectedButtonStyle: js.UndefOr[ElementStyles] = js.undefined
  var selectedIconTint: js.UndefOr[String] = js.undefined
  var unselectedButtonStyle: js.UndefOr[ElementStyles] = js.undefined
}

object PartialRichTextToolbarPro {
  @scala.inline
  def apply(
    actions: js.Array[ACTIONS] = null,
    getEditor: () => RichTextEditor = null,
    iconMap: IconsMap = null,
    iconTint: String = null,
    onPressAddImage: () => Unit = null,
    onPressAddLink: () => Unit = null,
    renderAction: () => ReactNode = null,
    selectedButtonStyle: js.UndefOr[Null | ElementStyles] = js.undefined,
    selectedIconTint: String = null,
    unselectedButtonStyle: js.UndefOr[Null | ElementStyles] = js.undefined
  ): PartialRichTextToolbarPro = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (getEditor != null) __obj.updateDynamic("getEditor")(js.Any.fromFunction0(getEditor))
    if (iconMap != null) __obj.updateDynamic("iconMap")(iconMap.asInstanceOf[js.Any])
    if (iconTint != null) __obj.updateDynamic("iconTint")(iconTint.asInstanceOf[js.Any])
    if (onPressAddImage != null) __obj.updateDynamic("onPressAddImage")(js.Any.fromFunction0(onPressAddImage))
    if (onPressAddLink != null) __obj.updateDynamic("onPressAddLink")(js.Any.fromFunction0(onPressAddLink))
    if (renderAction != null) __obj.updateDynamic("renderAction")(js.Any.fromFunction0(renderAction))
    if (!js.isUndefined(selectedButtonStyle)) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (selectedIconTint != null) __obj.updateDynamic("selectedIconTint")(selectedIconTint.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectedButtonStyle)) __obj.updateDynamic("unselectedButtonStyle")(unselectedButtonStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRichTextToolbarPro]
  }
}


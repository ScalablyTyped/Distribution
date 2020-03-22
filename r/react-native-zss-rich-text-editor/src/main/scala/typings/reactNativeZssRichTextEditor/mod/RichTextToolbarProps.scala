package typings.reactNativeZssRichTextEditor.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextToolbarOptionalProps> */
trait RichTextToolbarProps extends js.Object {
  var actions: js.UndefOr[js.Array[ACTIONS]] = js.undefined
  var iconMap: js.UndefOr[IconsMap] = js.undefined
  var iconTint: js.UndefOr[String] = js.undefined
  var onPressAddImage: js.UndefOr[FunctionWithZeroArgs] = js.undefined
  var onPressAddLink: js.UndefOr[FunctionWithZeroArgs] = js.undefined
  var renderAction: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var selectedButtonStyle: js.UndefOr[ElementStyles] = js.undefined
  var selectedIconTint: js.UndefOr[String] = js.undefined
  var unselectedButtonStyle: js.UndefOr[ElementStyles] = js.undefined
  // Must provide a function that returns a ref to a RichTextEditor component.
  def getEditor(): RichTextEditor
}

object RichTextToolbarProps {
  @scala.inline
  def apply(
    getEditor: () => RichTextEditor,
    actions: js.Array[ACTIONS] = null,
    iconMap: IconsMap = null,
    iconTint: String = null,
    onPressAddImage: () => Unit = null,
    onPressAddLink: () => Unit = null,
    renderAction: () => ReactNode = null,
    selectedButtonStyle: ElementStyles = null,
    selectedIconTint: String = null,
    unselectedButtonStyle: ElementStyles = null
  ): RichTextToolbarProps = {
    val __obj = js.Dynamic.literal(getEditor = js.Any.fromFunction0(getEditor))
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (iconMap != null) __obj.updateDynamic("iconMap")(iconMap.asInstanceOf[js.Any])
    if (iconTint != null) __obj.updateDynamic("iconTint")(iconTint.asInstanceOf[js.Any])
    if (onPressAddImage != null) __obj.updateDynamic("onPressAddImage")(js.Any.fromFunction0(onPressAddImage))
    if (onPressAddLink != null) __obj.updateDynamic("onPressAddLink")(js.Any.fromFunction0(onPressAddLink))
    if (renderAction != null) __obj.updateDynamic("renderAction")(js.Any.fromFunction0(renderAction))
    if (selectedButtonStyle != null) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (selectedIconTint != null) __obj.updateDynamic("selectedIconTint")(selectedIconTint.asInstanceOf[js.Any])
    if (unselectedButtonStyle != null) __obj.updateDynamic("unselectedButtonStyle")(unselectedButtonStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichTextToolbarProps]
  }
}


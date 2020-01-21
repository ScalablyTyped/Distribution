package typings.reactNativeZssRichTextEditor.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichTextToolbarOptionalProps extends js.Object {
  // An array of actions to be provided by this toolbar.
  var actions: js.Array[ACTIONS]
  var iconMap: IconsMap
  var iconTint: String
  var onPressAddImage: FunctionWithZeroArgs
  // Functions called when the addLink or addImage actions are tapped.
  var onPressAddLink: FunctionWithZeroArgs
  var selectedButtonStyle: ElementStyles
  var selectedIconTint: String
  var unselectedButtonStyle: ElementStyles
  def renderAction(): ReactNode
}

object RichTextToolbarOptionalProps {
  @scala.inline
  def apply(
    actions: js.Array[ACTIONS],
    iconMap: IconsMap,
    iconTint: String,
    onPressAddImage: () => Unit,
    onPressAddLink: () => Unit,
    renderAction: () => ReactNode,
    selectedIconTint: String,
    selectedButtonStyle: ElementStyles = null,
    unselectedButtonStyle: ElementStyles = null
  ): RichTextToolbarOptionalProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], iconMap = iconMap.asInstanceOf[js.Any], iconTint = iconTint.asInstanceOf[js.Any], onPressAddImage = js.Any.fromFunction0(onPressAddImage), onPressAddLink = js.Any.fromFunction0(onPressAddLink), renderAction = js.Any.fromFunction0(renderAction), selectedIconTint = selectedIconTint.asInstanceOf[js.Any])
    if (selectedButtonStyle != null) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (unselectedButtonStyle != null) __obj.updateDynamic("unselectedButtonStyle")(unselectedButtonStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichTextToolbarOptionalProps]
  }
}


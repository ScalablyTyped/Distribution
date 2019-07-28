package typings.reactDashNativeDashZssDashRichDashTextDashEditor.reactDashNativeDashZssDashRichDashTextDashEditorMod

import typings.react.reactMod.ReactNode
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
    onPressAddImage: FunctionWithZeroArgs,
    onPressAddLink: FunctionWithZeroArgs,
    renderAction: () => ReactNode,
    selectedButtonStyle: ElementStyles,
    selectedIconTint: String,
    unselectedButtonStyle: ElementStyles
  ): RichTextToolbarOptionalProps = {
    val __obj = js.Dynamic.literal(actions = actions, iconMap = iconMap, iconTint = iconTint, onPressAddImage = onPressAddImage, onPressAddLink = onPressAddLink, renderAction = js.Any.fromFunction0(renderAction), selectedButtonStyle = selectedButtonStyle.asInstanceOf[js.Any], selectedIconTint = selectedIconTint, unselectedButtonStyle = unselectedButtonStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RichTextToolbarOptionalProps]
  }
}


package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.default
import typings.reactNativeNavigation.reactNativeNavigationStrings.destructive
import typings.reactNativeNavigation.reactNativeNavigationStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPreviewAction extends js.Object {
  /**
    * Subactions that will be shown when this action is pressed.
    */
  var actions: js.UndefOr[js.Array[OptionsPreviewAction]] = js.undefined
  /**
    * Reference ID to get callbacks from
    */
  var id: String
  /**
    * Action style
    */
  var style: js.UndefOr[default | selected | destructive] = js.undefined
  /**
    * Action text
    */
  var title: String
}

object OptionsPreviewAction {
  @scala.inline
  def apply(
    id: String,
    title: String,
    actions: js.Array[OptionsPreviewAction] = null,
    style: default | selected | destructive = null
  ): OptionsPreviewAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPreviewAction]
  }
}


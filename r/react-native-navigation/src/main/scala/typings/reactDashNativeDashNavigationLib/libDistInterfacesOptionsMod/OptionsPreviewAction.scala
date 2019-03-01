package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

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
  var id: java.lang.String
  /**
    * Action style
    */
  var style: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.default | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.selected | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.destructive
  ] = js.undefined
  /**
    * Action text
    */
  var title: java.lang.String
}

object OptionsPreviewAction {
  @scala.inline
  def apply(
    id: java.lang.String,
    title: java.lang.String,
    actions: js.Array[OptionsPreviewAction] = null,
    style: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.default | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.selected | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.destructive = null
  ): OptionsPreviewAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("title")(title)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPreviewAction]
  }
}


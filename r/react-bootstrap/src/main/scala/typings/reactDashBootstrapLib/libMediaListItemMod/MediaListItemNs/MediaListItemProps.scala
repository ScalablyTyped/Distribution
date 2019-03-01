package typings
package reactDashBootstrapLib.libMediaListItemMod.MediaListItemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaListItemProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libMediaListItemMod.MediaListItem] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object MediaListItemProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libMediaListItemMod.MediaListItem] = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): MediaListItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaListItemProps]
  }
}


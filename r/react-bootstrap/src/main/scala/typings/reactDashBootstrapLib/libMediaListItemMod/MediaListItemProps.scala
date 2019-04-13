package typings
package reactDashBootstrapLib.libMediaListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaListItemProps
  extends reactLib.reactMod.HTMLProps[MediaListItem] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object MediaListItemProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[MediaListItem] = null,
    componentClass: reactLib.reactMod.ReactType[_] = null
  ): MediaListItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaListItemProps]
  }
}


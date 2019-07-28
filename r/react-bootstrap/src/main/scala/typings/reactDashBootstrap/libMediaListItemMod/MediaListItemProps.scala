package typings.reactDashBootstrap.libMediaListItemMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaListItemProps extends HTMLProps[MediaListItem] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object MediaListItemProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[MediaListItem] = null, componentClass: ReactType[_] = null): MediaListItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaListItemProps]
  }
}


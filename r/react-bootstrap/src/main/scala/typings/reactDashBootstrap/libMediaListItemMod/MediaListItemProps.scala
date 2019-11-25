package typings.reactDashBootstrap.libMediaListItemMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaListItemProps
  extends AllHTMLAttributes[MediaListItem]
     with ClassAttributes[MediaListItem] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object MediaListItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[MediaListItem] = null,
    ClassAttributes: ClassAttributes[MediaListItem] = null,
    componentClass: ReactType[_] = null
  ): MediaListItemProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaListItemProps]
  }
}


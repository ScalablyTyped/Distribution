package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]

object DrawerProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    title: String = null
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DrawerProps]
  }
}


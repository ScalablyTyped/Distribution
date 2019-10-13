package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemActionProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var info: js.UndefOr[String] = js.undefined
}

object ListItemActionProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    info: String = null
  ): ListItemActionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (info != null) __obj.updateDynamic("info")(info)
    __obj.asInstanceOf[ListItemActionProps]
  }
}


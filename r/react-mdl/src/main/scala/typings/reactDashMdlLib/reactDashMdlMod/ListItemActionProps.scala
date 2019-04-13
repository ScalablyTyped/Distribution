package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemActionProps
  extends reactLib.reactMod.HTMLProps[js.Any] {
  var info: js.UndefOr[java.lang.String] = js.undefined
}

object ListItemActionProps {
  @scala.inline
  def apply(HTMLProps: reactLib.reactMod.HTMLProps[js.Any] = null, info: java.lang.String = null): ListItemActionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (info != null) __obj.updateDynamic("info")(info)
    __obj.asInstanceOf[ListItemActionProps]
  }
}


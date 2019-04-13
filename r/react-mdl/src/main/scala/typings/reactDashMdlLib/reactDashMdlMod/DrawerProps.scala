package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps
  extends reactLib.reactMod.HTMLProps[js.Any]

object DrawerProps {
  @scala.inline
  def apply(HTMLProps: reactLib.reactMod.HTMLProps[js.Any] = null, title: java.lang.String = null): DrawerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DrawerProps]
  }
}


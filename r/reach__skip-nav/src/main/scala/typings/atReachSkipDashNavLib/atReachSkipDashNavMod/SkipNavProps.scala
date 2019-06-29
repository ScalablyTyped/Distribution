package typings
package atReachSkipDashNavLib.atReachSkipDashNavMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipNavProps extends js.Object {
  var children: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNode] = js.undefined
}

object SkipNavProps {
  @scala.inline
  def apply(children: java.lang.String | reactLib.reactMod.ReactNode = null): SkipNavProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipNavProps]
  }
}


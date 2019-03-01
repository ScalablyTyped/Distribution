package typings
package reactDashMdLib.libGridsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HOCProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object HOCProps {
  @scala.inline
  def apply(className: java.lang.String = null, style: reactLib.reactMod.ReactNs.CSSProperties = null): HOCProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[HOCProps]
  }
}


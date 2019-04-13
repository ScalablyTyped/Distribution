package typings
package reactDashSparklinesLib.reactDashSparklinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesNormalBandProps extends js.Object {
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object SparklinesNormalBandProps {
  @scala.inline
  def apply(style: reactLib.reactMod.CSSProperties = null): SparklinesNormalBandProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SparklinesNormalBandProps]
  }
}


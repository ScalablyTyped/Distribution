package typings.reactSparklines.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesNormalBandProps extends js.Object {
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SparklinesNormalBandProps {
  @scala.inline
  def apply(style: CSSProperties = null): SparklinesNormalBandProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesNormalBandProps]
  }
}


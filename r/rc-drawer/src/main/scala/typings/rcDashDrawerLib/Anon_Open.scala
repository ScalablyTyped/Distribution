package typings
package rcDashDrawerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Open extends js.Object {
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var prevProps: rcDashDrawerLib.esIDrawerPropTypesMod.IDrawerProps
}

object Anon_Open {
  @scala.inline
  def apply(
    prevProps: rcDashDrawerLib.esIDrawerPropTypesMod.IDrawerProps,
    open: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Open = {
    val __obj = js.Dynamic.literal(prevProps = prevProps)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[Anon_Open]
  }
}


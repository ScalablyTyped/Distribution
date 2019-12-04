package typings.rcDashDrawer

import typings.rcDashDrawer.libIDrawerPropTypesMod.IDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Open extends js.Object {
  var open: js.UndefOr[Boolean] = js.undefined
  var prevProps: IDrawerProps
}

object Anon_Open {
  @scala.inline
  def apply(prevProps: IDrawerProps, open: js.UndefOr[Boolean] = js.undefined): Anon_Open = {
    val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Open]
  }
}


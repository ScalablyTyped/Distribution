package typings.rcDashDrawer

import typings.rcDashDrawer.libIDrawerPropTypesMod.IDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OpenPrevProps extends js.Object {
  var open: js.UndefOr[Boolean] = js.undefined
  var prevProps: IDrawerProps
}

object Anon_OpenPrevProps {
  @scala.inline
  def apply(prevProps: IDrawerProps, open: js.UndefOr[Boolean] = js.undefined): Anon_OpenPrevProps = {
    val __obj = js.Dynamic.literal(prevProps = prevProps)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[Anon_OpenPrevProps]
  }
}


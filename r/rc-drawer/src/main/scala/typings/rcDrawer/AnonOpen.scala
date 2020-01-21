package typings.rcDrawer

import typings.rcDrawer.idrawerproptypesMod.IDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpen extends js.Object {
  var open: js.UndefOr[Boolean] = js.undefined
  var prevProps: IDrawerProps
}

object AnonOpen {
  @scala.inline
  def apply(prevProps: IDrawerProps, open: js.UndefOr[Boolean] = js.undefined): AnonOpen = {
    val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpen]
  }
}


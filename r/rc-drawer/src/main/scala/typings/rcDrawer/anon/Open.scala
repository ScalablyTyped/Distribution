package typings.rcDrawer.anon

import typings.rcDrawer.idrawerproptypesMod.IDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Open extends js.Object {
  var open: js.UndefOr[Boolean] = js.undefined
  var prevProps: IDrawerProps
}

object Open {
  @scala.inline
  def apply(prevProps: IDrawerProps, open: js.UndefOr[Boolean] = js.undefined): Open = {
    val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Open]
  }
}


package typings.reactDashFloater

import typings.reactDashFloater.reactDashFloaterMod.Placement
import typings.reactDashFloater.reactDashFloaterStrings.center
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Center extends js.Object {
  var offset: js.UndefOr[Double] = js.undefined
  var placement: js.UndefOr[Omit[Placement, center]] = js.undefined
  var position: js.UndefOr[Boolean] = js.undefined
}

object Anon_Center {
  @scala.inline
  def apply(
    offset: Int | Double = null,
    placement: Omit[Placement, center] = null,
    position: js.UndefOr[Boolean] = js.undefined
  ): Anon_Center = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Center]
  }
}


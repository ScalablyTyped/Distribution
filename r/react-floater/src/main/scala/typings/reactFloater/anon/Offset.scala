package typings.reactFloater.anon

import typings.reactFloater.mod.Placement
import typings.reactFloater.reactFloaterStrings.center
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: js.UndefOr[Double] = js.undefined
  var placement: js.UndefOr[Omit[Placement, center]] = js.undefined
  var position: js.UndefOr[Boolean] = js.undefined
}

object Offset {
  @scala.inline
  def apply(
    offset: js.UndefOr[Double] = js.undefined,
    placement: Omit[Placement, center] = null,
    position: js.UndefOr[Boolean] = js.undefined
  ): Offset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}


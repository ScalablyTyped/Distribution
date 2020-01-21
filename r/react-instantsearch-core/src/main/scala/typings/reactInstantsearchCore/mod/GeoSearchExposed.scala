package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoSearchExposed extends js.Object {
  var defaultRefinement: js.UndefOr[NESW] = js.undefined
}

object GeoSearchExposed {
  @scala.inline
  def apply(defaultRefinement: NESW = null): GeoSearchExposed = {
    val __obj = js.Dynamic.literal()
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSearchExposed]
  }
}


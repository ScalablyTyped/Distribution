package typings
package semanticDashUiDashReactLib.distCommonjsModulesDimmerDimmerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimmerProps
  extends StrictDimmerProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object DimmerProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    page: js.UndefOr[scala.Boolean] = js.undefined
  ): DimmerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page)
    __obj.asInstanceOf[DimmerProps]
  }
}


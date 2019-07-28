package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import org.scalablytyped.runtime.StringDictionary
import typings.d3DashGeo.d3DashGeoMod.GeoProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographiesProps extends js.Object {
  var children: js.UndefOr[
    js.Function2[/* geographies */ js.Array[js.Object], /* projection */ GeoProjection, Unit]
  ] = js.undefined
  var disableOptimization: js.UndefOr[Boolean] = js.undefined
  var geography: js.UndefOr[String | StringDictionary[js.Any] | js.Array[String]] = js.undefined
}

object GeographiesProps {
  @scala.inline
  def apply(
    children: (/* geographies */ js.Array[js.Object], /* projection */ GeoProjection) => Unit = null,
    disableOptimization: js.UndefOr[Boolean] = js.undefined,
    geography: String | StringDictionary[js.Any] | js.Array[String] = null
  ): GeographiesProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction2(children))
    if (!js.isUndefined(disableOptimization)) __obj.updateDynamic("disableOptimization")(disableOptimization)
    if (geography != null) __obj.updateDynamic("geography")(geography.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographiesProps]
  }
}


package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographiesProps extends js.Object {
  var children: js.UndefOr[
    js.Function2[
      /* geographies */ js.Array[js.Object], 
      /* projection */ d3DashGeoLib.d3DashGeoMod.GeoProjection, 
      scala.Unit
    ]
  ] = js.undefined
  var disableOptimization: js.UndefOr[scala.Boolean] = js.undefined
  var geography: js.UndefOr[
    java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | js.Array[java.lang.String]
  ] = js.undefined
}

object GeographiesProps {
  @scala.inline
  def apply(
    children: (/* geographies */ js.Array[js.Object], /* projection */ d3DashGeoLib.d3DashGeoMod.GeoProjection) => scala.Unit = null,
    disableOptimization: js.UndefOr[scala.Boolean] = js.undefined,
    geography: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | js.Array[java.lang.String] = null
  ): GeographiesProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction2(children))
    if (!js.isUndefined(disableOptimization)) __obj.updateDynamic("disableOptimization")(disableOptimization)
    if (geography != null) __obj.updateDynamic("geography")(geography.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographiesProps]
  }
}


package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONProps
  extends leafletLib.leafletMod.GeoJSONOptions[js.Any]
     with FeatureGroupEvents {
  var children: js.UndefOr[Children] = js.undefined
  var data: geojsonLib.geojsonMod.GeoJsonObject
  @JSName("style")
  var style_GeoJSONProps: js.UndefOr[leafletLib.leafletMod.StyleFunction[_]] = js.undefined
}


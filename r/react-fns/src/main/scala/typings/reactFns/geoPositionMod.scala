package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.geoPositionGeoPositionMod.GeoPositionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/GeoPosition", JSImport.Namespace)
@js.native
object geoPositionMod extends js.Object {
  @js.native
  class GeoPosition ()
    extends typings.reactFns.geoPositionGeoPositionMod.GeoPosition
  
  def withGeoPosition[Props](Component: ComponentType[Props with GeoPositionProps]): ComponentType[Props] = js.native
}


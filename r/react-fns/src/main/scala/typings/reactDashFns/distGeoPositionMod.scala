package typings.reactDashFns

import typings.react.reactMod.ComponentType
import typings.reactDashFns.distGeoPositionGeoPositionMod.GeoPositionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/GeoPosition", JSImport.Namespace)
@js.native
object distGeoPositionMod extends js.Object {
  @js.native
  class GeoPosition ()
    extends typings.reactDashFns.distGeoPositionGeoPositionMod.GeoPosition
  
  def withGeoPosition[Props](Component: ComponentType[Props with GeoPositionProps]): ComponentType[Props] = js.native
}


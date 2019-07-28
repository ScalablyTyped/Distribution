package typings.reactDashFns.distGeoPositionGeoPositionMod

import typings.react.reactMod.Component
import typings.reactDashFns.Anon_IsLoading
import typings.reactDashFns.distTypesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/GeoPosition/GeoPosition", "GeoPosition")
@js.native
class GeoPosition ()
  extends Component[SharedRenderProps[GeoPositionProps], GeoPositionProps, js.Any] {
  var geoId: js.Any = js.native
  @JSName("state")
  var state_GeoPosition: Anon_IsLoading = js.native
  @JSName("componentDidMount")
  def componentDidMount_MGeoPosition(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGeoPosition(): Unit = js.native
  def requestGeo(): Unit = js.native
}


package typings.reactFns.geoPositionGeoPositionMod

import typings.react.mod.Component
import typings.reactFns.AnonIsLoading
import typings.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/GeoPosition/GeoPosition", "GeoPosition")
@js.native
class GeoPosition ()
  extends Component[SharedRenderProps[GeoPositionProps], GeoPositionProps, js.Any] {
  var geoId: js.Any = js.native
  @JSName("state")
  var state_GeoPosition: AnonIsLoading = js.native
  @JSName("componentDidMount")
  def componentDidMount_MGeoPosition(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGeoPosition(): Unit = js.native
  def requestGeo(): Unit = js.native
}


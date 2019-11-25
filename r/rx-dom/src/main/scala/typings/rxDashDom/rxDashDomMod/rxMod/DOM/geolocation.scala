package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.std.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Geolocation
@JSImport("rx", "DOM.geolocation")
@js.native
object geolocation extends js.Object {
  def getCurrentPosition(): typings.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
  def getCurrentPosition(geolocationOptions: GeolocationOptions): typings.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
  def watchPosition(): typings.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
  def watchPosition(geolocationOptions: GeolocationOptions): typings.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
}


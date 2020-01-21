package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rxLiteAggregates.Rx.Observable
import typings.std.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Geolocation
@JSImport("rx", "DOM.geolocation")
@js.native
object geolocation extends js.Object {
  def getCurrentPosition(): Observable[Position] = js.native
  def getCurrentPosition(geolocationOptions: GeolocationOptions): Observable[Position] = js.native
  def watchPosition(): Observable[Position] = js.native
  def watchPosition(geolocationOptions: GeolocationOptions): Observable[Position] = js.native
}


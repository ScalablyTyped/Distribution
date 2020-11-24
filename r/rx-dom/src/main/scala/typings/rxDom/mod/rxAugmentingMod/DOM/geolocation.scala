package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rx.Rx.Observable
import typings.std.GeolocationPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Geolocation
@JSImport("rx", "DOM.geolocation")
@js.native
object geolocation extends js.Object {
  
  def getCurrentPosition(): Observable[GeolocationPosition] = js.native
  def getCurrentPosition(geolocationOptions: GeolocationOptions): Observable[GeolocationPosition] = js.native
  
  def watchPosition(): Observable[GeolocationPosition] = js.native
  def watchPosition(geolocationOptions: GeolocationOptions): Observable[GeolocationPosition] = js.native
}

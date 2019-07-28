package typings.reactDashNativeDashMaps

import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typings.reactDashNativeDashMaps.Anon_Coordinate
import typings.reactDashNativeDashMaps.Anon_Markers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashMapsMod {
  // =======================================================================
  //  Overlay
  // =======================================================================
  type Coordinate = js.Tuple2[Double, Double]
  type KmlMapEvent = NativeSyntheticEvent[Anon_Markers]
  type MapEvent[T] = NativeSyntheticEvent[T with Anon_Coordinate]
}

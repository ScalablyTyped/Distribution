package typings
package reactDashNativeDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashMapsMod {
  // =======================================================================
  //  Overlay
  // =======================================================================
  type Coordinate = js.Tuple2[scala.Double, scala.Double]
  type KmlMapEvent = reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeDashMapsLib.Anon_Markers]
  type MapEvent[T] = reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[T with reactDashNativeDashMapsLib.Anon_Coordinate]
}

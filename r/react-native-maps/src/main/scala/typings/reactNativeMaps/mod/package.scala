package typings.reactNativeMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // =======================================================================
  //  Overlay
  // =======================================================================
  type Coordinate = js.Tuple2[scala.Double, scala.Double]
  
  type KmlMapEvent = typings.reactNative.mod.NativeSyntheticEvent[typings.reactNativeMaps.anon.Markers]
  
  type MapEvent[T] = typings.reactNative.mod.NativeSyntheticEvent[T with typings.reactNativeMaps.anon.Coordinate]
}

package typings.reactNativeMaps

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def PROVIDER_DEFAULT: scala.Null = typings.reactNativeMaps.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PROVIDER_DEFAULT").asInstanceOf[scala.Null]
  
  @scala.inline
  def PROVIDER_GOOGLE: typings.reactNativeMaps.reactNativeMapsStrings.google = typings.reactNativeMaps.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PROVIDER_GOOGLE").asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.google]
}

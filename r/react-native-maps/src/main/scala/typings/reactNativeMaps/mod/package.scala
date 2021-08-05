package typings.reactNativeMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def PROVIDER_DEFAULT: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any = typings.reactNativeMaps.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PROVIDER_DEFAULT").asInstanceOf[/* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any]

inline def PROVIDER_GOOGLE: typings.reactNativeMaps.reactNativeMapsStrings.google = typings.reactNativeMaps.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PROVIDER_GOOGLE").asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.google]

// =======================================================================
//  Overlay
// =======================================================================
type Coordinate = js.Tuple2[scala.Double, scala.Double]

type KmlMapEvent = typings.reactNative.mod.NativeSyntheticEvent[typings.reactNativeMaps.anon.Markers]

type MapEvent[T] = typings.reactNative.mod.NativeSyntheticEvent[T & typings.reactNativeMaps.anon.Coordinate]

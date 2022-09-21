package typings.reactNativeGestureHandler.interfacesMod

import typings.reactNativeGestureHandler.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - scala.Double
  - scala.Boolean
  - typings.reactNativeGestureHandler.interfacesMod.HitSlop
  - typings.reactNativeGestureHandler.directionsMod.Directions
  - js.Array[typings.reactNativeGestureHandler.interfacesMod.Handler]
  - scala.Null
  - scala.Unit
*/
type ConfigArgs = js.UndefOr[_ConfigArgs | js.Array[Handler] | Double | Boolean | Null]

type NativeEventArgs = js.UndefOr[Double | State | Boolean]

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typings.reactNativeGestureHandler.stateMod.State
  - typings.reactNativeGestureHandler.interfacesMod.TouchEventType
  - js.Array[typings.reactNativeGestureHandler.interfacesMod.PointerData]
*/
type TouchNativeArgs = _TouchNativeArgs | js.Array[PointerData] | Double

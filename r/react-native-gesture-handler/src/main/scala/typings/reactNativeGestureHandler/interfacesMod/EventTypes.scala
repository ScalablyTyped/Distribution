package typings.reactNativeGestureHandler.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventTypes extends StObject
@JSImport("react-native-gesture-handler/lib/typescript/web/interfaces", "EventTypes")
@js.native
object EventTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypes & Double] = js.native
  
  @js.native
  sealed trait ADDITIONAL_POINTER_DOWN
    extends StObject
       with EventTypes
  /* 1 */ val ADDITIONAL_POINTER_DOWN: typings.reactNativeGestureHandler.interfacesMod.EventTypes.ADDITIONAL_POINTER_DOWN & Double = js.native
  
  @js.native
  sealed trait ADDITIONAL_POINTER_UP
    extends StObject
       with EventTypes
  /* 3 */ val ADDITIONAL_POINTER_UP: typings.reactNativeGestureHandler.interfacesMod.EventTypes.ADDITIONAL_POINTER_UP & Double = js.native
  
  @js.native
  sealed trait CANCEL
    extends StObject
       with EventTypes
  /* 7 */ val CANCEL: typings.reactNativeGestureHandler.interfacesMod.EventTypes.CANCEL & Double = js.native
  
  @js.native
  sealed trait DOWN
    extends StObject
       with EventTypes
  /* 0 */ val DOWN: typings.reactNativeGestureHandler.interfacesMod.EventTypes.DOWN & Double = js.native
  
  @js.native
  sealed trait ENTER
    extends StObject
       with EventTypes
  /* 5 */ val ENTER: typings.reactNativeGestureHandler.interfacesMod.EventTypes.ENTER & Double = js.native
  
  @js.native
  sealed trait MOVE
    extends StObject
       with EventTypes
  /* 4 */ val MOVE: typings.reactNativeGestureHandler.interfacesMod.EventTypes.MOVE & Double = js.native
  
  @js.native
  sealed trait OUT
    extends StObject
       with EventTypes
  /* 6 */ val OUT: typings.reactNativeGestureHandler.interfacesMod.EventTypes.OUT & Double = js.native
  
  @js.native
  sealed trait UP
    extends StObject
       with EventTypes
  /* 2 */ val UP: typings.reactNativeGestureHandler.interfacesMod.EventTypes.UP & Double = js.native
}

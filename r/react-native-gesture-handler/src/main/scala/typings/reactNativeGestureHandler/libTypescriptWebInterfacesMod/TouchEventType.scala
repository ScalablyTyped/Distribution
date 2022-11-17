package typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TouchEventType extends StObject
@JSImport("react-native-gesture-handler/lib/typescript/web/interfaces", "TouchEventType")
@js.native
object TouchEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TouchEventType & Double] = js.native
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with TouchEventType
  /* 4 */ val CANCELLED: typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.TouchEventType.CANCELLED & Double = js.native
  
  @js.native
  sealed trait DOWN
    extends StObject
       with TouchEventType
  /* 1 */ val DOWN: typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.TouchEventType.DOWN & Double = js.native
  
  @js.native
  sealed trait MOVE
    extends StObject
       with TouchEventType
  /* 2 */ val MOVE: typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.TouchEventType.MOVE & Double = js.native
  
  @js.native
  sealed trait UNDETERMINED
    extends StObject
       with TouchEventType
  /* 0 */ val UNDETERMINED: typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.TouchEventType.UNDETERMINED & Double = js.native
  
  @js.native
  sealed trait UP
    extends StObject
       with TouchEventType
  /* 3 */ val UP: typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.TouchEventType.UP & Double = js.native
}

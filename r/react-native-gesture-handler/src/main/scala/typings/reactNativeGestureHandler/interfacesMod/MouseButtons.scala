package typings.reactNativeGestureHandler.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MouseButtons extends StObject
@JSImport("react-native-gesture-handler/lib/typescript/web/interfaces", "MouseButtons")
@js.native
object MouseButtons extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MouseButtons & Double] = js.native
  
  @js.native
  sealed trait LEFT
    extends StObject
       with MouseButtons
  /* 1 */ val LEFT: typings.reactNativeGestureHandler.interfacesMod.MouseButtons.LEFT & Double = js.native
  
  @js.native
  sealed trait LEFT_RIGHT
    extends StObject
       with MouseButtons
  /* 3 */ val LEFT_RIGHT: typings.reactNativeGestureHandler.interfacesMod.MouseButtons.LEFT_RIGHT & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with MouseButtons
  /* 0 */ val NONE: typings.reactNativeGestureHandler.interfacesMod.MouseButtons.NONE & Double = js.native
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with MouseButtons
  /* 2 */ val RIGHT: typings.reactNativeGestureHandler.interfacesMod.MouseButtons.RIGHT & Double = js.native
  
  @js.native
  sealed trait SCROLL
    extends StObject
       with MouseButtons
  /* 4 */ val SCROLL: typings.reactNativeGestureHandler.interfacesMod.MouseButtons.SCROLL & Double = js.native
  
  @js.native
  sealed trait SCROLL_LEFT
    extends StObject
       with MouseButtons
  /* 5 */ val SCROLL_LEFT: typings.reactNativeGestureHandler.interfacesMod.MouseButtons.SCROLL_LEFT & Double = js.native
  
  @js.native
  sealed trait SCROLL_LEFT_RIGHT
    extends StObject
       with MouseButtons
  /* 7 */ val SCROLL_LEFT_RIGHT: typings.reactNativeGestureHandler.interfacesMod.MouseButtons.SCROLL_LEFT_RIGHT & Double = js.native
  
  @js.native
  sealed trait SCROLL_RIGHT
    extends StObject
       with MouseButtons
  /* 6 */ val SCROLL_RIGHT: typings.reactNativeGestureHandler.interfacesMod.MouseButtons.SCROLL_RIGHT & Double = js.native
}

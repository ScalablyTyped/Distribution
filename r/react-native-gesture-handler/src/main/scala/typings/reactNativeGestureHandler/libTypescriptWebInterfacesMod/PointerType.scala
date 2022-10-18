package typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerType extends StObject
@JSImport("react-native-gesture-handler/lib/typescript/web/interfaces", "PointerType")
@js.native
object PointerType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PointerType & String] = js.native
  
  @js.native
  sealed trait MOUSE
    extends StObject
       with PointerType
  /* "mouse" */ val MOUSE: typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.PointerType.MOUSE & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with PointerType
  /* "none" */ val NONE: typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.PointerType.NONE & String = js.native
  
  @js.native
  sealed trait PEN
    extends StObject
       with PointerType
  /* "pen" */ val PEN: typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.PointerType.PEN & String = js.native
  
  @js.native
  sealed trait TOUCH
    extends StObject
       with PointerType
  /* "touch" */ val TOUCH: typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.PointerType.TOUCH & String = js.native
}

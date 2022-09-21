package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.interfacesMod.AdaptedEvent
import typings.reactNativeGestureHandler.interfacesMod.EventTypes
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventManagerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/tools/PointerEventManager", JSImport.Default)
  @js.native
  open class default () extends PointerEventManager
  
  @js.native
  trait PointerEventManager
    extends typings.reactNativeGestureHandler.eventManagerMod.default {
    
    /* protected */ def mapEvent(event: PointerEvent, eventType: EventTypes): AdaptedEvent = js.native
  }
}

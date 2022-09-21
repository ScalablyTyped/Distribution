package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.interfacesMod.AdaptedEvent
import typings.reactNativeGestureHandler.interfacesMod.EventTypes
import typings.reactNativeGestureHandler.interfacesMod.TouchEventType
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchEventManagerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/tools/TouchEventManager", JSImport.Default)
  @js.native
  open class default () extends TouchEventManager
  
  @js.native
  trait TouchEventManager
    extends typings.reactNativeGestureHandler.eventManagerMod.default {
    
    /* protected */ def mapEvent(event: TouchEvent, eventType: EventTypes, index: Double, touchEventType: TouchEventType): AdaptedEvent = js.native
  }
}

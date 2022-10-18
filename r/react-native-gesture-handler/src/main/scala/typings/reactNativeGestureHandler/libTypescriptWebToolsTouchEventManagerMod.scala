package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.AdaptedEvent
import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.EventTypes
import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.TouchEventType
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebToolsTouchEventManagerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/tools/TouchEventManager", JSImport.Default)
  @js.native
  open class default () extends TouchEventManager
  
  @js.native
  trait TouchEventManager
    extends typings.reactNativeGestureHandler.libTypescriptWebToolsEventManagerMod.default {
    
    /* protected */ def mapEvent(event: TouchEvent, eventType: EventTypes, index: Double, touchEventType: TouchEventType): AdaptedEvent = js.native
  }
}

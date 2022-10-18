package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.AdaptedEvent
import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.EventTypes
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebToolsPointerEventManagerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/tools/PointerEventManager", JSImport.Default)
  @js.native
  open class default () extends PointerEventManager
  
  @js.native
  trait PointerEventManager
    extends typings.reactNativeGestureHandler.libTypescriptWebToolsEventManagerMod.default {
    
    /* protected */ def mapEvent(event: PointerEvent, eventType: EventTypes): AdaptedEvent = js.native
  }
}

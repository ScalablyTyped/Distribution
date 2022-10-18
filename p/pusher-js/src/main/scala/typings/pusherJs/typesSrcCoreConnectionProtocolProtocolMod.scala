package typings.pusherJs

import typings.pusherJs.typesSrcCoreConnectionProtocolActionMod.Action
import typings.pusherJs.typesSrcCoreConnectionProtocolMessageTypesMod.PusherEvent
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreConnectionProtocolProtocolMod {
  
  object default {
    
    @JSImport("pusher-js/types/src/core/connection/protocol/protocol", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def decodeMessage(messageEvent: MessageEvent[Any]): PusherEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeMessage")(messageEvent.asInstanceOf[js.Any]).asInstanceOf[PusherEvent]
    
    inline def encodeMessage(event: PusherEvent): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeMessage")(event.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getCloseAction(closeEvent: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCloseAction")(closeEvent.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getCloseError(closeEvent: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCloseError")(closeEvent.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def processHandshake(messageEvent: MessageEvent[Any]): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("processHandshake")(messageEvent.asInstanceOf[js.Any]).asInstanceOf[Action]
  }
}

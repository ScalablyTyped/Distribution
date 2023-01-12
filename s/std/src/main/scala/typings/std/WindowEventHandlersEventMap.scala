package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowEventHandlersEventMap extends StObject {
  
  /* standard dom */
  var afterprint: Event
  
  /* standard dom */
  var beforeprint: Event
  
  /* standard dom */
  var beforeunload: BeforeUnloadEvent
  
  /* standard dom */
  var gamepadconnected: GamepadEvent
  
  /* standard dom */
  var gamepaddisconnected: GamepadEvent
  
  /* standard dom */
  var hashchange: HashChangeEvent
  
  /* standard dom */
  var languagechange: Event
  
  /* standard dom */
  var message: MessageEvent[Any]
  
  /* standard dom */
  var messageerror: MessageEvent[Any]
  
  /* standard dom */
  var offline: Event
  
  /* standard dom */
  var online: Event
  
  /* standard dom */
  var pagehide: PageTransitionEvent
  
  /* standard dom */
  var pageshow: PageTransitionEvent
  
  /* standard dom */
  var popstate: PopStateEvent
  
  /* standard dom */
  var rejectionhandled: PromiseRejectionEvent
  
  /* standard dom */
  var storage: StorageEvent
  
  /* standard dom */
  var unhandledrejection: PromiseRejectionEvent
  
  /* standard dom */
  var unload: Event
}
object WindowEventHandlersEventMap {
  
  inline def apply(
    afterprint: Event,
    beforeprint: Event,
    beforeunload: BeforeUnloadEvent,
    gamepadconnected: GamepadEvent,
    gamepaddisconnected: GamepadEvent,
    hashchange: HashChangeEvent,
    languagechange: Event,
    message: MessageEvent[Any],
    messageerror: MessageEvent[Any],
    offline: Event,
    online: Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    popstate: PopStateEvent,
    rejectionhandled: PromiseRejectionEvent,
    storage: StorageEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: Event
  ): WindowEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(afterprint = afterprint.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], gamepadconnected = gamepadconnected.asInstanceOf[js.Any], gamepaddisconnected = gamepaddisconnected.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowEventHandlersEventMap] (val x: Self) extends AnyVal {
    
    inline def setAfterprint(value: Event): Self = StObject.set(x, "afterprint", value.asInstanceOf[js.Any])
    
    inline def setBeforeprint(value: Event): Self = StObject.set(x, "beforeprint", value.asInstanceOf[js.Any])
    
    inline def setBeforeunload(value: BeforeUnloadEvent): Self = StObject.set(x, "beforeunload", value.asInstanceOf[js.Any])
    
    inline def setGamepadconnected(value: GamepadEvent): Self = StObject.set(x, "gamepadconnected", value.asInstanceOf[js.Any])
    
    inline def setGamepaddisconnected(value: GamepadEvent): Self = StObject.set(x, "gamepaddisconnected", value.asInstanceOf[js.Any])
    
    inline def setHashchange(value: HashChangeEvent): Self = StObject.set(x, "hashchange", value.asInstanceOf[js.Any])
    
    inline def setLanguagechange(value: Event): Self = StObject.set(x, "languagechange", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MessageEvent[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageerror(value: MessageEvent[Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
    
    inline def setOffline(value: Event): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    inline def setOnline(value: Event): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    inline def setPagehide(value: PageTransitionEvent): Self = StObject.set(x, "pagehide", value.asInstanceOf[js.Any])
    
    inline def setPageshow(value: PageTransitionEvent): Self = StObject.set(x, "pageshow", value.asInstanceOf[js.Any])
    
    inline def setPopstate(value: PopStateEvent): Self = StObject.set(x, "popstate", value.asInstanceOf[js.Any])
    
    inline def setRejectionhandled(value: PromiseRejectionEvent): Self = StObject.set(x, "rejectionhandled", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: StorageEvent): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setUnhandledrejection(value: PromiseRejectionEvent): Self = StObject.set(x, "unhandledrejection", value.asInstanceOf[js.Any])
    
    inline def setUnload(value: Event): Self = StObject.set(x, "unload", value.asInstanceOf[js.Any])
  }
}

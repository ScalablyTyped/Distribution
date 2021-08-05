package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowEventHandlersEventMap extends StObject {
  
  var afterprint: Event
  
  var beforeprint: Event
  
  var beforeunload: BeforeUnloadEvent
  
  var hashchange: HashChangeEvent
  
  var languagechange: Event
  
  var message: MessageEvent[js.Any]
  
  var messageerror: MessageEvent[js.Any]
  
  var offline: Event
  
  var online: Event
  
  var pagehide: PageTransitionEvent
  
  var pageshow: PageTransitionEvent
  
  var popstate: PopStateEvent
  
  var rejectionhandled: PromiseRejectionEvent
  
  var storage: StorageEvent
  
  var unhandledrejection: PromiseRejectionEvent
  
  var unload: Event
}
object WindowEventHandlersEventMap {
  
  inline def apply(
    afterprint: Event,
    beforeprint: Event,
    beforeunload: BeforeUnloadEvent,
    hashchange: HashChangeEvent,
    languagechange: Event,
    message: MessageEvent[js.Any],
    messageerror: MessageEvent[js.Any],
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
    val __obj = js.Dynamic.literal(afterprint = afterprint.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
  
  extension [Self <: WindowEventHandlersEventMap](x: Self) {
    
    inline def setAfterprint(value: Event): Self = StObject.set(x, "afterprint", value.asInstanceOf[js.Any])
    
    inline def setBeforeprint(value: Event): Self = StObject.set(x, "beforeprint", value.asInstanceOf[js.Any])
    
    inline def setBeforeunload(value: BeforeUnloadEvent): Self = StObject.set(x, "beforeunload", value.asInstanceOf[js.Any])
    
    inline def setHashchange(value: HashChangeEvent): Self = StObject.set(x, "hashchange", value.asInstanceOf[js.Any])
    
    inline def setLanguagechange(value: Event): Self = StObject.set(x, "languagechange", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MessageEvent[js.Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageerror(value: MessageEvent[js.Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
    
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

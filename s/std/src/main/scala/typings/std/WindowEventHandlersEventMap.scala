package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowEventHandlersEventMap extends StObject {
  
  var afterprint: Event = js.native
  
  var beforeprint: Event = js.native
  
  var beforeunload: BeforeUnloadEvent = js.native
  
  var hashchange: HashChangeEvent = js.native
  
  var languagechange: Event = js.native
  
  var message: MessageEvent[_] = js.native
  
  var messageerror: MessageEvent[_] = js.native
  
  var offline: Event = js.native
  
  var online: Event = js.native
  
  var pagehide: PageTransitionEvent = js.native
  
  var pageshow: PageTransitionEvent = js.native
  
  var popstate: PopStateEvent = js.native
  
  var rejectionhandled: PromiseRejectionEvent = js.native
  
  var storage: StorageEvent = js.native
  
  var unhandledrejection: PromiseRejectionEvent = js.native
  
  var unload: Event = js.native
}
object WindowEventHandlersEventMap {
  
  @scala.inline
  def apply(
    afterprint: Event,
    beforeprint: Event,
    beforeunload: BeforeUnloadEvent,
    hashchange: HashChangeEvent,
    languagechange: Event,
    message: MessageEvent[_],
    messageerror: MessageEvent[_],
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
  
  @scala.inline
  implicit class WindowEventHandlersEventMapMutableBuilder[Self <: WindowEventHandlersEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterprint(value: Event): Self = StObject.set(x, "afterprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeprint(value: Event): Self = StObject.set(x, "beforeprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeunload(value: BeforeUnloadEvent): Self = StObject.set(x, "beforeunload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashchange(value: HashChangeEvent): Self = StObject.set(x, "hashchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagechange(value: Event): Self = StObject.set(x, "languagechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: MessageEvent[_]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: MessageEvent[_]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffline(value: Event): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnline(value: Event): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagehide(value: PageTransitionEvent): Self = StObject.set(x, "pagehide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageshow(value: PageTransitionEvent): Self = StObject.set(x, "pageshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopstate(value: PopStateEvent): Self = StObject.set(x, "popstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionhandled(value: PromiseRejectionEvent): Self = StObject.set(x, "rejectionhandled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: StorageEvent): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhandledrejection(value: PromiseRejectionEvent): Self = StObject.set(x, "unhandledrejection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnload(value: Event): Self = StObject.set(x, "unload", value.asInstanceOf[js.Any])
  }
}

package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventHandlersEventMap extends js.Object {
  var afterprint: Event
  var beforeprint: Event
  var beforeunload: BeforeUnloadEvent
  var hashchange: HashChangeEvent
  var languagechange: Event
  var message: MessageEvent
  var messageerror: MessageEvent
  var offline: Event
  var online: Event
  var pagehide: PageTransitionEvent
  var pageshow: PageTransitionEvent
  var popstate: PopStateEvent
  var rejectionhandled: Event
  var storage: StorageEvent
  var unhandledrejection: PromiseRejectionEvent
  var unload: Event
}

object WindowEventHandlersEventMap {
  @scala.inline
  def apply(
    afterprint: Event,
    beforeprint: Event,
    beforeunload: BeforeUnloadEvent,
    hashchange: HashChangeEvent,
    languagechange: Event,
    message: MessageEvent,
    messageerror: MessageEvent,
    offline: Event,
    online: Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    popstate: PopStateEvent,
    rejectionhandled: Event,
    storage: StorageEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: Event
  ): WindowEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(afterprint = afterprint, beforeprint = beforeprint, beforeunload = beforeunload, hashchange = hashchange, languagechange = languagechange, message = message, messageerror = messageerror, offline = offline, online = online, pagehide = pagehide, pageshow = pageshow, popstate = popstate, rejectionhandled = rejectionhandled, storage = storage, unhandledrejection = unhandledrejection, unload = unload)
  
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
}


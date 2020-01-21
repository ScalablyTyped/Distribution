package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventHandlersEventMap extends js.Object {
  var afterprint: Event_
  var beforeprint: Event_
  var beforeunload: BeforeUnloadEvent
  var hashchange: HashChangeEvent
  var languagechange: Event_
  var message: MessageEvent
  var messageerror: MessageEvent
  var offline: Event_
  var online: Event_
  var pagehide: PageTransitionEvent
  var pageshow: PageTransitionEvent
  var popstate: PopStateEvent
  var rejectionhandled: Event_
  var storage: StorageEvent
  var unhandledrejection: PromiseRejectionEvent
  var unload: Event_
}

object WindowEventHandlersEventMap {
  @scala.inline
  def apply(
    afterprint: Event_,
    beforeprint: Event_,
    beforeunload: BeforeUnloadEvent,
    hashchange: HashChangeEvent,
    languagechange: Event_,
    message: MessageEvent,
    messageerror: MessageEvent,
    offline: Event_,
    online: Event_,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    popstate: PopStateEvent,
    rejectionhandled: Event_,
    storage: StorageEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: Event_
  ): WindowEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(afterprint = afterprint.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
}


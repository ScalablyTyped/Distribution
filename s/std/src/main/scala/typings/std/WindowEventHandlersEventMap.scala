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
  var rejectionhandled: PromiseRejectionEvent
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
    rejectionhandled: PromiseRejectionEvent,
    storage: StorageEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: Event
  ): WindowEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(afterprint = afterprint.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
}


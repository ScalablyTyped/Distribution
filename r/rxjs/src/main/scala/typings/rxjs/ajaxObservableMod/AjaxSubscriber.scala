package typings.rxjs.ajaxObservableMod

import typings.rxjs.subscriberMod.Subscriber
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxSubscriber")
@js.native
class AjaxSubscriber[T] protected () extends Subscriber[Event_] {
  def this(destination: Subscriber[T], request: AjaxRequest) = this()
  var done: js.Any = js.native
  var getHeader: js.Any = js.native
  var request: AjaxRequest = js.native
  var send: js.Any = js.native
  var serializeBody: js.Any = js.native
  var setHeaders: js.Any = js.native
  var setupEvents: js.Any = js.native
  var xhr: js.Any = js.native
}


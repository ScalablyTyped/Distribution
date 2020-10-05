package typings.rxjs.innerSubscribeMod

import typings.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/innerSubscribe", "SimpleInnerSubscriber")
@js.native
class SimpleInnerSubscriber[T] protected () extends Subscriber[T] {
  def this(parent: SimpleOuterSubscriberLike[_]) = this()
  var parent: js.Any = js.native
}


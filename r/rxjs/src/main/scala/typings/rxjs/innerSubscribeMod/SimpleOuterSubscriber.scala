package typings.rxjs.innerSubscribeMod

import typings.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/innerSubscribe", "SimpleOuterSubscriber")
@js.native
class SimpleOuterSubscriber[T, R] ()
  extends Subscriber[T]
     with SimpleOuterSubscriberLike[R]

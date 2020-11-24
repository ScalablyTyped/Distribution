package typings.rxjs.innerSubscribeMod

import typings.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/innerSubscribe", "ComplexInnerSubscriber")
@js.native
class ComplexInnerSubscriber[T, R] protected () extends Subscriber[R] {
  def this(parent: ComplexOuterSubscriber[T, R], outerValue: T, outerIndex: Double) = this()
  
  var outerIndex: Double = js.native
  
  var outerValue: T = js.native
  
  var parent: js.Any = js.native
}

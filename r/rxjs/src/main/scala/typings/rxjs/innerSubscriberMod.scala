package typings.rxjs

import typings.rxjs.outerSubscriberMod.OuterSubscriber
import typings.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/InnerSubscriber", JSImport.Namespace)
@js.native
object innerSubscriberMod extends js.Object {
  
  @js.native
  class InnerSubscriber[T, R] protected () extends Subscriber[R] {
    def this(parent: OuterSubscriber[T, R], outerValue: T, outerIndex: Double) = this()
    
    var index: js.Any = js.native
    
    var outerIndex: Double = js.native
    
    var outerValue: T = js.native
    
    var parent: js.Any = js.native
  }
}

package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.subscriptionMod.Subscription
import typings.rxjs.typesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeToMod {
  
  @JSImport("rxjs/internal/util/subscribeTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def subscribeTo[T](result: ObservableInput[T]): js.Function1[/* subscriber */ Subscriber[T], Unit | Subscription] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeTo")(result.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* subscriber */ Subscriber[T], Unit | Subscription]]
}

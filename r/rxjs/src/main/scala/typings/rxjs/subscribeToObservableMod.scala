package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeToObservableMod {
  
  @JSImport("rxjs/internal/util/subscribeToObservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subscribeToObservable[T](obj: js.Any): js.Function1[/* subscriber */ Subscriber[T], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* subscriber */ Subscriber[T], js.Any]]
}

package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeToIterableMod {
  
  @JSImport("rxjs/internal/util/subscribeToIterable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subscribeToIterable[T](iterable: Iterable[T]): js.Function1[/* subscriber */ Subscriber[T], Subscriber[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* subscriber */ Subscriber[T], Subscriber[T]]]
}

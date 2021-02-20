package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeToIterableMod {
  
  @JSImport("rxjs/internal/util/subscribeToIterable", "subscribeToIterable")
  @js.native
  def subscribeToIterable[T](iterable: Iterable[T]): js.Function1[/* subscriber */ Subscriber[T], Subscriber[T]] = js.native
}

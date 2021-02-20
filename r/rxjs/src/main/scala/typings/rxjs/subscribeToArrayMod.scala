package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeToArrayMod {
  
  @JSImport("rxjs/internal/util/subscribeToArray", "subscribeToArray")
  @js.native
  def subscribeToArray[T](array: ArrayLike[T]): js.Function1[/* subscriber */ Subscriber[T], Unit] = js.native
}

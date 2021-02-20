package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeToPromiseMod {
  
  @JSImport("rxjs/internal/util/subscribeToPromise", "subscribeToPromise")
  @js.native
  def subscribeToPromise[T](promise: js.Thenable[T]): js.Function1[/* subscriber */ Subscriber[T], Subscriber[T]] = js.native
}

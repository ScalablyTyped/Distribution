package typings.rxjs.internalCompatibilityMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "subscribeToIterable")
@js.native
object subscribeToIterable extends js.Object {
  
  def apply[T](iterable: Iterable[T]): js.Function1[
    /* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], 
    typings.rxjs.subscriberMod.Subscriber[T]
  ] = js.native
}

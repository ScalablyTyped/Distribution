package typings.rxjs.internalCompatibilityMod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "subscribeToArray")
@js.native
object subscribeToArray extends js.Object {
  def apply[T](array: ArrayLike[T]): js.Function1[/* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], Unit] = js.native
}


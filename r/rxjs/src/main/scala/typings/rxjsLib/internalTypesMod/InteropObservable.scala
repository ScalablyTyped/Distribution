package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteropObservable[T] extends _SubscribableOrPromise[T] {
  @JSName(org.scalablytyped.runtime.Symbol.observable)
  var observable: js.Function0[Subscribable[T]]
}

object InteropObservable {
  @scala.inline
  def apply[T](observable: () => Subscribable[T]): InteropObservable[T] = {
    val __obj = js.Dynamic.literal(observable = js.Any.fromFunction0(observable))
  
    __obj.asInstanceOf[InteropObservable[T]]
  }
}


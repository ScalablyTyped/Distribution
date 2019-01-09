package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAsyncLib {
  type AsyncChildren[T] = (js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AsyncState<T> */ /* state */ js.Any, 
    reactLib.reactMod.ReactNs.ReactNode
  ]) | reactLib.reactMod.ReactNs.ReactNode
  type PromiseFn[T] = js.Function1[/* props */ js.Object, js.Promise[T]]
}

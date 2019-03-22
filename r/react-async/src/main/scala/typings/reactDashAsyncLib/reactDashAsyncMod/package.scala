package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAsyncMod {
  type Async[T] = reactLib.reactMod.Component[AsyncProps[T], AsyncState[T], js.Any]
  type AsyncChildren[T] = (js.Function1[/* state */ AsyncState[T], reactLib.reactMod.ReactNs.ReactNode]) | reactLib.reactMod.ReactNs.ReactNode
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ js.Object, 
    /* controller */ stdLib.AbortController, 
    js.Promise[T]
  ]
  type PromiseFn[T] = js.Function2[/* props */ js.Object, /* controller */ stdLib.AbortController, js.Promise[T]]
}

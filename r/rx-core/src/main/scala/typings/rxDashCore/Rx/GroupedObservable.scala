package typings.rxDashCore.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupedObservable[TKey, TElement] extends Observable[TElement] {
  var key: TKey = js.native
  var underlyingObservable: Observable[TElement] = js.native
}


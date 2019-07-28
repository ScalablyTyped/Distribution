package typings.rxjs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalObservableFromEventMod {
  type FromEventTarget[T] = EventTargetLike[T] | ArrayLike[EventTargetLike[T]]
  type NodeEventHandler = js.Function1[/* repeated */ js.Any, Unit]
}

package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalObservableFromEventMod {
  type FromEventTarget[T] = EventTargetLike[T] | stdLib.ArrayLike[EventTargetLike[T]]
  type NodeEventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
}

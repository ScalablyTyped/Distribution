package typings.remotedevDashSerialize

import typings.immutable.immutableMod.Stack
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofStack extends js.Object {
  def apply(): Stack[_] = js.native
  def apply[T](collection: Iterable[T]): Stack[T] = js.native
  /**
    * True if the provided value is a Stack
    */
  def isStack(maybeStack: js.Any): /* is immutable.immutable.Stack<any> */ Boolean = js.native
  /**
    * Creates a new Stack containing `values`.
    */
  def of[T](values: T*): Stack[T] = js.native
}


package typings.remotedevDashSerialize

import typings.immutable.immutableMod.Stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofStack extends js.Object {
  /**
    * True if the provided value is a Stack
    */
  def isStack(maybeStack: js.Any): /* is immutable.immutable.Stack<any> */ Boolean
  /**
    * Creates a new Stack containing `values`.
    */
  def of[T](values: T*): Stack[T]
}

object TypeofStack {
  @scala.inline
  def apply(
    isStack: js.Any => /* is immutable.immutable.Stack<any> */ Boolean,
    of: /* repeated */ js.Any => Stack[js.Any]
  ): TypeofStack = {
    val __obj = js.Dynamic.literal(isStack = js.Any.fromFunction1(isStack), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[TypeofStack]
  }
}


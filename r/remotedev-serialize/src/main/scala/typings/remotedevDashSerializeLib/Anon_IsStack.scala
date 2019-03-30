package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsStack extends js.Object {
  /**
    * True if the provided value is a Stack
    */
  def isStack(maybeStack: js.Any): /* is immutable.immutable.Stack<any> */ scala.Boolean
  /**
    * Creates a new Stack containing `values`.
    */
  def of[T](values: T*): immutableLib.immutableMod.Stack[T]
}

object Anon_IsStack {
  @scala.inline
  def apply(
    isStack: js.Any => /* is immutable.immutable.Stack<any> */ scala.Boolean,
    of: /* repeated */ js.Any => immutableLib.immutableMod.Stack[js.Any]
  ): Anon_IsStack = {
    val __obj = js.Dynamic.literal(isStack = js.Any.fromFunction1(isStack), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Anon_IsStack]
  }
}


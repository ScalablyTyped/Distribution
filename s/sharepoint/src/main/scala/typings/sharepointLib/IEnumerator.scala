package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEnumerator[T] extends js.Object {
  def get_current(): T
  def moveNext(): scala.Boolean
  def reset(): scala.Unit
}

object IEnumerator {
  @scala.inline
  def apply[T](
    get_current: js.Function0[T],
    moveNext: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit]
  ): IEnumerator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get_current")(get_current)
    __obj.updateDynamic("moveNext")(moveNext)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[IEnumerator[T]]
  }
}


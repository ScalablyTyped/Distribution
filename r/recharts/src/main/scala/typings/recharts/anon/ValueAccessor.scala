package typings.recharts.anon

import typings.recharts.mod.RechartsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAccessor extends js.Object {
  var valueAccessor: RechartsFunction
}

object ValueAccessor {
  @scala.inline
  def apply(valueAccessor: /* repeated */ js.Any => Unit): ValueAccessor = {
    val __obj = js.Dynamic.literal(valueAccessor = js.Any.fromFunction1(valueAccessor))
    __obj.asInstanceOf[ValueAccessor]
  }
}


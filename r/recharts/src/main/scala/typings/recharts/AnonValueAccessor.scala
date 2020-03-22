package typings.recharts

import typings.recharts.mod.RechartsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueAccessor extends js.Object {
  var valueAccessor: RechartsFunction
}

object AnonValueAccessor {
  @scala.inline
  def apply(valueAccessor: /* repeated */ js.Any => Unit): AnonValueAccessor = {
    val __obj = js.Dynamic.literal(valueAccessor = js.Any.fromFunction1(valueAccessor))
  
    __obj.asInstanceOf[AnonValueAccessor]
  }
}


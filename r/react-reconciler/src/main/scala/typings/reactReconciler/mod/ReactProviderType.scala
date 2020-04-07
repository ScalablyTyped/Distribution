package typings.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactProviderType[T] extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double
  var _context: ReactContext[T]
}

object ReactProviderType {
  @scala.inline
  def apply[T](DollarDollartypeof: js.Symbol | Double, _context: ReactContext[T]): ReactProviderType[T] = {
    val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactProviderType[T]]
  }
}


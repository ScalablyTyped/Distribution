package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactProviderType[T] extends js.Object {
  @JSName("$$typeof")
  var $$typeof: js.Symbol | scala.Double
  var _context: ReactContext[T]
}

object ReactProviderType {
  @scala.inline
  def apply[T]($$typeof: js.Symbol | scala.Double, _context: ReactContext[T]): ReactProviderType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$$typeof")($$typeof.asInstanceOf[js.Any])
    __obj.updateDynamic("_context")(_context)
    __obj.asInstanceOf[ReactProviderType[T]]
  }
}


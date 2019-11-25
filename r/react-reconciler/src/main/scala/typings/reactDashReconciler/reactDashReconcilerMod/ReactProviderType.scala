package typings.reactDashReconciler.reactDashReconcilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactProviderType[T] extends js.Object {
  @JSName("$$typeof")
  var $$typeof: js.Symbol | Double
  var _context: ReactContext[T]
}

object ReactProviderType {
  @scala.inline
  def apply[T]($$typeof: js.Symbol | Double, _context: ReactContext[T]): ReactProviderType[T] = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactProviderType[T]]
  }
}


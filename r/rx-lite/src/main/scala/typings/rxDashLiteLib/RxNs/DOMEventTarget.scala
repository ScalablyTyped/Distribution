package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMEventTarget extends js.Object {
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* e */ js.Any, _], useCapture: scala.Boolean): scala.Unit
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* e */ js.Any, _], useCapture: scala.Boolean): scala.Unit
}

object DOMEventTarget {
  @scala.inline
  def apply(
    addEventListener: js.Function3[java.lang.String, js.Function1[/* e */ js.Any, _], scala.Boolean, scala.Unit],
    removeEventListener: js.Function3[java.lang.String, js.Function1[/* e */ js.Any, _], scala.Boolean, scala.Unit]
  ): DOMEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[DOMEventTarget]
  }
}


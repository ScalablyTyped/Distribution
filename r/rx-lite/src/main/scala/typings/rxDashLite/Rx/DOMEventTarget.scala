package typings.rxDashLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMEventTarget extends js.Object {
  def addEventListener(`type`: String, listener: js.Function1[/* e */ js.Any, _], useCapture: Boolean): Unit
  def removeEventListener(`type`: String, listener: js.Function1[/* e */ js.Any, _], useCapture: Boolean): Unit
}

object DOMEventTarget {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit,
    removeEventListener: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit
  ): DOMEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), removeEventListener = js.Any.fromFunction3(removeEventListener))
  
    __obj.asInstanceOf[DOMEventTarget]
  }
}


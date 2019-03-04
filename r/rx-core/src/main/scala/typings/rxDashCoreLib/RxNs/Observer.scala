package typings
package rxDashCoreLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observer
trait Observer[T] extends js.Object {
  def checked(): Observer[_]
}

object Observer {
  @scala.inline
  def apply[T](checked: js.Function0[Observer[_]]): Observer[T] = {
    val __obj = js.Dynamic.literal(checked = checked)
  
    __obj.asInstanceOf[Observer[T]]
  }
}


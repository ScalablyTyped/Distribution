package typings
package rmcDashPickerLib.esPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerProp extends js.Object {
  def computeChildIndex(arg: js.Any*): scala.Double
  def doScrollingComplete(arg: js.Any*): scala.Unit
  def select(arg: js.Any*): scala.Unit
}

object IPickerProp {
  @scala.inline
  def apply(
    computeChildIndex: /* repeated */ js.Any => scala.Double,
    doScrollingComplete: /* repeated */ js.Any => scala.Unit,
    select: /* repeated */ js.Any => scala.Unit
  ): IPickerProp = {
    val __obj = js.Dynamic.literal(computeChildIndex = js.Any.fromFunction1(computeChildIndex), doScrollingComplete = js.Any.fromFunction1(doScrollingComplete), select = js.Any.fromFunction1(select))
  
    __obj.asInstanceOf[IPickerProp]
  }
}


package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartEditing extends js.Object {
  def startEditing(rowIndex: Double, columnIndex: Double): Unit
}

object StartEditing {
  @scala.inline
  def apply(startEditing: (Double, Double) => Unit): StartEditing = {
    val __obj = js.Dynamic.literal(startEditing = js.Any.fromFunction2(startEditing))
    __obj.asInstanceOf[StartEditing]
  }
}


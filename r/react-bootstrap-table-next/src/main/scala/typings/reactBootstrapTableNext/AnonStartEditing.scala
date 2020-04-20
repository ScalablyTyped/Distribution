package typings.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartEditing extends js.Object {
  def startEditing(rowIndex: Double, columnIndex: Double): Unit
}

object AnonStartEditing {
  @scala.inline
  def apply(startEditing: (Double, Double) => Unit): AnonStartEditing = {
    val __obj = js.Dynamic.literal(startEditing = js.Any.fromFunction2(startEditing))
    __obj.asInstanceOf[AnonStartEditing]
  }
}


package typings.reactBootstrapTableNext

import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnClick[T /* <: js.Object */, E] extends js.Object {
  def onClick(e: js.Any, column: ColumnDescription[T, E], columnIndex: Double): Unit
}

object AnonOnClick {
  @scala.inline
  def apply[T /* <: js.Object */, E](onClick: (js.Any, ColumnDescription[T, E], Double) => Unit): AnonOnClick[T, E] = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3(onClick))
  
    __obj.asInstanceOf[AnonOnClick[T, E]]
  }
}


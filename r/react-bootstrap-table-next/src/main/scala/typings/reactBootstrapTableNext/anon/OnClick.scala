package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClick[T /* <: js.Object */, E] extends js.Object {
  def onClick(e: js.Any, column: ColumnDescription[T, E], columnIndex: Double): Unit
}

object OnClick {
  @scala.inline
  def apply[T, E](onClick: (js.Any, ColumnDescription[T, E], Double) => Unit): OnClick[T, E] = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3(onClick))
    __obj.asInstanceOf[OnClick[T, E]]
  }
}


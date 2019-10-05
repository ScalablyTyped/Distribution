package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.Column
import typings.reactDashTable.reactDashTableMod.ReactTableFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: Column[_]
  var filter: js.Any
  var key: js.UndefOr[String] = js.undefined
  var onChange: ReactTableFunction
}

object Anon_Column {
  @scala.inline
  def apply(
    column: Column[_],
    filter: js.Any,
    onChange: /* value */ js.UndefOr[js.Any] => Unit,
    key: String = null
  ): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column, filter = filter, onChange = js.Any.fromFunction1(onChange))
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_Column]
  }
}


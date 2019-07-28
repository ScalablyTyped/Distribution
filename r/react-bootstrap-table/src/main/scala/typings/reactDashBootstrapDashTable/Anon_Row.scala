package typings.reactDashBootstrapDashTable

import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.EditCheckboxOptionValue
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.EditSelectOptionValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Row[TRow /* <: js.Object */] extends js.Object {
  var values: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue])
}

object Anon_Row {
  @scala.inline
  def apply[TRow /* <: js.Object */](
    values: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue])
  ): Anon_Row[TRow] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Row[TRow]]
  }
}


package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Row[TRow /* <: js.Object */] extends js.Object {
  var values: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditSelectOptionValue | reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditCheckboxOptionValue | (js.Function1[
    /* row */ TRow, 
    reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditCheckboxOptionValue | reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditSelectOptionValue
  ])
}

object Anon_Row {
  @scala.inline
  def apply[TRow /* <: js.Object */](
    values: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditSelectOptionValue | reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditCheckboxOptionValue | (js.Function1[
      /* row */ TRow, 
      reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditCheckboxOptionValue | reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditSelectOptionValue
    ])
  ): Anon_Row[TRow] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Row[TRow]]
  }
}


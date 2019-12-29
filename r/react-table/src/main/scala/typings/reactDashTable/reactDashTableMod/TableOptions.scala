package typings.reactDashTable.reactDashTableMod

import typings.reactDashTable.Anon_Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-table.Anon_Action<D> ]:? react-table.Anon_Action<D>[P]} */ trait TableOptions[D /* <: js.Object */] extends Anon_Columns[D]

object TableOptions {
  @scala.inline
  def apply[D /* <: js.Object */](columns: js.Array[Column[D]], data: js.Array[D]): TableOptions[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableOptions[D]]
  }
}


package typings
package reactDashDataDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableShiftSelect[T] extends js.Object {
  var enableShiftSelect: js.UndefOr[scala.Boolean] = js.undefined
  var onRowsDeselected: js.UndefOr[
    js.Function1[
      /* rows */ js.Array[reactDashDataDashGridLib.AdazzleReactDataGridNs.SelectionParams[T]], 
      scala.Unit
    ]
  ] = js.undefined
  var onRowsSelected: js.UndefOr[
    js.Function1[
      /* rows */ js.Array[reactDashDataDashGridLib.AdazzleReactDataGridNs.SelectionParams[T]], 
      scala.Unit
    ]
  ] = js.undefined
  var selectBy: js.UndefOr[Anon_Indexes] = js.undefined
  var showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
}


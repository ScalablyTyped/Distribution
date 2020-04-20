package typings.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BootstrapTable[T /* <: js.Object */] = typings.react.mod.Component[typings.reactBootstrapTableNext.mod.BootstrapTableProps[T], js.Object, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
    - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.center
    - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
    - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.start
    - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.end
    - java.lang.String
  */
  type CellAlignment = typings.reactBootstrapTableNext.mod._CellAlignment | java.lang.String
  type ColumnFormatter[R, E, C] = js.Function4[
    /* cell */ C, 
    /* row */ R, 
    /* rowIndex */ scala.Double, 
    /* formatExtraData */ E, 
    typings.react.mod._Global_.JSX.Element | java.lang.String | scala.Boolean | typings.react.mod.ReactText
  ]
  type ColumnSortFunc[T, E /* <: /* keyof T */ java.lang.String */] = js.Function6[
    /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* a */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* b */ js.Any, 
    /* order */ typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc | typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc, 
    /* dataField */ js.Any, 
    /* rowA */ T, 
    /* rowB */ T, 
    scala.Double
  ]
  type HeaderFormatter[T /* <: js.Object */] = js.Function3[
    /* column */ typings.reactBootstrapTableNext.mod.ColumnDescription[T, js.Any], 
    /* colIndex */ scala.Double, 
    /* components */ typings.reactBootstrapTableNext.AnonFilterElement, 
    typings.react.mod._Global_.JSX.Element | java.lang.String | scala.Double | typings.react.mod.ReactText
  ]
  type RowEventHandler[T] = js.Function3[
    /* e */ typings.react.mod.SyntheticEvent[typings.std.Element, typings.std.Event_], 
    /* row */ T, 
    /* rowIndex */ scala.Double, 
    scala.Unit
  ]
  type TableChangeHandler[T] = js.Function2[
    /* type */ typings.reactBootstrapTableNext.mod.TableChangeType, 
    /* newState */ typings.reactBootstrapTableNext.mod.TableChangeState[T], 
    scala.Unit
  ]
}

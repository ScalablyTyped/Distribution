package typings.reactabularDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactabularDashTableMod {
  import typings.react.reactMod.ReactInstance
  import typings.react.reactMod._Global_.JSX.Element
  import typings.reactabularDashTable.Anon_Column
  import typings.reactabularDashTable.Anon_ColumnColumnIndex
  import typings.reactabularDashTable.Anon_ColumnColumnIndexRowData
  import typings.reactabularDashTable.Anon_ColumnColumnIndexRowDataRowIndex

  type CellFormatter = js.Function2[
    /* value */ js.Any, 
    /* props */ Anon_ColumnColumnIndexRowDataRowIndex, 
    String | Element
  ]
  type CellTransform = js.Function2[/* value */ js.Any, /* props */ Anon_ColumnColumnIndex, js.Any]
  type ColumnFormatter = js.Function2[
    /* label */ String | Element, 
    /* props */ Anon_ColumnColumnIndexRowData, 
    String | Element
  ]
  type ColumnTransform = js.Function2[/* label */ String | Element | ReactInstance, /* props */ Anon_Column, js.Any]
}

package typings.reactabularTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CellFormatter = js.Function2[
    /* value */ js.Any, 
    /* props */ typings.reactabularTable.anon.RowIndex, 
    java.lang.String | typings.react.mod.global.JSX.Element
  ]
  type CellTransform = js.Function2[/* value */ js.Any, /* props */ typings.reactabularTable.anon.ColumnIndex, js.Any]
  type ColumnFormatter = js.Function2[
    /* label */ java.lang.String | typings.react.mod.global.JSX.Element, 
    /* props */ typings.reactabularTable.anon.RowData, 
    java.lang.String | typings.react.mod.global.JSX.Element
  ]
  type ColumnTransform = js.Function2[
    /* label */ java.lang.String | typings.react.mod.global.JSX.Element | typings.react.mod.ReactInstance, 
    /* props */ typings.reactabularTable.anon.Column, 
    js.Any
  ]
}

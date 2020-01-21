package typings.reactabularTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CellFormatter = js.Function2[
    /* value */ js.Any, 
    /* props */ typings.reactabularTable.AnonColumnColumnIndexRowDataRowIndex, 
    java.lang.String | typings.react.mod._Global_.JSX.Element
  ]
  type CellTransform = js.Function2[
    /* value */ js.Any, 
    /* props */ typings.reactabularTable.AnonColumnColumnIndex, 
    js.Any
  ]
  type ColumnFormatter = js.Function2[
    /* label */ java.lang.String | typings.react.mod._Global_.JSX.Element, 
    /* props */ typings.reactabularTable.AnonColumnColumnIndexRowData, 
    java.lang.String | typings.react.mod._Global_.JSX.Element
  ]
  type ColumnTransform = js.Function2[
    /* label */ java.lang.String | typings.react.mod._Global_.JSX.Element | typings.react.mod.ReactInstance, 
    /* props */ typings.reactabularTable.AnonColumn, 
    js.Any
  ]
}

package typings.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AdazzleReactDataGrid {
  type ColumnEventCallback = js.Function2[
    /* ev */ typings.react.mod.SyntheticEvent[js.Any, typings.std.Event_], 
    /* args */ typings.reactDataGrid.AnonName, 
    scala.Unit
  ]
  type ReactDataGrid[T] = typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid_[T]
}

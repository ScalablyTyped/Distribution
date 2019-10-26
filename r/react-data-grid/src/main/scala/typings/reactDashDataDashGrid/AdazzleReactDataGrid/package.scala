package typings.reactDashDataDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AdazzleReactDataGrid {
  import typings.react.reactMod.SyntheticEvent
  import typings.reactDashDataDashGrid.Anon_IdxName
  import typings.std.Event

  type ColumnEventCallback = js.Function2[/* ev */ SyntheticEvent[js.Any, Event], /* args */ Anon_IdxName, Unit]
  type ReactDataGrid[T] = ReactDataGrid_[T]
}

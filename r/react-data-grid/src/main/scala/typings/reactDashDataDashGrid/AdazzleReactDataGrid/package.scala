package typings.reactDashDataDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AdazzleReactDataGrid {
  import typings.react.Event
  import typings.react.reactMod.SyntheticEvent
  import typings.reactDashDataDashGrid.Anon_IdxName

  type ColumnEventCallback = js.Function2[/* ev */ SyntheticEvent[js.Any, Event], /* args */ Anon_IdxName, Unit]
  type ReactDataGrid[T] = ReactDataGrid_[T]
}

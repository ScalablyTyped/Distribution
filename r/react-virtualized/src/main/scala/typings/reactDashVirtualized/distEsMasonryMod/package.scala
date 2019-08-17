package typings.reactDashVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsMasonryMod {
  import typings.react.reactMod.ReactNode
  import typings.reactDashVirtualized.Anon_ClientHeight
  import typings.reactDashVirtualized.Anon_Params
  import typings.reactDashVirtualized.Anon_StartIndex

  type CellRenderer = js.Function1[/* props */ MasonryCellProps, ReactNode]
  type OnCellsRenderedCallback = js.Function1[/* params */ Anon_StartIndex, Unit]
  type OnScrollCallback = js.Function1[/* params */ Anon_ClientHeight, Unit]
  type Positioner = (js.Function1[/* index */ Double, Position]) with Anon_Params
  type emptyObject = js.Object
  type identity = js.Function1[/* value */ js.Any, js.Any]
  type noop = js.Function0[Unit]
}

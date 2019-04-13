package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsMasonryMod {
  type CellRenderer = js.Function1[/* props */ MasonryCellProps, reactLib.reactMod.ReactNode]
  type OnCellsRenderedCallback = js.Function1[/* params */ reactDashVirtualizedLib.Anon_StartIndex, scala.Unit]
  type OnScrollCallback = js.Function1[/* params */ reactDashVirtualizedLib.Anon_ClientHeight, scala.Unit]
  type Positioner = (js.Function1[/* index */ scala.Double, Position]) with reactDashVirtualizedLib.Anon_Params
  type emptyObject = js.Object
  type identity = js.Function1[/* value */ js.Any, js.Any]
  type noop = js.Function0[scala.Unit]
}

package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsListMod {
  type ListProps = reactDashVirtualizedLib.distEsGridMod.GridCoreProps with reactDashVirtualizedLib.Anon_TabIndexEstimatedRowSize
  type ListRowProps = (stdLib.Pick[
    reactDashVirtualizedLib.distEsGridMod.GridCellProps, 
    stdLib.Exclude[java.lang.String, reactDashVirtualizedLib.reactDashVirtualizedLibStrings.rowIndex]
  ]) with reactDashVirtualizedLib.Anon_Index
  type ListRowRenderer = js.Function1[/* props */ ListRowProps, reactLib.reactMod.ReactNs.ReactNode]
}

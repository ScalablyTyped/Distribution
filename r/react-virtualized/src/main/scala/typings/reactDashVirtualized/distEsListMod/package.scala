package typings.reactDashVirtualized

import typings.react.reactMod.ReactNode
import typings.reactDashVirtualized.Anon_AutoHeight
import typings.reactDashVirtualized.Anon_Index
import typings.reactDashVirtualized.distEsGridMod.GridCellProps
import typings.reactDashVirtualized.distEsGridMod.GridCoreProps
import typings.reactDashVirtualized.reactDashVirtualizedStrings.rowIndex
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsListMod {
  type ListProps = GridCoreProps with Anon_AutoHeight
  type ListRowProps = (Pick[GridCellProps, Exclude[String, rowIndex]]) with Anon_Index
  type ListRowRenderer = js.Function1[/* props */ ListRowProps, ReactNode]
}

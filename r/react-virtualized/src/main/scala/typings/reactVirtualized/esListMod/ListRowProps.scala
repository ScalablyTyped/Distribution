package typings.reactVirtualized.esListMod

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import typings.reactVirtualized.esGridMod.GridCoreProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-virtualized.react-virtualized/dist/es/Grid.GridCellProps, std.Exclude<keyof react-virtualized.react-virtualized/dist/es/Grid.GridCellProps, 'rowIndex'>> & {  index  :react-virtualized.react-virtualized/dist/es/Grid.GridCellProps['rowIndex']} */
trait ListRowProps extends js.Object {
  var columnIndex: Double
  var index: Double
  var isScrolling: Boolean
  var isVisible: Boolean
  var key: String
  var parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent
  var style: CSSProperties
}

object ListRowProps {
  @scala.inline
  def apply(
    columnIndex: Double,
    index: Double,
    isScrolling: Boolean,
    isVisible: Boolean,
    key: String,
    parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent,
    style: CSSProperties
  ): ListRowProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRowProps]
  }
}


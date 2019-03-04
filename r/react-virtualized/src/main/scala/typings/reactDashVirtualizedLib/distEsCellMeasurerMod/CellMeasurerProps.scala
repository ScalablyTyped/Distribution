package typings
package reactDashVirtualizedLib.distEsCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMeasurerProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cache: CellMeasurerCacheInterface
  var children: (js.Function1[
    /* props */ reactDashVirtualizedLib.Anon_Measure, 
    reactLib.reactMod.ReactNs.ReactNode
  ]) | reactLib.reactMod.ReactNs.ReactNode
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var parent: MeasuredCellParent
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object CellMeasurerProps {
  @scala.inline
  def apply(
    cache: CellMeasurerCacheInterface,
    children: (js.Function1[
      /* props */ reactDashVirtualizedLib.Anon_Measure, 
      reactLib.reactMod.ReactNs.ReactNode
    ]) | reactLib.reactMod.ReactNs.ReactNode,
    parent: MeasuredCellParent,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    columnIndex: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    rowIndex: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CellMeasurerProps = {
    val __obj = js.Dynamic.literal(cache = cache, children = children.asInstanceOf[js.Any], parent = parent)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CellMeasurerProps]
  }
}


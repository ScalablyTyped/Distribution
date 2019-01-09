package typings
package reactDashMdLib.libGridsGridListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashMdLib.libGridsCellMod.CellProps because var conflicts: children, className, component, onBlur, onClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onFocus, onKeyDown, onKeyUp, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, style. Inlined align, position, size, order, offset, phoneSize, phoneOrder, phoneOffset, phoneHidden, tabletSize, tabletOrder, tabletOffset, tabletHidden, desktopSize, desktopOrder, desktopOffset, desktopHidden */ trait GridListProps
  extends reactDashMdLib.libGridsGridMod.GridProps {
  var align: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.top | reactDashMdLib.reactDashMdLibStrings.middle | reactDashMdLib.reactDashMdLibStrings.bottom | reactDashMdLib.reactDashMdLibStrings.stretch
  ] = js.undefined
  var cellClassName: js.UndefOr[java.lang.String] = js.undefined
  var cellStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  @JSName("children")
  var children_GridListProps: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* props */ HOCProps, reactLib.reactMod.ReactNs.ReactNode])
  ] = js.undefined
  var desktopHidden: js.UndefOr[scala.Boolean] = js.undefined
  var desktopOffset: js.UndefOr[scala.Double] = js.undefined
  var desktopOrder: js.UndefOr[scala.Double] = js.undefined
  var desktopSize: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var order: js.UndefOr[scala.Double] = js.undefined
  var phoneHidden: js.UndefOr[scala.Boolean] = js.undefined
  var phoneOffset: js.UndefOr[scala.Double] = js.undefined
  var phoneOrder: js.UndefOr[scala.Double] = js.undefined
  var phoneSize: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.center | reactDashMdLib.reactDashMdLibStrings.right
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var tabletHidden: js.UndefOr[scala.Boolean] = js.undefined
  var tabletOffset: js.UndefOr[scala.Double] = js.undefined
  var tabletOrder: js.UndefOr[scala.Double] = js.undefined
  var tabletSize: js.UndefOr[scala.Double] = js.undefined
}


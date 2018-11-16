package typings
package reactDashMdLib.libGridsGridListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashMdLib.libGridsCellMod.CellProps because Would inherit conflicting mutable fields List(onBlur, onDragStart, onMouseLeave, onDrag, onTouchStart, onKeyDown, style, onDragLeave, onDrop, onDragExit, onDragOver, onDragEnd, onMouseUp, onTouchEnd, onKeyUp, onMouseMove, onMouseOver, onTouchCancel, className, onMouseOut, onFocus, onDragEnter, onTouchMove, onMouseEnter, onMouseDown, onClick, children, component))*/

trait GridListProps
  extends reactDashMdLib.libGridsGridMod.GridProps {
  var cellClassName: js.UndefOr[java.lang.String] = js.undefined
  var cellStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  @JSName("children")
  var children_GridListProps: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* props */ HOCProps, reactLib.reactMod.ReactNs.ReactNode])
  ] = js.undefined
}


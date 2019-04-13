package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameBottomLeftGridClassNameBottomRightGrid extends js.Object {
  var classNameBottomLeftGrid: js.UndefOr[java.lang.String] = js.undefined
  var classNameBottomRightGrid: js.UndefOr[java.lang.String] = js.undefined
  var classNameTopLeftGrid: js.UndefOr[java.lang.String] = js.undefined
  var classNameTopRightGrid: js.UndefOr[java.lang.String] = js.undefined
  var enableFixedColumnScroll: js.UndefOr[scala.Boolean] = js.undefined
  var enableFixedRowScroll: js.UndefOr[scala.Boolean] = js.undefined
  var fixedColumnCount: js.UndefOr[scala.Double] = js.undefined
  var fixedRowCount: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var styleBottomLeftGrid: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var styleBottomRightGrid: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var styleTopLeftGrid: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var styleTopRightGrid: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object Anon_ClassNameBottomLeftGridClassNameBottomRightGrid {
  @scala.inline
  def apply(
    classNameBottomLeftGrid: java.lang.String = null,
    classNameBottomRightGrid: java.lang.String = null,
    classNameTopLeftGrid: java.lang.String = null,
    classNameTopRightGrid: java.lang.String = null,
    enableFixedColumnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    enableFixedRowScroll: js.UndefOr[scala.Boolean] = js.undefined,
    fixedColumnCount: scala.Int | scala.Double = null,
    fixedRowCount: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    styleBottomLeftGrid: reactLib.reactMod.CSSProperties = null,
    styleBottomRightGrid: reactLib.reactMod.CSSProperties = null,
    styleTopLeftGrid: reactLib.reactMod.CSSProperties = null,
    styleTopRightGrid: reactLib.reactMod.CSSProperties = null
  ): Anon_ClassNameBottomLeftGridClassNameBottomRightGrid = {
    val __obj = js.Dynamic.literal()
    if (classNameBottomLeftGrid != null) __obj.updateDynamic("classNameBottomLeftGrid")(classNameBottomLeftGrid)
    if (classNameBottomRightGrid != null) __obj.updateDynamic("classNameBottomRightGrid")(classNameBottomRightGrid)
    if (classNameTopLeftGrid != null) __obj.updateDynamic("classNameTopLeftGrid")(classNameTopLeftGrid)
    if (classNameTopRightGrid != null) __obj.updateDynamic("classNameTopRightGrid")(classNameTopRightGrid)
    if (!js.isUndefined(enableFixedColumnScroll)) __obj.updateDynamic("enableFixedColumnScroll")(enableFixedColumnScroll)
    if (!js.isUndefined(enableFixedRowScroll)) __obj.updateDynamic("enableFixedRowScroll")(enableFixedRowScroll)
    if (fixedColumnCount != null) __obj.updateDynamic("fixedColumnCount")(fixedColumnCount.asInstanceOf[js.Any])
    if (fixedRowCount != null) __obj.updateDynamic("fixedRowCount")(fixedRowCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (styleBottomLeftGrid != null) __obj.updateDynamic("styleBottomLeftGrid")(styleBottomLeftGrid)
    if (styleBottomRightGrid != null) __obj.updateDynamic("styleBottomRightGrid")(styleBottomRightGrid)
    if (styleTopLeftGrid != null) __obj.updateDynamic("styleTopLeftGrid")(styleTopLeftGrid)
    if (styleTopRightGrid != null) __obj.updateDynamic("styleTopRightGrid")(styleTopRightGrid)
    __obj.asInstanceOf[Anon_ClassNameBottomLeftGridClassNameBottomRightGrid]
  }
}


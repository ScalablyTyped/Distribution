package typings.reactDashVirtualized

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameBottomLeftGrid extends js.Object {
  var classNameBottomLeftGrid: js.UndefOr[String] = js.undefined
  var classNameBottomRightGrid: js.UndefOr[String] = js.undefined
  var classNameTopLeftGrid: js.UndefOr[String] = js.undefined
  var classNameTopRightGrid: js.UndefOr[String] = js.undefined
  var enableFixedColumnScroll: js.UndefOr[Boolean] = js.undefined
  var enableFixedRowScroll: js.UndefOr[Boolean] = js.undefined
  var fixedColumnCount: js.UndefOr[Double] = js.undefined
  var fixedRowCount: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var styleBottomLeftGrid: js.UndefOr[CSSProperties] = js.undefined
  var styleBottomRightGrid: js.UndefOr[CSSProperties] = js.undefined
  var styleTopLeftGrid: js.UndefOr[CSSProperties] = js.undefined
  var styleTopRightGrid: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_ClassNameBottomLeftGrid {
  @scala.inline
  def apply(
    classNameBottomLeftGrid: String = null,
    classNameBottomRightGrid: String = null,
    classNameTopLeftGrid: String = null,
    classNameTopRightGrid: String = null,
    enableFixedColumnScroll: js.UndefOr[Boolean] = js.undefined,
    enableFixedRowScroll: js.UndefOr[Boolean] = js.undefined,
    fixedColumnCount: Int | Double = null,
    fixedRowCount: Int | Double = null,
    style: CSSProperties = null,
    styleBottomLeftGrid: CSSProperties = null,
    styleBottomRightGrid: CSSProperties = null,
    styleTopLeftGrid: CSSProperties = null,
    styleTopRightGrid: CSSProperties = null
  ): Anon_ClassNameBottomLeftGrid = {
    val __obj = js.Dynamic.literal()
    if (classNameBottomLeftGrid != null) __obj.updateDynamic("classNameBottomLeftGrid")(classNameBottomLeftGrid.asInstanceOf[js.Any])
    if (classNameBottomRightGrid != null) __obj.updateDynamic("classNameBottomRightGrid")(classNameBottomRightGrid.asInstanceOf[js.Any])
    if (classNameTopLeftGrid != null) __obj.updateDynamic("classNameTopLeftGrid")(classNameTopLeftGrid.asInstanceOf[js.Any])
    if (classNameTopRightGrid != null) __obj.updateDynamic("classNameTopRightGrid")(classNameTopRightGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFixedColumnScroll)) __obj.updateDynamic("enableFixedColumnScroll")(enableFixedColumnScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFixedRowScroll)) __obj.updateDynamic("enableFixedRowScroll")(enableFixedRowScroll.asInstanceOf[js.Any])
    if (fixedColumnCount != null) __obj.updateDynamic("fixedColumnCount")(fixedColumnCount.asInstanceOf[js.Any])
    if (fixedRowCount != null) __obj.updateDynamic("fixedRowCount")(fixedRowCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styleBottomLeftGrid != null) __obj.updateDynamic("styleBottomLeftGrid")(styleBottomLeftGrid.asInstanceOf[js.Any])
    if (styleBottomRightGrid != null) __obj.updateDynamic("styleBottomRightGrid")(styleBottomRightGrid.asInstanceOf[js.Any])
    if (styleTopLeftGrid != null) __obj.updateDynamic("styleTopLeftGrid")(styleTopLeftGrid.asInstanceOf[js.Any])
    if (styleTopRightGrid != null) __obj.updateDynamic("styleTopRightGrid")(styleTopRightGrid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameBottomLeftGrid]
  }
}


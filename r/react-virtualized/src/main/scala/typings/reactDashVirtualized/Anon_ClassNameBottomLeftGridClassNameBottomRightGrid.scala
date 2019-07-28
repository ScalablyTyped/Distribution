package typings.reactDashVirtualized

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameBottomLeftGridClassNameBottomRightGrid extends js.Object {
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

object Anon_ClassNameBottomLeftGridClassNameBottomRightGrid {
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


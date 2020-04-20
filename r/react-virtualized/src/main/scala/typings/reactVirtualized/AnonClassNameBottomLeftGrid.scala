package typings.reactVirtualized

import typings.react.mod.CSSProperties
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassNameBottomLeftGrid extends js.Object {
  var classNameBottomLeftGrid: Validator[String]
  var classNameBottomRightGrid: Validator[String]
  var classNameTopLeftGrid: Validator[String]
  var classNameTopRightGrid: Validator[String]
  var enableFixedColumnScroll: Validator[Boolean]
  var enableFixedRowScroll: Validator[Boolean]
  var fixedColumnCount: Validator[Double]
  var fixedRowCount: Validator[Double]
  var style: Validator[CSSProperties]
  var styleBottomLeftGrid: Validator[CSSProperties]
  var styleBottomRightGrid: Validator[CSSProperties]
  var styleTopLeftGrid: Validator[CSSProperties]
  var styleTopRightGrid: Validator[CSSProperties]
}

object AnonClassNameBottomLeftGrid {
  @scala.inline
  def apply(
    classNameBottomLeftGrid: Validator[String],
    classNameBottomRightGrid: Validator[String],
    classNameTopLeftGrid: Validator[String],
    classNameTopRightGrid: Validator[String],
    enableFixedColumnScroll: Validator[Boolean],
    enableFixedRowScroll: Validator[Boolean],
    fixedColumnCount: Validator[Double],
    fixedRowCount: Validator[Double],
    style: Validator[CSSProperties],
    styleBottomLeftGrid: Validator[CSSProperties],
    styleBottomRightGrid: Validator[CSSProperties],
    styleTopLeftGrid: Validator[CSSProperties],
    styleTopRightGrid: Validator[CSSProperties]
  ): AnonClassNameBottomLeftGrid = {
    val __obj = js.Dynamic.literal(classNameBottomLeftGrid = classNameBottomLeftGrid.asInstanceOf[js.Any], classNameBottomRightGrid = classNameBottomRightGrid.asInstanceOf[js.Any], classNameTopLeftGrid = classNameTopLeftGrid.asInstanceOf[js.Any], classNameTopRightGrid = classNameTopRightGrid.asInstanceOf[js.Any], enableFixedColumnScroll = enableFixedColumnScroll.asInstanceOf[js.Any], enableFixedRowScroll = enableFixedRowScroll.asInstanceOf[js.Any], fixedColumnCount = fixedColumnCount.asInstanceOf[js.Any], fixedRowCount = fixedRowCount.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], styleBottomLeftGrid = styleBottomLeftGrid.asInstanceOf[js.Any], styleBottomRightGrid = styleBottomRightGrid.asInstanceOf[js.Any], styleTopLeftGrid = styleTopLeftGrid.asInstanceOf[js.Any], styleTopRightGrid = styleTopRightGrid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassNameBottomLeftGrid]
  }
}


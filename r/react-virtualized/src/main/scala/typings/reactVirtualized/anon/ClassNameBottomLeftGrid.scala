package typings.reactVirtualized.anon

import typings.react.mod.CSSProperties
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNameBottomLeftGrid extends js.Object {
  var classNameBottomLeftGrid: Validator[String] = js.native
  var classNameBottomRightGrid: Validator[String] = js.native
  var classNameTopLeftGrid: Validator[String] = js.native
  var classNameTopRightGrid: Validator[String] = js.native
  var enableFixedColumnScroll: Validator[Boolean] = js.native
  var enableFixedRowScroll: Validator[Boolean] = js.native
  var fixedColumnCount: Validator[Double] = js.native
  var fixedRowCount: Validator[Double] = js.native
  var style: Validator[CSSProperties] = js.native
  var styleBottomLeftGrid: Validator[CSSProperties] = js.native
  var styleBottomRightGrid: Validator[CSSProperties] = js.native
  var styleTopLeftGrid: Validator[CSSProperties] = js.native
  var styleTopRightGrid: Validator[CSSProperties] = js.native
}

object ClassNameBottomLeftGrid {
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
  ): ClassNameBottomLeftGrid = {
    val __obj = js.Dynamic.literal(classNameBottomLeftGrid = classNameBottomLeftGrid.asInstanceOf[js.Any], classNameBottomRightGrid = classNameBottomRightGrid.asInstanceOf[js.Any], classNameTopLeftGrid = classNameTopLeftGrid.asInstanceOf[js.Any], classNameTopRightGrid = classNameTopRightGrid.asInstanceOf[js.Any], enableFixedColumnScroll = enableFixedColumnScroll.asInstanceOf[js.Any], enableFixedRowScroll = enableFixedRowScroll.asInstanceOf[js.Any], fixedColumnCount = fixedColumnCount.asInstanceOf[js.Any], fixedRowCount = fixedRowCount.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], styleBottomLeftGrid = styleBottomLeftGrid.asInstanceOf[js.Any], styleBottomRightGrid = styleBottomRightGrid.asInstanceOf[js.Any], styleTopLeftGrid = styleTopLeftGrid.asInstanceOf[js.Any], styleTopRightGrid = styleTopRightGrid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameBottomLeftGrid]
  }
  @scala.inline
  implicit class ClassNameBottomLeftGridOps[Self <: ClassNameBottomLeftGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassNameBottomLeftGrid(value: Validator[String]): Self = this.set("classNameBottomLeftGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassNameBottomRightGrid(value: Validator[String]): Self = this.set("classNameBottomRightGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassNameTopLeftGrid(value: Validator[String]): Self = this.set("classNameTopLeftGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassNameTopRightGrid(value: Validator[String]): Self = this.set("classNameTopRightGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableFixedColumnScroll(value: Validator[Boolean]): Self = this.set("enableFixedColumnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableFixedRowScroll(value: Validator[Boolean]): Self = this.set("enableFixedRowScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedColumnCount(value: Validator[Double]): Self = this.set("fixedColumnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedRowCount(value: Validator[Double]): Self = this.set("fixedRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: Validator[CSSProperties]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleBottomLeftGrid(value: Validator[CSSProperties]): Self = this.set("styleBottomLeftGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleBottomRightGrid(value: Validator[CSSProperties]): Self = this.set("styleBottomRightGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleTopLeftGrid(value: Validator[CSSProperties]): Self = this.set("styleTopLeftGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleTopRightGrid(value: Validator[CSSProperties]): Self = this.set("styleTopRightGrid", value.asInstanceOf[js.Any])
  }
  
}


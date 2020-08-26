package typings.reactColor.circleMod

import typings.reactColor.anon.PartialClassesCirclePicke
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CirclePickerProps extends ColorPickerProps[CirclePicker] {
  var circleSize: js.UndefOr[Double] = js.native
  var circleSpacing: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[js.Array[String]] = js.native
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
  @JSName("styles")
  var styles_CirclePickerProps: js.UndefOr[PartialClassesCirclePicke] = js.native
  var width: js.UndefOr[String] = js.native
}

object CirclePickerProps {
  @scala.inline
  def apply(): CirclePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CirclePickerProps]
  }
  @scala.inline
  implicit class CirclePickerPropsOps[Self <: CirclePickerProps] (val x: Self) extends AnyVal {
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
    def setCircleSize(value: Double): Self = this.set("circleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleSize: Self = this.set("circleSize", js.undefined)
    @scala.inline
    def setCircleSpacing(value: Double): Self = this.set("circleSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleSpacing: Self = this.set("circleSpacing", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = this.set("onSwatchHover", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSwatchHover: Self = this.set("onSwatchHover", js.undefined)
    @scala.inline
    def setStyles(value: PartialClassesCirclePicke): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


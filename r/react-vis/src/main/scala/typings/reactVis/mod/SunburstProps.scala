package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactVis.reactVisStrings.angle
import typings.reactVis.reactVisStrings.angle0
import typings.reactVis.reactVisStrings.label
import typings.reactVis.reactVisStrings.size
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SunburstProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.native
  var className: js.UndefOr[String] = js.native
   // default: ''
  var colorType: js.UndefOr[String] = js.native
   // default: 'literal'
  var data: SunburstPoint = js.native
  var getAngle: js.UndefOr[RVGet[SunburstPoint, angle]] = js.native
  var getAngle0: js.UndefOr[RVGet[SunburstPoint, angle0]] = js.native
   // default: false
  var getLabel: js.UndefOr[RVGet[SunburstPoint, label]] = js.native
  var getSize: js.UndefOr[RVGet[SunburstPoint, size]] = js.native
  var height: Double = js.native
  var hideRootNode: js.UndefOr[Boolean] = js.native
  var onValueClick: js.UndefOr[RVValueEventHandler[SunburstPoint]] = js.native
  var onValueMouseOut: js.UndefOr[RVValueEventHandler[SunburstPoint]] = js.native
  var onValueMouseOver: js.UndefOr[RVValueEventHandler[SunburstPoint]] = js.native
  var width: Double = js.native
}

object SunburstProps {
  @scala.inline
  def apply(data: SunburstPoint, height: Double, width: Double): SunburstProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SunburstProps]
  }
  @scala.inline
  implicit class SunburstPropsOps[Self <: SunburstProps] (val x: Self) extends AnyVal {
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
    def setData(value: SunburstPoint): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColorType(value: String): Self = this.set("colorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorType: Self = this.set("colorType", js.undefined)
    @scala.inline
    def setGetAngle(
      value: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getAngle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAngle: Self = this.set("getAngle", js.undefined)
    @scala.inline
    def setGetAngle0(
      value: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getAngle0", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAngle0: Self = this.set("getAngle0", js.undefined)
    @scala.inline
    def setGetLabel(
      value: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetLabel: Self = this.set("getLabel", js.undefined)
    @scala.inline
    def setGetSize(
      value: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetSize: Self = this.set("getSize", js.undefined)
    @scala.inline
    def setHideRootNode(value: Boolean): Self = this.set("hideRootNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideRootNode: Self = this.set("hideRootNode", js.undefined)
    @scala.inline
    def setOnValueClick(value: (SunburstPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueClick: Self = this.set("onValueClick", js.undefined)
    @scala.inline
    def setOnValueMouseOut(value: (SunburstPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueMouseOut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueMouseOut: Self = this.set("onValueMouseOut", js.undefined)
    @scala.inline
    def setOnValueMouseOver(value: (SunburstPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueMouseOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueMouseOver: Self = this.set("onValueMouseOver", js.undefined)
  }
  
}


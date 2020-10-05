package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.bevel
import typings.reactNative.reactNativeStrings.butt
import typings.reactNative.reactNativeStrings.miter
import typings.reactNative.reactNativeStrings.round
import typings.reactNative.reactNativeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARTRenderableMixin extends ARTNodeMixin {
  var fill: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeCap: js.UndefOr[butt | square | round] = js.native
  var strokeDash: js.UndefOr[js.Array[Double]] = js.native
  var strokeJoin: js.UndefOr[bevel | miter | round] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
}

object ARTRenderableMixin {
  @scala.inline
  def apply(): ARTRenderableMixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARTRenderableMixin]
  }
  @scala.inline
  implicit class ARTRenderableMixinOps[Self <: ARTRenderableMixin] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeCap(value: butt | square | round): Self = this.set("strokeCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeCap: Self = this.set("strokeCap", js.undefined)
    @scala.inline
    def setStrokeDashVarargs(value: Double*): Self = this.set("strokeDash", js.Array(value :_*))
    @scala.inline
    def setStrokeDash(value: js.Array[Double]): Self = this.set("strokeDash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDash: Self = this.set("strokeDash", js.undefined)
    @scala.inline
    def setStrokeJoin(value: bevel | miter | round): Self = this.set("strokeJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeJoin: Self = this.set("strokeJoin", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}


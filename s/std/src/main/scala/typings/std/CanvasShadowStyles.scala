package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasShadowStyles extends js.Object {
  var shadowBlur: Double = js.native
  var shadowColor: java.lang.String = js.native
  var shadowOffsetX: Double = js.native
  var shadowOffsetY: Double = js.native
}

object CanvasShadowStyles {
  @scala.inline
  def apply(shadowBlur: Double, shadowColor: java.lang.String, shadowOffsetX: Double, shadowOffsetY: Double): CanvasShadowStyles = {
    val __obj = js.Dynamic.literal(shadowBlur = shadowBlur.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffsetX = shadowOffsetX.asInstanceOf[js.Any], shadowOffsetY = shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasShadowStyles]
  }
  @scala.inline
  implicit class CanvasShadowStylesOps[Self <: CanvasShadowStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowColor(value: java.lang.String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
  }
  
}


package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGFitToViewBox extends js.Object {
  val preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  val viewBox: SVGAnimatedRect = js.native
}

object SVGFitToViewBox {
  @scala.inline
  def apply(preserveAspectRatio: SVGAnimatedPreserveAspectRatio, viewBox: SVGAnimatedRect): SVGFitToViewBox = {
    val __obj = js.Dynamic.literal(preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFitToViewBox]
  }
  @scala.inline
  implicit class SVGFitToViewBoxOps[Self <: SVGFitToViewBox] (val x: Self) extends AnyVal {
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
    def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewBox(value: SVGAnimatedRect): Self = this.set("viewBox", value.asInstanceOf[js.Any])
  }
  
}


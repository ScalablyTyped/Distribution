package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of type SVGPreserveAspectRatio which can be animated. */
@js.native
trait SVGAnimatedPreserveAspectRatio extends js.Object {
  val animVal: SVGPreserveAspectRatio = js.native
  val baseVal: SVGPreserveAspectRatio = js.native
}

object SVGAnimatedPreserveAspectRatio {
  @scala.inline
  def apply(animVal: SVGPreserveAspectRatio, baseVal: SVGPreserveAspectRatio): SVGAnimatedPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPreserveAspectRatio]
  }
  @scala.inline
  implicit class SVGAnimatedPreserveAspectRatioOps[Self <: SVGAnimatedPreserveAspectRatio] (val x: Self) extends AnyVal {
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
    def setAnimVal(value: SVGPreserveAspectRatio): Self = this.set("animVal", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseVal(value: SVGPreserveAspectRatio): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
  
}


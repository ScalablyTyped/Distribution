package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleYTransform extends js.Object {
  var scaleY: Double = js.native
}

object ScaleYTransform {
  @scala.inline
  def apply(scaleY: Double): ScaleYTransform = {
    val __obj = js.Dynamic.literal(scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleYTransform]
  }
  @scala.inline
  implicit class ScaleYTransformOps[Self <: ScaleYTransform] (val x: Self) extends AnyVal {
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
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
  }
  
}


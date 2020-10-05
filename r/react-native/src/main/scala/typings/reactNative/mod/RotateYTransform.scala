package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateYTransform extends js.Object {
  var rotateY: String = js.native
}

object RotateYTransform {
  @scala.inline
  def apply(rotateY: String): RotateYTransform = {
    val __obj = js.Dynamic.literal(rotateY = rotateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateYTransform]
  }
  @scala.inline
  implicit class RotateYTransformOps[Self <: RotateYTransform] (val x: Self) extends AnyVal {
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
    def setRotateY(value: String): Self = this.set("rotateY", value.asInstanceOf[js.Any])
  }
  
}


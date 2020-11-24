package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateXTransform extends js.Object {
  
  var rotateX: String = js.native
}
object RotateXTransform {
  
  @scala.inline
  def apply(rotateX: String): RotateXTransform = {
    val __obj = js.Dynamic.literal(rotateX = rotateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateXTransform]
  }
  
  @scala.inline
  implicit class RotateXTransformOps[Self <: RotateXTransform] (val x: Self) extends AnyVal {
    
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
    def setRotateX(value: String): Self = this.set("rotateX", value.asInstanceOf[js.Any])
  }
}

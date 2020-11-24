package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformationDescriptor extends js.Object {
  
  var diffMatrix: Matrix_ = js.native
  
  var global: String = js.native
  
  var globalMatrix: Matrix_ = js.native
  
  var local: String = js.native
  
  var localMatrix: Matrix_ = js.native
  
  var string: String = js.native
}
object TransformationDescriptor {
  
  @scala.inline
  def apply(
    diffMatrix: Matrix_,
    global: String,
    globalMatrix: Matrix_,
    local: String,
    localMatrix: Matrix_,
    string: String
  ): TransformationDescriptor = {
    val __obj = js.Dynamic.literal(diffMatrix = diffMatrix.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], globalMatrix = globalMatrix.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], localMatrix = localMatrix.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationDescriptor]
  }
  
  @scala.inline
  implicit class TransformationDescriptorOps[Self <: TransformationDescriptor] (val x: Self) extends AnyVal {
    
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
    def setDiffMatrix(value: Matrix_): Self = this.set("diffMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: String): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalMatrix(value: Matrix_): Self = this.set("globalMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: String): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalMatrix(value: Matrix_): Self = this.set("localMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
  }
}

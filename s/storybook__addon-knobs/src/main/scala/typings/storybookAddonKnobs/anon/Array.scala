package typings.storybookAddonKnobs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array extends js.Object {
  
  var boolean: FunctionComponentBooleanT = js.native
  
  var button: FunctionComponentButtonTy = js.native
  
  var files: FunctionComponentFilesTyp = js.native
  
  var options: FunctionComponentOptionsT = js.native
  
  var select: FunctionComponentSelectTy = js.native
}
object Array {
  
  @scala.inline
  def apply(
    boolean: FunctionComponentBooleanT,
    button: FunctionComponentButtonTy,
    files: FunctionComponentFilesTyp,
    options: FunctionComponentOptionsT,
    select: FunctionComponentSelectTy
  ): Array = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
    
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
    def setBoolean(value: FunctionComponentBooleanT): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: FunctionComponentButtonTy): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: FunctionComponentFilesTyp): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: FunctionComponentOptionsT): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: FunctionComponentSelectTy): Self = this.set("select", value.asInstanceOf[js.Any])
  }
}

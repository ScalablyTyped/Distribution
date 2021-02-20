package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array extends StObject {
  
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
  implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolean(value: FunctionComponentBooleanT): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: FunctionComponentButtonTy): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: FunctionComponentFilesTyp): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: FunctionComponentOptionsT): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: FunctionComponentSelectTy): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}

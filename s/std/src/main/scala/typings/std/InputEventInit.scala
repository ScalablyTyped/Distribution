package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputEventInit extends UIEventInit {
  
  var data: js.UndefOr[java.lang.String | Null] = js.native
  
  var inputType: js.UndefOr[java.lang.String] = js.native
  
  var isComposing: js.UndefOr[scala.Boolean] = js.native
}
object InputEventInit {
  
  @scala.inline
  def apply(): InputEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputEventInit]
  }
  
  @scala.inline
  implicit class InputEventInitMutableBuilder[Self <: InputEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: java.lang.String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setInputType(value: java.lang.String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    @scala.inline
    def setIsComposing(value: scala.Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComposingUndefined: Self = StObject.set(x, "isComposing", js.undefined)
  }
}

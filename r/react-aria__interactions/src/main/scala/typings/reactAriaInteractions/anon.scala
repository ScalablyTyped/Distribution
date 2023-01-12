package typings.reactAriaInteractions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsTextInput extends StObject {
    
    var isTextInput: js.UndefOr[Boolean] = js.undefined
  }
  object IsTextInput {
    
    inline def apply(): IsTextInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsTextInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsTextInput] (val x: Self) extends AnyVal {
      
      inline def setIsTextInput(value: Boolean): Self = StObject.set(x, "isTextInput", value.asInstanceOf[js.Any])
      
      inline def setIsTextInputUndefined: Self = StObject.set(x, "isTextInput", js.undefined)
    }
  }
}

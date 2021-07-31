package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.ValidateMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: js.UndefOr[ValidateMessage] = js.undefined
  
  var invalid: js.UndefOr[ValidateMessage] = js.undefined
  
  var parse: js.UndefOr[ValidateMessage] = js.undefined
}
object Format {
  
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ValidateMessage): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatFunction0(value: () => String): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setInvalid(value: ValidateMessage): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidFunction0(value: () => String): Self = StObject.set(x, "invalid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    @scala.inline
    def setParse(value: ValidateMessage): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseFunction0(value: () => String): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
  }
}

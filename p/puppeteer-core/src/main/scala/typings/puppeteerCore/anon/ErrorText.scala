package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorText extends StObject {
  
  var errorText: String
}
object ErrorText {
  
  @scala.inline
  def apply(errorText: String): ErrorText = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorText]
  }
  
  @scala.inline
  implicit class ErrorTextMutableBuilder[Self <: ErrorText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
  }
}

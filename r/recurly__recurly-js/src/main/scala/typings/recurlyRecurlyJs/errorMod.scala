package typings.recurlyRecurlyJs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @js.native
  trait RecurlyError extends Error {
    
    var classification: String = js.native
    
    var code: String = js.native
    
    var help: js.UndefOr[String] = js.native
  }
  object RecurlyError {
    
    @scala.inline
    def apply(classification: String, code: String, message: String, name: String): RecurlyError = {
      val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecurlyError]
    }
    
    @scala.inline
    implicit class RecurlyErrorMutableBuilder[Self <: RecurlyError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassification(value: String): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    }
  }
}

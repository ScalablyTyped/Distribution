package typings.recurlyRecurlyJs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  trait RecurlyError
    extends StObject
       with Error {
    
    var classification: String
    
    var code: String
    
    var help: js.UndefOr[String] = js.undefined
  }
  object RecurlyError {
    
    inline def apply(classification: String, code: String, message: String, name: String): RecurlyError = {
      val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecurlyError]
    }
    
    extension [Self <: RecurlyError](x: Self) {
      
      inline def setClassification(value: String): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    }
  }
}

package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.anon.Field
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorMod {
  
  trait RecurlyError
    extends StObject
       with Error {
    
    var classification: String
    
    var code: String
    
    var details: js.UndefOr[js.Array[Field]] = js.undefined
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    
    var help: js.UndefOr[String] = js.undefined
  }
  object RecurlyError {
    
    inline def apply(classification: String, code: String, message: String, name: String): RecurlyError = {
      val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecurlyError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecurlyError] (val x: Self) extends AnyVal {
      
      inline def setClassification(value: String): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: js.Array[Field]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setDetailsVarargs(value: Field*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    }
  }
}

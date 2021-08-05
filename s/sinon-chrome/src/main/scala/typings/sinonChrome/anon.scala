package typings.sinonChrome

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: String
    
    var example: js.UndefOr[String] = js.undefined
  }
  object Content {
    
    inline def apply(content: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    }
  }
  
  trait Description extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var message: String
    
    var placeholders: js.UndefOr[StringDictionary[Content]] = js.undefined
  }
  object Description {
    
    inline def apply(message: String): Description = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPlaceholders(value: StringDictionary[Content]): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      inline def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
    }
  }
}

package typings.slonik

import typings.slonik.mod.FieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Format extends StObject {
    
    var format: String
    
    var test: js.UndefOr[js.Function1[/* field */ FieldType, Boolean]] = js.undefined
  }
  object Format {
    
    inline def apply(format: String): Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setTest(value: /* field */ FieldType => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  trait StripComments extends StObject {
    
    var stripComments: js.UndefOr[Boolean] = js.undefined
  }
  object StripComments {
    
    inline def apply(): StripComments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StripComments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StripComments] (val x: Self) extends AnyVal {
      
      inline def setStripComments(value: Boolean): Self = StObject.set(x, "stripComments", value.asInstanceOf[js.Any])
      
      inline def setStripCommentsUndefined: Self = StObject.set(x, "stripComments", js.undefined)
    }
  }
}

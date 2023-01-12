package typings.sparqljs

import typings.sparqljs.mod.IriTerm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default extends StObject {
    
    var default: js.Array[IriTerm]
    
    var named: js.Array[IriTerm]
  }
  object Default {
    
    inline def apply(default: js.Array[IriTerm], named: js.Array[IriTerm]): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: js.Array[IriTerm]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultVarargs(value: IriTerm*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setNamed(value: js.Array[IriTerm]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setNamedVarargs(value: IriTerm*): Self = StObject.set(x, "named", js.Array(value*))
    }
  }
}

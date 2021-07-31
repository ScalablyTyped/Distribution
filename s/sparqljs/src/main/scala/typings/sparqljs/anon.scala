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
    
    @scala.inline
    def apply(default: js.Array[IriTerm], named: js.Array[IriTerm]): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Array[IriTerm]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVarargs(value: IriTerm*): Self = StObject.set(x, "default", js.Array(value :_*))
      
      @scala.inline
      def setNamed(value: js.Array[IriTerm]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedVarargs(value: IriTerm*): Self = StObject.set(x, "named", js.Array(value :_*))
    }
  }
}

package typings.rdfjsTypes

import typings.rdfjsTypes.dataModelMod.Variable
import typings.rdfjsTypes.queryCommonMod.QuadTermName
import typings.rdfjsTypes.rdfjsTypesStrings.asc
import typings.rdfjsTypes.rdfjsTypesStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Direction[T /* <: QuadTermName | Variable */] extends StObject {
    
    var direction: asc | desc
    
    var term: T
  }
  object Direction {
    
    inline def apply[T /* <: QuadTermName | Variable */](direction: asc | desc, term: T): Direction[T] = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Direction[?], T /* <: QuadTermName | Variable */] (val x: Self & Direction[T]) extends AnyVal {
      
      inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setTerm(value: T): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
  
  trait Variables extends StObject {
    
    var variables: js.Array[Variable]
  }
  object Variables {
    
    inline def apply(variables: js.Array[Variable]): Variables = {
      val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variables]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Variables] (val x: Self) extends AnyVal {
      
      inline def setVariables(value: js.Array[Variable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value*))
    }
  }
}

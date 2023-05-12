package typings.stagehand

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Methods extends StObject {
    
    var methods: js.Array[String]
    
    var name: String
  }
  object Methods {
    
    inline def apply(methods: js.Array[String], name: String): Methods = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait STAGEHANDINSTANCE[T] extends StObject
}

package typings.ramlTypesystem

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[T]
    extends StObject
       with Instantiable1[/* v */ Any, T]
       with Instantiable2[/* v */ Any, /* x */ Any, T]
       with Instantiable3[/* v */ Any, (/* x */ Any) | (/* x */ Unit), /* p */ String, T]
  
  @js.native
  trait Instantiable[T]
    extends StObject
       with Instantiable0[T]
       with Instantiable1[/* p */ Any, T]
  
  @js.native
  trait InstantiableT[T]
    extends StObject
       with Instantiable1[/* v */ Any, T]
  
  trait Key extends StObject {
    
    var key: String
    
    var name: String
    
    var value: Any
  }
  object Key {
    
    inline def apply(key: String, name: String, value: Any): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

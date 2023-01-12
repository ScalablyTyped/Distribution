package typings.realmCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ArgsObject[T /* <: js.Object */] extends StObject {
    
    var argsObject: T
    
    var restArgs: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ArgsObject {
    
    inline def apply[T /* <: js.Object */](argsObject: T): ArgsObject[T] = {
      val __obj = js.Dynamic.literal(argsObject = argsObject.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsObject[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArgsObject[?], T /* <: js.Object */] (val x: Self & ArgsObject[T]) extends AnyVal {
      
      inline def setArgsObject(value: T): Self = StObject.set(x, "argsObject", value.asInstanceOf[js.Any])
      
      inline def setRestArgs(value: js.Array[Any]): Self = StObject.set(x, "restArgs", value.asInstanceOf[js.Any])
      
      inline def setRestArgsUndefined: Self = StObject.set(x, "restArgs", js.undefined)
      
      inline def setRestArgsVarargs(value: Any*): Self = StObject.set(x, "restArgs", js.Array(value*))
    }
  }
}

package typings.reactSyntaxHighlighter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* spread */ StringDictionary[Any] {
    
    var className: js.Array[Any]
  }
  object Dictkey {
    
    inline def apply(className: js.Array[Any]): Dictkey = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: js.Array[Any]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameVarargs(value: Any*): Self = StObject.set(x, "className", js.Array(value*))
    }
  }
}

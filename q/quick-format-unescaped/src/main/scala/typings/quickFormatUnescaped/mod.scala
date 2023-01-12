package typings.quickFormatUnescaped

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fmt: String, parameters: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(fmt: String, parameters: js.Array[Any], options: Options): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("quick-format-unescaped", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Function that stringifies objects.
      */
    def stringify(o: Any): String
  }
  object Options {
    
    inline def apply(stringify: Any => String): Options = {
      val __obj = js.Dynamic.literal(stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setStringify(value: Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    }
  }
}

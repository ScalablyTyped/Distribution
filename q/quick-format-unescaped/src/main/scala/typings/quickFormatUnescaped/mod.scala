package typings.quickFormatUnescaped

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quick-format-unescaped", JSImport.Namespace)
  @js.native
  def apply(fmt: String, parameters: js.Array[_]): String = js.native
  @JSImport("quick-format-unescaped", JSImport.Namespace)
  @js.native
  def apply(fmt: String, parameters: js.Array[_], options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Function that stringifies objects.
      */
    def stringify(o: js.Any): String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(stringify: js.Any => String): Options = {
      val __obj = js.Dynamic.literal(stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStringify(value: js.Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    }
  }
}

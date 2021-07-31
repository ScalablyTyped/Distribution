package typings.quickFormatUnescaped

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(fmt: String, parameters: js.Array[js.Any]): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(fmt: String, parameters: js.Array[js.Any], options: Options): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("quick-format-unescaped", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Function that stringifies objects.
      */
    def stringify(o: js.Any): String
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

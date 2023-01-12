package typings.stringWidth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-width", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(string: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Options extends StObject {
    
    /**
    	Count [ambiguous width characters](https://www.unicode.org/reports/tr11/#Ambiguous) as having narrow width (count of 1) instead of wide width (count of 2).
    	@default true
    	*/
    val ambiguousIsNarrow: Boolean
  }
  object Options {
    
    inline def apply(ambiguousIsNarrow: Boolean): Options = {
      val __obj = js.Dynamic.literal(ambiguousIsNarrow = ambiguousIsNarrow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAmbiguousIsNarrow(value: Boolean): Self = StObject.set(x, "ambiguousIsNarrow", value.asInstanceOf[js.Any])
    }
  }
}

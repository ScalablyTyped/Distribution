package typings.stringLength

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(string: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Options extends StObject {
    
    /**
    	Whether [ANSI escape codes](https://en.wikipedia.org/wiki/ANSI_escape_code) should be counted. They are ignored by default.
    	@default false
    	*/
    val countAnsiEscapeCodes: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCountAnsiEscapeCodes(value: Boolean): Self = StObject.set(x, "countAnsiEscapeCodes", value.asInstanceOf[js.Any])
      
      inline def setCountAnsiEscapeCodesUndefined: Self = StObject.set(x, "countAnsiEscapeCodes", js.undefined)
    }
  }
}

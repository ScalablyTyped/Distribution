package typings.stripJsonComments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("strip-json-comments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(jsonString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(jsonString.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(jsonString: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	Strip trailing commas in addition to comments.
    	@default true
    	*/
    val trailingCommas: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Replace comments and trailing commas with whitespace instead of stripping them entirely.
    	@default true
    	*/
    val whitespace: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setTrailingCommas(value: Boolean): Self = StObject.set(x, "trailingCommas", value.asInstanceOf[js.Any])
      
      inline def setTrailingCommasUndefined: Self = StObject.set(x, "trailingCommas", js.undefined)
      
      inline def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
    }
  }
}

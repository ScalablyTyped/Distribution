package typings.replaceString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("replace-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String, needle: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(input: String, needle: String, replacement: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(input: String, needle: String, replacement: ReplacementFunction): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(input: String, needle: String, replacement: ReplacementFunction, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	Whether or not substring matching should be case-insensitive.
    	@default false
    	*/
    val caseInsensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Index at which to start replacing.
    	@default 0
    	*/
    val fromIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setFromIndexUndefined: Self = StObject.set(x, "fromIndex", js.undefined)
    }
  }
  
  type ReplacementFunction = js.Function4[
    /* matchedSubstring */ String, 
    /* matchCount */ Double, 
    /* input */ String, 
    /* matchIndex */ Double, 
    String
  ]
}

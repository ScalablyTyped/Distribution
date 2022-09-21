package typings.randomatic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(length: Double): String = ^.asInstanceOf[js.Dynamic].apply(length.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(pattern: String): String = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(pattern: String, length: Double): String = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(pattern: String, length: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(pattern: String, length: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(pattern: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("randomatic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("randomatic", "isCrypto")
  @js.native
  val isCrypto: Boolean = js.native
  
  trait Options extends StObject {
    
    var chars: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChars(value: String): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    }
  }
}

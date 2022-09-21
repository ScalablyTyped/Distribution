package typings.requireFromString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(code: String): Any = ^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(code: String, filename: String): Any = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(code: String, filename: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(code: String, filename: Unit, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(code: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("require-from-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * List of `paths`, that will be appended to module `paths`.
      * Useful when you want to be able require modules from these paths.
      */
    var appendPaths: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * List of `paths`, that will be preppended to module `paths`.
      * Useful when you want to be able require modules from these paths.
      */
    var prependPaths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppendPaths(value: js.Array[String]): Self = StObject.set(x, "appendPaths", value.asInstanceOf[js.Any])
      
      inline def setAppendPathsUndefined: Self = StObject.set(x, "appendPaths", js.undefined)
      
      inline def setAppendPathsVarargs(value: String*): Self = StObject.set(x, "appendPaths", js.Array(value*))
      
      inline def setPrependPaths(value: js.Array[String]): Self = StObject.set(x, "prependPaths", value.asInstanceOf[js.Any])
      
      inline def setPrependPathsUndefined: Self = StObject.set(x, "prependPaths", js.undefined)
      
      inline def setPrependPathsVarargs(value: String*): Self = StObject.set(x, "prependPaths", js.Array(value*))
    }
  }
}

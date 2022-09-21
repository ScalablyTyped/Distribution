package typings.requireAll

import org.scalablytyped.runtime.StringDictionary
import typings.requireAll.requireAllBooleans.`false`
import typings.requireAll.requireAllBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: String): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def apply(options: Options): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  @JSImport("require-all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var dirname: String
    
    var excludeDirs: js.UndefOr[js.RegExp] = js.undefined
    
    var filter: js.UndefOr[
        (js.Function2[/* name */ String, /* path */ String, js.UndefOr[String | `false`]]) | js.RegExp
      ] = js.undefined
    
    var map: js.UndefOr[js.Function2[/* name */ String, /* path */ String, String]] = js.undefined
    
    var recursive: js.UndefOr[`true` | `false`] = js.undefined
    
    var resolve: js.UndefOr[js.Function1[/* module */ Any, Any]] = js.undefined
  }
  object Options {
    
    inline def apply(dirname: String): Options = {
      val __obj = js.Dynamic.literal(dirname = dirname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setExcludeDirs(value: js.RegExp): Self = StObject.set(x, "excludeDirs", value.asInstanceOf[js.Any])
      
      inline def setExcludeDirsUndefined: Self = StObject.set(x, "excludeDirs", js.undefined)
      
      inline def setFilter(
        value: (js.Function2[/* name */ String, /* path */ String, js.UndefOr[String | `false`]]) | js.RegExp
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction2(value: (/* name */ String, /* path */ String) => js.UndefOr[String | `false`]): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setMap(value: (/* name */ String, /* path */ String) => String): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setRecursive(value: `true` | `false`): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setResolve(value: /* module */ Any => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
}

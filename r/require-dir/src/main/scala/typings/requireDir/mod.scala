package typings.requireDir

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(directory: String): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].apply(directory.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def apply(directory: String, options: options): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(directory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  @JSImport("require-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait options extends StObject {
    
    var duplicates: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[js.Any] = js.undefined
    
    var mapKey: js.UndefOr[js.Any] = js.undefined
    
    var mapValue: js.UndefOr[js.Any] = js.undefined
    
    var recurse: js.UndefOr[Boolean] = js.undefined
  }
  object options {
    
    inline def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    extension [Self <: options](x: Self) {
      
      inline def setDuplicates(value: Boolean): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      inline def setDuplicatesUndefined: Self = StObject.set(x, "duplicates", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setMapKey(value: js.Any): Self = StObject.set(x, "mapKey", value.asInstanceOf[js.Any])
      
      inline def setMapKeyUndefined: Self = StObject.set(x, "mapKey", js.undefined)
      
      inline def setMapValue(value: js.Any): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
      
      inline def setMapValueUndefined: Self = StObject.set(x, "mapValue", js.undefined)
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      inline def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
    }
  }
}

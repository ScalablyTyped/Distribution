package typings.reactDndHtml5Backend

import org.scalablytyped.runtime.StringDictionary
import typings.std.DataTransfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeTypesConfigMod {
  
  trait NativeItemConfig extends StObject {
    
    var exposeProperties: NativeItemConfigExposePropreties
    
    var matchesTypes: js.Array[String]
  }
  object NativeItemConfig {
    
    inline def apply(exposeProperties: NativeItemConfigExposePropreties, matchesTypes: js.Array[String]): NativeItemConfig = {
      val __obj = js.Dynamic.literal(exposeProperties = exposeProperties.asInstanceOf[js.Any], matchesTypes = matchesTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeItemConfig]
    }
    
    extension [Self <: NativeItemConfig](x: Self) {
      
      inline def setExposeProperties(value: NativeItemConfigExposePropreties): Self = StObject.set(x, "exposeProperties", value.asInstanceOf[js.Any])
      
      inline def setMatchesTypes(value: js.Array[String]): Self = StObject.set(x, "matchesTypes", value.asInstanceOf[js.Any])
      
      inline def setMatchesTypesVarargs(value: String*): Self = StObject.set(x, "matchesTypes", js.Array(value*))
    }
  }
  
  type NativeItemConfigExposePropreties = StringDictionary[
    js.Function2[/* dataTransfer */ DataTransfer, /* matchesTypes */ js.Array[String], Any]
  ]
}

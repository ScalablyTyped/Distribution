package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extension extends StObject {
  
  var base: js.UndefOr[Schema] = js.undefined
  
  var coerce: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      Any
    ]
  ] = js.undefined
  
  var describe: js.UndefOr[
    js.ThisFunction1[/* this */ Schema, /* description */ Description_, Description_]
  ] = js.undefined
  
  var language: js.UndefOr[LanguageOptions] = js.undefined
  
  var name: String
  
  var pre: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      Any
    ]
  ] = js.undefined
  
  var rules: js.UndefOr[js.Array[Rules[Any]]] = js.undefined
}
object Extension {
  
  inline def apply(name: String): Extension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  extension [Self <: Extension](x: Self) {
    
    inline def setBase(value: Schema): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setCoerce(
      value: js.ThisFunction3[
          /* this */ ExtensionBoundSchema, 
          /* value */ Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          Any
        ]
    ): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    inline def setDescribe(value: js.ThisFunction1[/* this */ Schema, /* description */ Description_, Description_]): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    inline def setDescribeUndefined: Self = StObject.set(x, "describe", js.undefined)
    
    inline def setLanguage(value: LanguageOptions): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPre(
      value: js.ThisFunction3[
          /* this */ ExtensionBoundSchema, 
          /* value */ Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          Any
        ]
    ): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    inline def setRules(value: js.Array[Rules[Any]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Rules[Any]*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}

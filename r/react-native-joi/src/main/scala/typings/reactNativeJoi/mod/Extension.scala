package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends StObject {
  
  var base: js.UndefOr[Schema] = js.native
  
  var coerce: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.native
  
  var describe: js.UndefOr[
    js.ThisFunction1[/* this */ Schema, /* description */ Description_, Description_]
  ] = js.native
  
  var language: js.UndefOr[LanguageOptions] = js.native
  
  var name: String = js.native
  
  var pre: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.native
  
  var rules: js.UndefOr[js.Array[Rules[_]]] = js.native
}
object Extension {
  
  @scala.inline
  def apply(name: String): Extension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Schema): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setCoerce(
      value: js.ThisFunction3[
          /* this */ ExtensionBoundSchema, 
          /* value */ js.Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          _
        ]
    ): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    @scala.inline
    def setDescribe(value: js.ThisFunction1[/* this */ Schema, /* description */ Description_, Description_]): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribeUndefined: Self = StObject.set(x, "describe", js.undefined)
    
    @scala.inline
    def setLanguage(value: LanguageOptions): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageNull: Self = StObject.set(x, "language", null)
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre(
      value: js.ThisFunction3[
          /* this */ ExtensionBoundSchema, 
          /* value */ js.Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          _
        ]
    ): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[Rules[_]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rules[js.Any]*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}

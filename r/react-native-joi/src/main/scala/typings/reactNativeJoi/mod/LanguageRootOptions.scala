package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeJoi.anon.WrapArrays
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  root :string | undefined,   key :string | undefined,   messages :{  wrapArrays :boolean | undefined} | undefined, [key: string] : react-native-joi.react-native-joi.LanguageOptions} & std.Partial<std.Record<react-native-joi.react-native-joi.Types, react-native-joi.react-native-joi.LanguageOptions>> */
trait LanguageRootOptions
  extends StObject
     with /* key */ StringDictionary[LanguageOptions] {
  
  var alternatives: js.UndefOr[LanguageOptions] = js.undefined
  
  var any: js.UndefOr[LanguageOptions] = js.undefined
  
  var array: js.UndefOr[LanguageOptions] = js.undefined
  
  var binary: js.UndefOr[LanguageOptions] = js.undefined
  
  var boolean: js.UndefOr[LanguageOptions] = js.undefined
  
  var date: js.UndefOr[LanguageOptions] = js.undefined
  
  var function: js.UndefOr[LanguageOptions] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var `lazy`: js.UndefOr[LanguageOptions] = js.undefined
  
  var messages: js.UndefOr[WrapArrays] = js.undefined
  
  var number: js.UndefOr[LanguageOptions] = js.undefined
  
  var `object`: js.UndefOr[LanguageOptions] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var string: js.UndefOr[LanguageOptions] = js.undefined
}
object LanguageRootOptions {
  
  inline def apply(): LanguageRootOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageRootOptions]
  }
  
  extension [Self <: LanguageRootOptions](x: Self) {
    
    inline def setAlternatives(value: LanguageOptions): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesNull: Self = StObject.set(x, "alternatives", null)
    
    inline def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    inline def setAny(value: LanguageOptions): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setAnyNull: Self = StObject.set(x, "any", null)
    
    inline def setAnyUndefined: Self = StObject.set(x, "any", js.undefined)
    
    inline def setArray(value: LanguageOptions): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayNull: Self = StObject.set(x, "array", null)
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setBinary(value: LanguageOptions): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryNull: Self = StObject.set(x, "binary", null)
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setBoolean(value: LanguageOptions): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setBooleanNull: Self = StObject.set(x, "boolean", null)
    
    inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
    
    inline def setDate(value: LanguageOptions): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setFunction(value: LanguageOptions): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionNull: Self = StObject.set(x, "function", null)
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLazy(value: LanguageOptions): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyNull: Self = StObject.set(x, "lazy", null)
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setMessages(value: WrapArrays): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setNumber(value: LanguageOptions): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setObject(value: LanguageOptions): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectNull: Self = StObject.set(x, "object", null)
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setString(value: LanguageOptions): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringNull: Self = StObject.set(x, "string", null)
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}

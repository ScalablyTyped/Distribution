package typings.searchParams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeMod {
  
  @JSImport("search-params/dist/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(value: Any, opts: IFinalOptions): String | Boolean | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Boolean | Null]
  
  inline def decodeValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode(name: String, value: Any, opts: IFinalOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeArray(name: String, arr: js.Array[Any], opts: IFinalOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeArray")(name.asInstanceOf[js.Any], arr.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def makeOptions(): IFinalOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("makeOptions")().asInstanceOf[IFinalOptions]
  inline def makeOptions(opts: IOptions): IFinalOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("makeOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[IFinalOptions]
  
  trait IFinalOptions extends StObject {
    
    var arrayFormat: typings.searchParams.encodeMod.arrayFormat
    
    var booleanFormat: typings.searchParams.encodeMod.booleanFormat
    
    var nullFormat: typings.searchParams.encodeMod.nullFormat
  }
  object IFinalOptions {
    
    inline def apply(arrayFormat: arrayFormat, booleanFormat: booleanFormat, nullFormat: nullFormat): IFinalOptions = {
      val __obj = js.Dynamic.literal(arrayFormat = arrayFormat.asInstanceOf[js.Any], booleanFormat = booleanFormat.asInstanceOf[js.Any], nullFormat = nullFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFinalOptions]
    }
    
    extension [Self <: IFinalOptions](x: Self) {
      
      inline def setArrayFormat(value: arrayFormat): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setBooleanFormat(value: booleanFormat): Self = StObject.set(x, "booleanFormat", value.asInstanceOf[js.Any])
      
      inline def setNullFormat(value: nullFormat): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOptions extends StObject {
    
    var arrayFormat: js.UndefOr[typings.searchParams.encodeMod.arrayFormat] = js.undefined
    
    var booleanFormat: js.UndefOr[typings.searchParams.encodeMod.booleanFormat] = js.undefined
    
    var nullFormat: js.UndefOr[typings.searchParams.encodeMod.nullFormat] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setArrayFormat(value: arrayFormat): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      inline def setBooleanFormat(value: booleanFormat): Self = StObject.set(x, "booleanFormat", value.asInstanceOf[js.Any])
      
      inline def setBooleanFormatUndefined: Self = StObject.set(x, "booleanFormat", js.undefined)
      
      inline def setNullFormat(value: nullFormat): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
      
      inline def setNullFormatUndefined: Self = StObject.set(x, "nullFormat", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.searchParams.searchParamsStrings.none
    - typings.searchParams.searchParamsStrings.brackets
    - typings.searchParams.searchParamsStrings.index
  */
  trait arrayFormat extends StObject
  object arrayFormat {
    
    inline def brackets: typings.searchParams.searchParamsStrings.brackets = "brackets".asInstanceOf[typings.searchParams.searchParamsStrings.brackets]
    
    inline def index: typings.searchParams.searchParamsStrings.index = "index".asInstanceOf[typings.searchParams.searchParamsStrings.index]
    
    inline def none: typings.searchParams.searchParamsStrings.none = "none".asInstanceOf[typings.searchParams.searchParamsStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.searchParams.searchParamsStrings.none
    - typings.searchParams.searchParamsStrings.string
    - typings.searchParams.searchParamsStrings.unicode
    - typings.searchParams.searchParamsStrings.`empty-true`
  */
  trait booleanFormat extends StObject
  object booleanFormat {
    
    inline def `empty-true`: typings.searchParams.searchParamsStrings.`empty-true` = "empty-true".asInstanceOf[typings.searchParams.searchParamsStrings.`empty-true`]
    
    inline def none: typings.searchParams.searchParamsStrings.none = "none".asInstanceOf[typings.searchParams.searchParamsStrings.none]
    
    inline def string: typings.searchParams.searchParamsStrings.string = "string".asInstanceOf[typings.searchParams.searchParamsStrings.string]
    
    inline def unicode: typings.searchParams.searchParamsStrings.unicode = "unicode".asInstanceOf[typings.searchParams.searchParamsStrings.unicode]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.searchParams.searchParamsStrings.default
    - typings.searchParams.searchParamsStrings.string
    - typings.searchParams.searchParamsStrings.hidden
  */
  trait nullFormat extends StObject
  object nullFormat {
    
    inline def default: typings.searchParams.searchParamsStrings.default = "default".asInstanceOf[typings.searchParams.searchParamsStrings.default]
    
    inline def hidden: typings.searchParams.searchParamsStrings.hidden = "hidden".asInstanceOf[typings.searchParams.searchParamsStrings.hidden]
    
    inline def string: typings.searchParams.searchParamsStrings.string = "string".asInstanceOf[typings.searchParams.searchParamsStrings.string]
  }
}

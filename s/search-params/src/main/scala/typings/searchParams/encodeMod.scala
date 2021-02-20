package typings.searchParams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeMod {
  
  @JSImport("search-params/dist/encode", "decode")
  @js.native
  def decode(value: js.Any, opts: IFinalOptions): String | Boolean | Null = js.native
  
  @JSImport("search-params/dist/encode", "encode")
  @js.native
  def encode(name: String, value: js.Any, opts: IFinalOptions): String = js.native
  
  @JSImport("search-params/dist/encode", "encodeArray")
  @js.native
  def encodeArray(name: String, arr: js.Array[_], opts: IFinalOptions): String = js.native
  
  @JSImport("search-params/dist/encode", "makeOptions")
  @js.native
  def makeOptions(): IFinalOptions = js.native
  @JSImport("search-params/dist/encode", "makeOptions")
  @js.native
  def makeOptions(opts: IOptions): IFinalOptions = js.native
  
  @js.native
  trait IFinalOptions extends StObject {
    
    var arrayFormat: typings.searchParams.encodeMod.arrayFormat = js.native
    
    var booleanFormat: typings.searchParams.encodeMod.booleanFormat = js.native
    
    var nullFormat: typings.searchParams.encodeMod.nullFormat = js.native
  }
  object IFinalOptions {
    
    @scala.inline
    def apply(arrayFormat: arrayFormat, booleanFormat: booleanFormat, nullFormat: nullFormat): IFinalOptions = {
      val __obj = js.Dynamic.literal(arrayFormat = arrayFormat.asInstanceOf[js.Any], booleanFormat = booleanFormat.asInstanceOf[js.Any], nullFormat = nullFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFinalOptions]
    }
    
    @scala.inline
    implicit class IFinalOptionsMutableBuilder[Self <: IFinalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayFormat(value: arrayFormat): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanFormat(value: booleanFormat): Self = StObject.set(x, "booleanFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullFormat(value: nullFormat): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOptions extends StObject {
    
    var arrayFormat: js.UndefOr[typings.searchParams.encodeMod.arrayFormat] = js.native
    
    var booleanFormat: js.UndefOr[typings.searchParams.encodeMod.booleanFormat] = js.native
    
    var nullFormat: js.UndefOr[typings.searchParams.encodeMod.nullFormat] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayFormat(value: arrayFormat): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      @scala.inline
      def setBooleanFormat(value: booleanFormat): Self = StObject.set(x, "booleanFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanFormatUndefined: Self = StObject.set(x, "booleanFormat", js.undefined)
      
      @scala.inline
      def setNullFormat(value: nullFormat): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullFormatUndefined: Self = StObject.set(x, "nullFormat", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.searchParams.searchParamsStrings.none
    - typings.searchParams.searchParamsStrings.brackets
    - typings.searchParams.searchParamsStrings.index
  */
  trait arrayFormat extends StObject
  object arrayFormat {
    
    @scala.inline
    def brackets: typings.searchParams.searchParamsStrings.brackets = "brackets".asInstanceOf[typings.searchParams.searchParamsStrings.brackets]
    
    @scala.inline
    def index: typings.searchParams.searchParamsStrings.index = "index".asInstanceOf[typings.searchParams.searchParamsStrings.index]
    
    @scala.inline
    def none: typings.searchParams.searchParamsStrings.none = "none".asInstanceOf[typings.searchParams.searchParamsStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.searchParams.searchParamsStrings.none
    - typings.searchParams.searchParamsStrings.string
    - typings.searchParams.searchParamsStrings.unicode
    - typings.searchParams.searchParamsStrings.`empty-true`
  */
  trait booleanFormat extends StObject
  object booleanFormat {
    
    @scala.inline
    def `empty-true`: typings.searchParams.searchParamsStrings.`empty-true` = "empty-true".asInstanceOf[typings.searchParams.searchParamsStrings.`empty-true`]
    
    @scala.inline
    def none: typings.searchParams.searchParamsStrings.none = "none".asInstanceOf[typings.searchParams.searchParamsStrings.none]
    
    @scala.inline
    def string: typings.searchParams.searchParamsStrings.string = "string".asInstanceOf[typings.searchParams.searchParamsStrings.string]
    
    @scala.inline
    def unicode: typings.searchParams.searchParamsStrings.unicode = "unicode".asInstanceOf[typings.searchParams.searchParamsStrings.unicode]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.searchParams.searchParamsStrings.default
    - typings.searchParams.searchParamsStrings.string
    - typings.searchParams.searchParamsStrings.hidden
  */
  trait nullFormat extends StObject
  object nullFormat {
    
    @scala.inline
    def default: typings.searchParams.searchParamsStrings.default = "default".asInstanceOf[typings.searchParams.searchParamsStrings.default]
    
    @scala.inline
    def hidden: typings.searchParams.searchParamsStrings.hidden = "hidden".asInstanceOf[typings.searchParams.searchParamsStrings.hidden]
    
    @scala.inline
    def string: typings.searchParams.searchParamsStrings.string = "string".asInstanceOf[typings.searchParams.searchParamsStrings.string]
  }
}

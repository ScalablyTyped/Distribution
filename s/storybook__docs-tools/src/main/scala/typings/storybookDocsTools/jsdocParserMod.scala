package typings.storybookDocsTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsdocParserMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/jsdocParser", "parseJsDoc")
  @js.native
  val parseJsDoc: ParseJsDoc_ = js.native
  
  trait ExtractedJsDoc extends StObject {
    
    var ignore: Boolean
    
    var params: js.UndefOr[js.Array[ExtractedJsDocParam]] = js.undefined
    
    var returns: js.UndefOr[ExtractedJsDocReturns] = js.undefined
  }
  object ExtractedJsDoc {
    
    inline def apply(ignore: Boolean): ExtractedJsDoc = {
      val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractedJsDoc]
    }
    
    extension [Self <: ExtractedJsDoc](x: Self) {
      
      inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[ExtractedJsDocParam]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: ExtractedJsDocParam*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setReturns(value: ExtractedJsDocReturns): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
      
      inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    }
  }
  
  trait ExtractedJsDocParam extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    def getPrettyName(): String
    
    def getTypeName(): String
    
    var name: String
    
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object ExtractedJsDocParam {
    
    inline def apply(getPrettyName: () => String, getTypeName: () => String, name: String): ExtractedJsDocParam = {
      val __obj = js.Dynamic.literal(getPrettyName = js.Any.fromFunction0(getPrettyName), getTypeName = js.Any.fromFunction0(getTypeName), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractedJsDocParam]
    }
    
    extension [Self <: ExtractedJsDocParam](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGetPrettyName(value: () => String): Self = StObject.set(x, "getPrettyName", js.Any.fromFunction0(value))
      
      inline def setGetTypeName(value: () => String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExtractedJsDocReturns extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    def getTypeName(): String
    
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object ExtractedJsDocReturns {
    
    inline def apply(getTypeName: () => String): ExtractedJsDocReturns = {
      val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction0(getTypeName))
      __obj.asInstanceOf[ExtractedJsDocReturns]
    }
    
    extension [Self <: ExtractedJsDocReturns](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGetTypeName(value: () => String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait JsDocParsingOptions extends StObject {
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object JsDocParsingOptions {
    
    inline def apply(): JsDocParsingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsDocParsingOptions]
    }
    
    extension [Self <: JsDocParsingOptions](x: Self) {
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait JsDocParsingResult extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var extractedTags: js.UndefOr[ExtractedJsDoc] = js.undefined
    
    var ignore: Boolean
    
    var includesJsDoc: Boolean
  }
  object JsDocParsingResult {
    
    inline def apply(ignore: Boolean, includesJsDoc: Boolean): JsDocParsingResult = {
      val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any], includesJsDoc = includesJsDoc.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsDocParsingResult]
    }
    
    extension [Self <: JsDocParsingResult](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExtractedTags(value: ExtractedJsDoc): Self = StObject.set(x, "extractedTags", value.asInstanceOf[js.Any])
      
      inline def setExtractedTagsUndefined: Self = StObject.set(x, "extractedTags", js.undefined)
      
      inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIncludesJsDoc(value: Boolean): Self = StObject.set(x, "includesJsDoc", value.asInstanceOf[js.Any])
    }
  }
  
  type ParseJsDoc_ = js.Function2[
    /* value */ js.UndefOr[String], 
    /* options */ js.UndefOr[JsDocParsingOptions], 
    JsDocParsingResult
  ]
}

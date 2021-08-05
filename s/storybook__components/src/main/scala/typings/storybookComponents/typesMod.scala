package typings.storybookComponents

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ArgType
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var defaultValue: js.UndefOr[js.Any] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object ArgType {
    
    inline def apply(): ArgType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgType]
    }
    
    extension [Self <: ArgType](x: Self) {
      
      inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type ArgTypes = StringDictionary[ArgType]
  
  type Args = StringDictionary[js.Any]
  
  trait JsDocParam extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object JsDocParam {
    
    inline def apply(name: String): JsDocParam = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsDocParam]
    }
    
    extension [Self <: JsDocParam](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsDocReturns extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
  }
  object JsDocReturns {
    
    inline def apply(): JsDocReturns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsDocReturns]
    }
    
    extension [Self <: JsDocReturns](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  trait JsDocTags extends StObject {
    
    var params: js.UndefOr[js.Array[JsDocParam]] = js.undefined
    
    var returns: js.UndefOr[JsDocReturns] = js.undefined
  }
  object JsDocTags {
    
    inline def apply(): JsDocTags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsDocTags]
    }
    
    extension [Self <: JsDocTags](x: Self) {
      
      inline def setParams(value: js.Array[JsDocParam]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: JsDocParam*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      inline def setReturns(value: JsDocReturns): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
      
      inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    }
  }
  
  type PropDefaultValue = PropSummaryValue
  
  trait PropSummaryValue extends StObject {
    
    var detail: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var summary: String
  }
  object PropSummaryValue {
    
    inline def apply(summary: String): PropSummaryValue = {
      val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropSummaryValue]
    }
    
    extension [Self <: PropSummaryValue](x: Self) {
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  type PropType = PropSummaryValue
  
  trait TableAnnotation extends StObject {
    
    var category: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[PropDefaultValue] = js.undefined
    
    var jsDocTags: js.UndefOr[JsDocTags] = js.undefined
    
    var `type`: PropType
  }
  object TableAnnotation {
    
    inline def apply(`type`: PropType): TableAnnotation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableAnnotation]
    }
    
    extension [Self <: TableAnnotation](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setDefaultValue(value: PropDefaultValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setJsDocTags(value: JsDocTags): Self = StObject.set(x, "jsDocTags", value.asInstanceOf[js.Any])
      
      inline def setJsDocTagsUndefined: Self = StObject.set(x, "jsDocTags", js.undefined)
      
      inline def setType(value: PropType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

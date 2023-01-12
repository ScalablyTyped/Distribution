package typings.storybookDocsTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ArgTypesDocgenPropDefMod {
  
  trait JsDocParam extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object JsDocParam {
    
    inline def apply(name: String): JsDocParam = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsDocParam]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsDocParam] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsDocReturns] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsDocTags] (val x: Self) extends AnyVal {
      
      inline def setParams(value: js.Array[JsDocParam]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: JsDocParam*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setReturns(value: JsDocReturns): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
      
      inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    }
  }
  
  trait PropDef extends StObject {
    
    var defaultValue: js.UndefOr[PropDefaultValue] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var jsDocTags: js.UndefOr[JsDocTags] = js.undefined
    
    var name: String
    
    var required: Boolean
    
    var sbType: js.UndefOr[Any] = js.undefined
    
    var `type`: PropType
  }
  object PropDef {
    
    inline def apply(name: String, required: Boolean, `type`: PropType): PropDef = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropDef] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: PropDefaultValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setJsDocTags(value: JsDocTags): Self = StObject.set(x, "jsDocTags", value.asInstanceOf[js.Any])
      
      inline def setJsDocTagsUndefined: Self = StObject.set(x, "jsDocTags", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSbType(value: Any): Self = StObject.set(x, "sbType", value.asInstanceOf[js.Any])
      
      inline def setSbTypeUndefined: Self = StObject.set(x, "sbType", js.undefined)
      
      inline def setType(value: PropType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type PropDefaultValue = PropSummaryValue
  
  trait PropSummaryValue extends StObject {
    
    var detail: js.UndefOr[String] = js.undefined
    
    var summary: String
  }
  object PropSummaryValue {
    
    inline def apply(summary: String): PropSummaryValue = {
      val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropSummaryValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropSummaryValue] (val x: Self) extends AnyVal {
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  type PropType = PropSummaryValue
}

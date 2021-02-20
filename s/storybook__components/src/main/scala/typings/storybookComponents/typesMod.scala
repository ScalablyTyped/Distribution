package typings.storybookComponents

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ArgType
    extends /* key */ StringDictionary[js.Any] {
    
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object ArgType {
    
    @scala.inline
    def apply(): ArgType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgType]
    }
    
    @scala.inline
    implicit class ArgTypeMutableBuilder[Self <: ArgType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type ArgTypes = StringDictionary[ArgType]
  
  type Args = StringDictionary[js.Any]
  
  @js.native
  trait JsDocParam extends StObject {
    
    var description: js.UndefOr[String] = js.native
    
    var name: String = js.native
  }
  object JsDocParam {
    
    @scala.inline
    def apply(name: String): JsDocParam = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsDocParam]
    }
    
    @scala.inline
    implicit class JsDocParamMutableBuilder[Self <: JsDocParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JsDocReturns extends StObject {
    
    var description: js.UndefOr[String] = js.native
  }
  object JsDocReturns {
    
    @scala.inline
    def apply(): JsDocReturns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsDocReturns]
    }
    
    @scala.inline
    implicit class JsDocReturnsMutableBuilder[Self <: JsDocReturns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  @js.native
  trait JsDocTags extends StObject {
    
    var params: js.UndefOr[js.Array[JsDocParam]] = js.native
    
    var returns: js.UndefOr[JsDocReturns] = js.native
  }
  object JsDocTags {
    
    @scala.inline
    def apply(): JsDocTags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsDocTags]
    }
    
    @scala.inline
    implicit class JsDocTagsMutableBuilder[Self <: JsDocTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: js.Array[JsDocParam]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParamsVarargs(value: JsDocParam*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setReturns(value: JsDocReturns): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    }
  }
  
  type PropDefaultValue = PropSummaryValue
  
  @js.native
  trait PropSummaryValue extends StObject {
    
    var detail: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var summary: String = js.native
  }
  object PropSummaryValue {
    
    @scala.inline
    def apply(summary: String): PropSummaryValue = {
      val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropSummaryValue]
    }
    
    @scala.inline
    implicit class PropSummaryValueMutableBuilder[Self <: PropSummaryValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  type PropType = PropSummaryValue
  
  @js.native
  trait TableAnnotation extends StObject {
    
    var category: js.UndefOr[String] = js.native
    
    var defaultValue: js.UndefOr[PropDefaultValue] = js.native
    
    var jsDocTags: js.UndefOr[JsDocTags] = js.native
    
    var `type`: PropType = js.native
  }
  object TableAnnotation {
    
    @scala.inline
    def apply(`type`: PropType): TableAnnotation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableAnnotation]
    }
    
    @scala.inline
    implicit class TableAnnotationMutableBuilder[Self <: TableAnnotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: PropDefaultValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setJsDocTags(value: JsDocTags): Self = StObject.set(x, "jsDocTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsDocTagsUndefined: Self = StObject.set(x, "jsDocTags", js.undefined)
      
      @scala.inline
      def setType(value: PropType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

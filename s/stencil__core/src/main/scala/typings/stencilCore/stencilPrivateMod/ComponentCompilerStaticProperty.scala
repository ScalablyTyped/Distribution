package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerStaticProperty extends StObject {
  
  var attribute: js.UndefOr[String] = js.undefined
  
  var complexType: ComponentCompilerPropertyComplexType
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var docs: CompilerJsDoc
  
  var mutable: Boolean
  
  var optional: Boolean
  
  var reflect: js.UndefOr[Boolean] = js.undefined
  
  var required: Boolean
  
  var `type`: ComponentCompilerPropertyType
}
object ComponentCompilerStaticProperty {
  
  inline def apply(
    complexType: ComponentCompilerPropertyComplexType,
    docs: CompilerJsDoc,
    mutable: Boolean,
    optional: Boolean,
    required: Boolean,
    `type`: ComponentCompilerPropertyType
  ): ComponentCompilerStaticProperty = {
    val __obj = js.Dynamic.literal(complexType = complexType.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], mutable = mutable.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerStaticProperty]
  }
  
  extension [Self <: ComponentCompilerStaticProperty](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setComplexType(value: ComponentCompilerPropertyComplexType): Self = StObject.set(x, "complexType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDocs(value: CompilerJsDoc): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setMutable(value: Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setReflect(value: Boolean): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
    
    inline def setReflectUndefined: Self = StObject.set(x, "reflect", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: ComponentCompilerPropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.prettyProptypes

import typings.prettyProptypes.mod.Inter
import typings.prettyProptypes.mod.Obj
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Component extends StObject {
    
    var component: js.UndefOr[Obj | Inter] = js.undefined
  }
  object Component {
    
    inline def apply(): Component = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Component]
    }
    
    extension [Self <: Component](x: Self) {
      
      inline def setComponent(value: Obj | Inter): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    }
  }
  
  /* Inlined std.Partial<pretty-proptypes.pretty-proptypes.Components> */
  trait PartialComponents extends StObject {
    
    var Button: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var Description: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var FunctionType: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var Indent: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var Outline: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var Required: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var StringType: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var Type: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var TypeMeta: js.UndefOr[ComponentType[Any]] = js.undefined
  }
  object PartialComponents {
    
    inline def apply(): PartialComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialComponents]
    }
    
    extension [Self <: PartialComponents](x: Self) {
      
      inline def setButton(value: ComponentType[Any]): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "Button", js.undefined)
      
      inline def setDescription(value: ComponentType[Any]): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setFunctionType(value: ComponentType[Any]): Self = StObject.set(x, "FunctionType", value.asInstanceOf[js.Any])
      
      inline def setFunctionTypeUndefined: Self = StObject.set(x, "FunctionType", js.undefined)
      
      inline def setIndent(value: ComponentType[Any]): Self = StObject.set(x, "Indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "Indent", js.undefined)
      
      inline def setOutline(value: ComponentType[Any]): Self = StObject.set(x, "Outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineUndefined: Self = StObject.set(x, "Outline", js.undefined)
      
      inline def setRequired(value: ComponentType[Any]): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "Required", js.undefined)
      
      inline def setStringType(value: ComponentType[Any]): Self = StObject.set(x, "StringType", value.asInstanceOf[js.Any])
      
      inline def setStringTypeUndefined: Self = StObject.set(x, "StringType", js.undefined)
      
      inline def setType(value: ComponentType[Any]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeMeta(value: ComponentType[Any]): Self = StObject.set(x, "TypeMeta", value.asInstanceOf[js.Any])
      
      inline def setTypeMetaUndefined: Self = StObject.set(x, "TypeMeta", js.undefined)
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}

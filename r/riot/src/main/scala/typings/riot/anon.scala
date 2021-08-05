package typings.riot

import typings.riotjsDomBindings.mod.AttributeExpressionData
import typings.riotjsDomBindings.mod.SlotBindingData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes[InitialProps] extends StObject {
    
    var attributes: js.UndefOr[js.Array[AttributeExpressionData]] = js.undefined
    
    var props: js.UndefOr[InitialProps] = js.undefined
    
    var slots: js.UndefOr[js.Array[SlotBindingData]] = js.undefined
  }
  object Attributes {
    
    inline def apply[InitialProps](): Attributes[InitialProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes[InitialProps]]
    }
    
    extension [Self <: Attributes[?], InitialProps](x: Self & Attributes[InitialProps]) {
      
      inline def setAttributes(value: js.Array[AttributeExpressionData]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: AttributeExpressionData*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      inline def setProps(value: InitialProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setSlots(value: js.Array[SlotBindingData]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setSlotsVarargs(value: SlotBindingData*): Self = StObject.set(x, "slots", js.Array(value :_*))
    }
  }
  
  trait ParentScope extends StObject {
    
    var attributes: js.Array[AttributeExpressionData]
    
    var parentScope: js.Any
    
    var slots: js.Array[SlotBindingData]
  }
  object ParentScope {
    
    inline def apply(
      attributes: js.Array[AttributeExpressionData],
      parentScope: js.Any,
      slots: js.Array[SlotBindingData]
    ): ParentScope = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], parentScope = parentScope.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParentScope]
    }
    
    extension [Self <: ParentScope](x: Self) {
      
      inline def setAttributes(value: js.Array[AttributeExpressionData]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: AttributeExpressionData*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      inline def setParentScope(value: js.Any): Self = StObject.set(x, "parentScope", value.asInstanceOf[js.Any])
      
      inline def setSlots(value: js.Array[SlotBindingData]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsVarargs(value: SlotBindingData*): Self = StObject.set(x, "slots", js.Array(value :_*))
    }
  }
}

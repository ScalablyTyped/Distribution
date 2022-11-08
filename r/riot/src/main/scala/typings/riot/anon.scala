package typings.riot

import typings.riotjsDomBindings.mod.AttributeExpressionData
import typings.riotjsDomBindings.mod.SlotBindingData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes[Context, InitialProps] extends StObject {
    
    var attributes: js.UndefOr[js.Array[AttributeExpressionData[Context]]] = js.undefined
    
    var props: js.UndefOr[InitialProps] = js.undefined
    
    var slots: js.UndefOr[js.Array[SlotBindingData[Context]]] = js.undefined
  }
  object Attributes {
    
    inline def apply[Context, InitialProps](): Attributes[Context, InitialProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes[Context, InitialProps]]
    }
    
    extension [Self <: Attributes[?, ?], Context, InitialProps](x: Self & (Attributes[Context, InitialProps])) {
      
      inline def setAttributes(value: js.Array[AttributeExpressionData[Context]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: AttributeExpressionData[Context]*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setProps(value: InitialProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setSlots(value: js.Array[SlotBindingData[Context]]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setSlotsVarargs(value: SlotBindingData[Context]*): Self = StObject.set(x, "slots", js.Array(value*))
    }
  }
  
  trait ParentScope extends StObject {
    
    var attributes: js.Array[AttributeExpressionData[Any]]
    
    var parentScope: Any
    
    var slots: js.Array[SlotBindingData[Any]]
  }
  object ParentScope {
    
    inline def apply(
      attributes: js.Array[AttributeExpressionData[Any]],
      parentScope: Any,
      slots: js.Array[SlotBindingData[Any]]
    ): ParentScope = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], parentScope = parentScope.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParentScope]
    }
    
    extension [Self <: ParentScope](x: Self) {
      
      inline def setAttributes(value: js.Array[AttributeExpressionData[Any]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: AttributeExpressionData[Any]*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setParentScope(value: Any): Self = StObject.set(x, "parentScope", value.asInstanceOf[js.Any])
      
      inline def setSlots(value: js.Array[SlotBindingData[Any]]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsVarargs(value: SlotBindingData[Any]*): Self = StObject.set(x, "slots", js.Array(value*))
    }
  }
}

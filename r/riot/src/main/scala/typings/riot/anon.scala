package typings.riot

import typings.riotjsDomBindings.mod.AttributeExpressionData
import typings.riotjsDomBindings.mod.SlotBindingData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attributes[InitialProps] extends StObject {
    
    var attributes: js.UndefOr[js.Array[AttributeExpressionData]] = js.native
    
    var props: js.UndefOr[InitialProps] = js.native
    
    var slots: js.UndefOr[js.Array[SlotBindingData]] = js.native
  }
  object Attributes {
    
    @scala.inline
    def apply[InitialProps](): Attributes[InitialProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes[InitialProps]]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes[_], InitialProps] (val x: Self with Attributes[InitialProps]) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[AttributeExpressionData]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: AttributeExpressionData*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setProps(value: InitialProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setSlots(value: js.Array[SlotBindingData]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      @scala.inline
      def setSlotsVarargs(value: SlotBindingData*): Self = StObject.set(x, "slots", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ParentScope extends StObject {
    
    var attributes: js.Array[AttributeExpressionData] = js.native
    
    var parentScope: js.Any = js.native
    
    var slots: js.Array[SlotBindingData] = js.native
  }
  object ParentScope {
    
    @scala.inline
    def apply(
      attributes: js.Array[AttributeExpressionData],
      parentScope: js.Any,
      slots: js.Array[SlotBindingData]
    ): ParentScope = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], parentScope = parentScope.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParentScope]
    }
    
    @scala.inline
    implicit class ParentScopeMutableBuilder[Self <: ParentScope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[AttributeExpressionData]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: AttributeExpressionData*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setParentScope(value: js.Any): Self = StObject.set(x, "parentScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlots(value: js.Array[SlotBindingData]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotsVarargs(value: SlotBindingData*): Self = StObject.set(x, "slots", js.Array(value :_*))
    }
  }
}

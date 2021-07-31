package typings.reactNativeWindows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[js.Any] = js.undefined
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait ItemIndex extends StObject {
    
    var itemIndex: Double
    
    var text: String
    
    var value: js.Any
  }
  object ItemIndex {
    
    @scala.inline
    def apply(itemIndex: Double, text: String, value: js.Any): ItemIndex = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemIndex]
    }
    
    @scala.inline
    implicit class ItemIndexMutableBuilder[Self <: ItemIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewDate extends StObject {
    
    var newDate: Double
  }
  object NewDate {
    
    @scala.inline
    def apply(newDate: Double): NewDate = {
      val __obj = js.Dynamic.literal(newDate = newDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewDate]
    }
    
    @scala.inline
    implicit class NewDateMutableBuilder[Self <: NewDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewDate(value: Double): Self = StObject.set(x, "newDate", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: Boolean
  }
  object Value {
    
    @scala.inline
    def apply(value: Boolean): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

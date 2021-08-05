package typings.reactNativeWindows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[js.Any] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait ItemIndex extends StObject {
    
    var itemIndex: Double
    
    var text: String
    
    var value: js.Any
  }
  object ItemIndex {
    
    inline def apply(itemIndex: Double, text: String, value: js.Any): ItemIndex = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemIndex]
    }
    
    extension [Self <: ItemIndex](x: Self) {
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewDate extends StObject {
    
    var newDate: Double
  }
  object NewDate {
    
    inline def apply(newDate: Double): NewDate = {
      val __obj = js.Dynamic.literal(newDate = newDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewDate]
    }
    
    extension [Self <: NewDate](x: Self) {
      
      inline def setNewDate(value: Double): Self = StObject.set(x, "newDate", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: Boolean
  }
  object Value {
    
    inline def apply(value: Boolean): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

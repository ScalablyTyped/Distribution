package typings.reactNativeCommunityPicker

import typings.reactNativeCommunityPicker.typingsPickerMod.ItemValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ItemIndex extends StObject {
    
    var itemIndex: Double
    
    var itemValue: ItemValue
  }
  object ItemIndex {
    
    inline def apply(itemIndex: Double, itemValue: ItemValue): ItemIndex = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemIndex] (val x: Self) extends AnyVal {
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setItemValue(value: ItemValue): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    }
  }
}

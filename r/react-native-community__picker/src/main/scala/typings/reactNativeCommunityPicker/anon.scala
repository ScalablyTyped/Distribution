package typings.reactNativeCommunityPicker

import typings.reactNativeCommunityPicker.pickerMod.ItemValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ItemIndex extends StObject {
    
    var itemIndex: Double = js.native
    
    var itemValue: ItemValue = js.native
  }
  object ItemIndex {
    
    @scala.inline
    def apply(itemIndex: Double, itemValue: ItemValue): ItemIndex = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemIndex]
    }
    
    @scala.inline
    implicit class ItemIndexMutableBuilder[Self <: ItemIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemValue(value: ItemValue): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    }
  }
}

package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var container: js.UndefOr[ViewStyle] = js.undefined
  
  var icon: js.UndefOr[ViewStyle] = js.undefined
  
  var item: js.UndefOr[ViewStyle] = js.undefined
  
  var label: js.UndefOr[TextStyle] = js.undefined
  
  var subheader: js.UndefOr[TextStyle] = js.undefined
  
  var value: js.UndefOr[TextStyle] = js.undefined
}
object Item {
  
  @scala.inline
  def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setIcon(value: ViewStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconNull: Self = StObject.set(x, "icon", null)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setItem(value: ViewStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNull: Self = StObject.set(x, "item", null)
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setLabel(value: TextStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSubheader(value: TextStyle): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubheaderNull: Self = StObject.set(x, "subheader", null)
    
    @scala.inline
    def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    
    @scala.inline
    def setValue(value: TextStyle): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

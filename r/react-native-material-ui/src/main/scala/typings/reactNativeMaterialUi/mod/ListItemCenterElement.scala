package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemCenterElement extends StObject {
  
  var primaryText: String | Element = js.native
  
  var secondaryText: js.UndefOr[String] = js.native
  
  var tertiaryText: js.UndefOr[String] = js.native
}
object ListItemCenterElement {
  
  @scala.inline
  def apply(primaryText: String | Element): ListItemCenterElement = {
    val __obj = js.Dynamic.literal(primaryText = primaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemCenterElement]
  }
  
  @scala.inline
  implicit class ListItemCenterElementMutableBuilder[Self <: ListItemCenterElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimaryText(value: String | Element): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
    
    @scala.inline
    def setTertiaryText(value: String): Self = StObject.set(x, "tertiaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTertiaryTextUndefined: Self = StObject.set(x, "tertiaryText", js.undefined)
  }
}

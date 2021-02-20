package typings.storybookUi.anon

import typings.storybookUi.menuMod.MenuList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsHighlighted extends StObject {
  
  var isHighlighted: Boolean = js.native
  
  var menu: MenuList = js.native
}
object IsHighlighted {
  
  @scala.inline
  def apply(isHighlighted: Boolean, menu: MenuList): IsHighlighted = {
    val __obj = js.Dynamic.literal(isHighlighted = isHighlighted.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHighlighted]
  }
  
  @scala.inline
  implicit class IsHighlightedMutableBuilder[Self <: IsHighlighted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: MenuList): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
  }
}

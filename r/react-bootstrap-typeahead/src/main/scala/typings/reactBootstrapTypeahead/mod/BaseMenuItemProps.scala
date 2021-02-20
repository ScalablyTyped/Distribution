package typings.reactBootstrapTypeahead.mod

import typings.react.mod.HTMLProps
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.li
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseMenuItemProps extends HTMLProps[li] {
  
  var active: js.UndefOr[Boolean] = js.native
}
object BaseMenuItemProps {
  
  @scala.inline
  def apply(): BaseMenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMenuItemProps]
  }
  
  @scala.inline
  implicit class BaseMenuItemPropsMutableBuilder[Self <: BaseMenuItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
  }
}

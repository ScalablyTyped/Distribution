package typings.reactMdMenu.typesTypesMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@react-md/icon.@react-md/icon.TextIconSpacingProps, 'icon' | 'iconAfter'> */
trait MenuButtonTextIconSpacingProps extends StObject {
  
  var icon: js.UndefOr[ReactElement | ReactNode] = js.undefined
  
  var iconAfter: js.UndefOr[Boolean] = js.undefined
}
object MenuButtonTextIconSpacingProps {
  
  inline def apply(): MenuButtonTextIconSpacingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuButtonTextIconSpacingProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuButtonTextIconSpacingProps] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: ReactElement | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
    
    inline def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}

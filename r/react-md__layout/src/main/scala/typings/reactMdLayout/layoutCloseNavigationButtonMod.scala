package typings.reactMdLayout

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.appBarActionMod.AppBarActionProps
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutCloseNavigationButtonMod {
  
  @JSImport("@react-md/layout/types/LayoutCloseNavigationButton", "LayoutCloseNavigationButton")
  @js.native
  val LayoutCloseNavigationButton: ForwardRefExoticComponent[LayoutCloseNavigationButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  trait LayoutCloseNavigationButtonProps
    extends StObject
       with AppBarActionProps {
    
    /**
      * Boolean if the button should be rendered. If this is omitted, it will only
      * be rendered for toggleable layouts.
      */
    var rendered: js.UndefOr[Boolean] = js.undefined
  }
  object LayoutCloseNavigationButtonProps {
    
    inline def apply(): LayoutCloseNavigationButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutCloseNavigationButtonProps]
    }
    
    extension [Self <: LayoutCloseNavigationButtonProps](x: Self) {
      
      inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    }
  }
}

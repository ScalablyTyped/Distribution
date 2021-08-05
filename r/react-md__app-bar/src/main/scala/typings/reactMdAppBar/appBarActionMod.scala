package typings.reactMdAppBar

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.useInheritContextMod.AppBarColorInherit
import typings.reactMdButton.buttonMod.ButtonProps
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarActionMod {
  
  @JSImport("@react-md/app-bar/types/AppBarAction", "AppBarAction")
  @js.native
  val AppBarAction: ForwardRefExoticComponent[AppBarActionProps & RefAttributes[HTMLButtonElement]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactMdAppBar.useActionClassNameMod.AppBarActionClassNameProps because var conflicts: className. Inlined first, last */ trait AppBarActionProps
    extends StObject
       with ButtonProps
       with AppBarColorInherit {
    
    /**
      * Boolean if this is the first action within the app bar. This is really just
      * used to automatically right-align all the actions by applying `margin-left:
      * auto` to this action.
      */
    var first: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if this is the last action within the app bar's row. This will just
      * apply the `$rmd-app-bar-lr-margin` as `margin-right`.
      *
      * NOTE: This should not be used when using an overflow menu.
      */
    var last: js.UndefOr[Boolean] = js.undefined
  }
  object AppBarActionProps {
    
    inline def apply(): AppBarActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarActionProps]
    }
    
    extension [Self <: AppBarActionProps](x: Self) {
      
      inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    }
  }
}

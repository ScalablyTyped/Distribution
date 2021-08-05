package typings.reactMdAppBar

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.useInheritContextMod.AppBarColorInherit
import typings.std.HTMLHeadingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarTitleMod {
  
  @JSImport("@react-md/app-bar/types/AppBarTitle", "AppBarTitle")
  @js.native
  val AppBarTitle: ForwardRefExoticComponent[AppBarTitleProps & RefAttributes[HTMLHeadingElement]] = js.native
  
  trait AppBarTitleProps
    extends StObject
       with HTMLAttributes[HTMLHeadingElement]
       with AppBarColorInherit {
    
    /**
      * Boolean if the title should be placed at the `$rmd-app-bar-title-keyline`.
      */
    var keyline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the title should not automatically try to wrap the content and
      * span two lines if it is too big. This will automatically add trailing
      * ellipsis for the text overflow as well.
      */
    var noWrap: js.UndefOr[Boolean] = js.undefined
  }
  object AppBarTitleProps {
    
    inline def apply(): AppBarTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarTitleProps]
    }
    
    extension [Self <: AppBarTitleProps](x: Self) {
      
      inline def setKeyline(value: Boolean): Self = StObject.set(x, "keyline", value.asInstanceOf[js.Any])
      
      inline def setKeylineUndefined: Self = StObject.set(x, "keyline", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    }
  }
}

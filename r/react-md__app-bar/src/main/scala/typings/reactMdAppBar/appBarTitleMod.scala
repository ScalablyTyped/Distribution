package typings.reactMdAppBar

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.useInheritContextMod.AppBarColorInherit
import typings.std.HTMLHeadingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarTitleMod {
  
  @JSImport("@react-md/app-bar/types/AppBarTitle", "AppBarTitle")
  @js.native
  val AppBarTitle: ForwardRefExoticComponent[AppBarTitleProps with RefAttributes[HTMLHeadingElement]] = js.native
  
  @js.native
  trait AppBarTitleProps
    extends HTMLAttributes[HTMLHeadingElement]
       with AppBarColorInherit {
    
    /**
      * Boolean if the title should be placed at the `$rmd-app-bar-title-keyline`.
      */
    var keyline: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the title should not automatically try to wrap the content and
      * span two lines if it is too big. This will automatically add trailing
      * ellipsis for the text overflow as well.
      */
    var noWrap: js.UndefOr[Boolean] = js.native
  }
  object AppBarTitleProps {
    
    @scala.inline
    def apply(): AppBarTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarTitleProps]
    }
    
    @scala.inline
    implicit class AppBarTitlePropsMutableBuilder[Self <: AppBarTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyline(value: Boolean): Self = StObject.set(x, "keyline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeylineUndefined: Self = StObject.set(x, "keyline", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    }
  }
}

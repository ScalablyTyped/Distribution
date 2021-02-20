package typings.reactMdAppBar

import typings.reactMdAppBar.useInheritContextMod.AppBarColorInherit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useActionClassNameMod {
  
  @JSImport("@react-md/app-bar/types/useActionClassName", "useActionClassName")
  @js.native
  def useActionClassName(): String = js.native
  @JSImport("@react-md/app-bar/types/useActionClassName", "useActionClassName")
  @js.native
  def useActionClassName(hasFirstLastInheritColorClassName: AppBarActionClassNameProps): String = js.native
  
  @js.native
  trait AppBarActionClassNameProps extends AppBarColorInherit {
    
    /**
      * An optional className to merge with the nav classes.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Boolean if this is the first action within the app bar. This is really just
      * used to automatically right-align all the actions by applying `margin-left:
      * auto` to this action.
      */
    var first: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if this is the last action within the app bar's row. This will just
      * apply the `$rmd-app-bar-lr-margin` as `margin-right`.
      *
      * NOTE: This should not be used when using an overflow menu.
      */
    var last: js.UndefOr[Boolean] = js.native
  }
  object AppBarActionClassNameProps {
    
    @scala.inline
    def apply(): AppBarActionClassNameProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarActionClassNameProps]
    }
    
    @scala.inline
    implicit class AppBarActionClassNamePropsMutableBuilder[Self <: AppBarActionClassNameProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    }
  }
}

package typings.reactMdAppBar

import typings.reactMdAppBar.typesUseInheritContextMod.AppBarColorInherit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseActionClassNameMod {
  
  @JSImport("@react-md/app-bar/types/useActionClassName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useActionClassName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useActionClassName")().asInstanceOf[String]
  inline def useActionClassName(param0: AppBarActionClassNameProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useActionClassName")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait AppBarActionClassNameProps
    extends StObject
       with AppBarColorInherit {
    
    /**
      * An optional className to merge with the nav classes.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if this is the first action within the app bar. This is really just
      * used to automatically right-align all the actions by applying
      * `margin-left: auto` to this action.
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
  object AppBarActionClassNameProps {
    
    inline def apply(): AppBarActionClassNameProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarActionClassNameProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppBarActionClassNameProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    }
  }
}

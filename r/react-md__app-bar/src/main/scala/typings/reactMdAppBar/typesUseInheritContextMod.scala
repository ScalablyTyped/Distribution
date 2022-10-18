package typings.reactMdAppBar

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseInheritContextMod {
  
  @JSImport("@react-md/app-bar/types/useInheritContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/app-bar/types/useInheritContext", "InheritContext")
  @js.native
  val InheritContext: Context[Boolean] = js.native
  
  @JSImport("@react-md/app-bar/types/useInheritContext", "ParentContext")
  @js.native
  val ParentContext: Context[Boolean] = js.native
  
  inline def useInheritContext(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useInheritContext")().asInstanceOf[Boolean]
  inline def useInheritContext(inheritColor: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useInheritContext")(inheritColor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useParentContext(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useParentContext")().asInstanceOf[Boolean]
  
  trait AppBarColorInherit extends StObject {
    
    /**
      * Boolean if this component should inherit the base color provided by the
      * `AppBar`.  When this value is omitted, this will be enabled when the theme
      * is not `"clear"` and not `"default"`
      */
    var inheritColor: js.UndefOr[Boolean] = js.undefined
  }
  object AppBarColorInherit {
    
    inline def apply(): AppBarColorInherit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarColorInherit]
    }
    
    extension [Self <: AppBarColorInherit](x: Self) {
      
      inline def setInheritColor(value: Boolean): Self = StObject.set(x, "inheritColor", value.asInstanceOf[js.Any])
      
      inline def setInheritColorUndefined: Self = StObject.set(x, "inheritColor", js.undefined)
    }
  }
}

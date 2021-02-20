package typings.reactMdAppBar

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useInheritContextMod {
  
  @JSImport("@react-md/app-bar/types/useInheritContext", "InheritContext")
  @js.native
  val InheritContext: Context[Boolean] = js.native
  
  @JSImport("@react-md/app-bar/types/useInheritContext", "ParentContext")
  @js.native
  val ParentContext: Context[Boolean] = js.native
  
  @JSImport("@react-md/app-bar/types/useInheritContext", "useInheritContext")
  @js.native
  def useInheritContext(): Boolean = js.native
  @JSImport("@react-md/app-bar/types/useInheritContext", "useInheritContext")
  @js.native
  def useInheritContext(inheritColor: Boolean): Boolean = js.native
  
  @JSImport("@react-md/app-bar/types/useInheritContext", "useParentContext")
  @js.native
  def useParentContext(): Boolean = js.native
  
  @js.native
  trait AppBarColorInherit extends StObject {
    
    /**
      * Boolean if this component should inherit the base color provided by the
      * `AppBar`.  When this value is omitted, this will be enabled when the theme
      * is not `"clear"` and not `"default"`
      */
    var inheritColor: js.UndefOr[Boolean] = js.native
  }
  object AppBarColorInherit {
    
    @scala.inline
    def apply(): AppBarColorInherit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarColorInherit]
    }
    
    @scala.inline
    implicit class AppBarColorInheritMutableBuilder[Self <: AppBarColorInherit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInheritColor(value: Boolean): Self = StObject.set(x, "inheritColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritColorUndefined: Self = StObject.set(x, "inheritColor", js.undefined)
    }
  }
}

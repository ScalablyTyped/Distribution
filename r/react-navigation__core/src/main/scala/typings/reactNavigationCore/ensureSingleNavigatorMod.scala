package typings.reactNavigationCore

import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNavigationCore.anon.Register
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ensureSingleNavigatorMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/EnsureSingleNavigator", JSImport.Default)
  @js.native
  def default(hasChildren: Props): Element = js.native
  
  @JSImport("@react-navigation/core/lib/typescript/src/EnsureSingleNavigator", "SingleNavigatorContext")
  @js.native
  val SingleNavigatorContext: Context[js.UndefOr[Register]] = js.native
  
  @js.native
  trait Props extends StObject {
    
    var children: ReactNode = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}

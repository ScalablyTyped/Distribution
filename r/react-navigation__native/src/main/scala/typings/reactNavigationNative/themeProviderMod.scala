package typings.reactNavigationNative

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNavigationNative.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeProviderMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/theming/ThemeProvider", JSImport.Default)
  @js.native
  def default(hasValueChildren: Props): Element = js.native
  
  @js.native
  trait Props extends StObject {
    
    var children: ReactNode = js.native
    
    var value: Theme = js.native
  }
  object Props {
    
    @scala.inline
    def apply(value: Theme): Props = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setValue(value: Theme): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

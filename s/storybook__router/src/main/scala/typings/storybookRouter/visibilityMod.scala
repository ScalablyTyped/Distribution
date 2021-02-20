package typings.storybookRouter

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibilityMod {
  
  @JSImport("@storybook/router/dist/visibility", "ToggleVisibility")
  @js.native
  def ToggleVisibility(hasHiddenChildren: Props): Element = js.native
  
  @js.native
  trait Props extends StObject {
    
    var children: ReactNode = js.native
    
    var hidden: Boolean = js.native
  }
  object Props {
    
    @scala.inline
    def apply(hidden: Boolean): Props = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    }
  }
}

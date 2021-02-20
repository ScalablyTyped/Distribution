package typings.reactNavigationStack

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maskedViewMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/MaskedView", JSImport.Default)
  @js.native
  def default(hasChildren: Props): ReactElement = js.native
  
  @js.native
  trait Props extends StObject {
    
    var children: ReactElement = js.native
    
    var maskElement: ReactElement = js.native
  }
  object Props {
    
    @scala.inline
    def apply(children: ReactElement, maskElement: ReactElement): Props = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], maskElement = maskElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskElement(value: ReactElement): Self = StObject.set(x, "maskElement", value.asInstanceOf[js.Any])
    }
  }
}

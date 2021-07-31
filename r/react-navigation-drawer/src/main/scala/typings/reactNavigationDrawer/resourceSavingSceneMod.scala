package typings.reactNavigationDrawer

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceSavingSceneMod {
  
  @JSImport("react-navigation-drawer/lib/typescript/src/views/ResourceSavingScene", JSImport.Default)
  @js.native
  class default () extends ResourceSavingScene
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var enabled: Boolean
    
    var isVisible: Boolean
    
    var style: js.UndefOr[js.Any] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(enabled: Boolean, isVisible: Boolean): Props = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait ResourceSavingScene
    extends Component[Props, js.Object, js.Any]
}

package typings.storybookAddonA11y

import org.scalablytyped.runtime.Shortcut
import typings.axeCore.mod.NodeResult
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightToggleMod extends Shortcut {
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/HighlightToggle", JSImport.Default)
  @js.native
  val default: FC[ToggleProps] = js.native
  
  @js.native
  trait ToggleProps extends StObject {
    
    var elementsToHighlight: js.Array[NodeResult] = js.native
    
    var toggleId: js.UndefOr[String] = js.native
  }
  object ToggleProps {
    
    @scala.inline
    def apply(elementsToHighlight: js.Array[NodeResult]): ToggleProps = {
      val __obj = js.Dynamic.literal(elementsToHighlight = elementsToHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleProps]
    }
    
    @scala.inline
    implicit class TogglePropsMutableBuilder[Self <: ToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElementsToHighlight(value: js.Array[NodeResult]): Self = StObject.set(x, "elementsToHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsToHighlightVarargs(value: NodeResult*): Self = StObject.set(x, "elementsToHighlight", js.Array(value :_*))
      
      @scala.inline
      def setToggleId(value: String): Self = StObject.set(x, "toggleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleIdUndefined: Self = StObject.set(x, "toggleId", js.undefined)
    }
  }
  
  type _To = FC[ToggleProps]
  
  /* This means you don't have to write `default`, but can instead just say `highlightToggleMod.foo` */
  override def _to: FC[ToggleProps] = default
}

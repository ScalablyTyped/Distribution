package typings.storybookAddonA11y

import org.scalablytyped.runtime.Shortcut
import typings.axeCore.mod.NodeResult
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsReportHighlightToggleMod extends Shortcut {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/HighlightToggle", JSImport.Default)
  @js.native
  val default: FC[ToggleProps] = js.native
  
  trait ToggleProps extends StObject {
    
    var elementsToHighlight: js.Array[NodeResult]
    
    var toggleId: js.UndefOr[String] = js.undefined
  }
  object ToggleProps {
    
    inline def apply(elementsToHighlight: js.Array[NodeResult]): ToggleProps = {
      val __obj = js.Dynamic.literal(elementsToHighlight = elementsToHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleProps] (val x: Self) extends AnyVal {
      
      inline def setElementsToHighlight(value: js.Array[NodeResult]): Self = StObject.set(x, "elementsToHighlight", value.asInstanceOf[js.Any])
      
      inline def setElementsToHighlightVarargs(value: NodeResult*): Self = StObject.set(x, "elementsToHighlight", js.Array(value*))
      
      inline def setToggleId(value: String): Self = StObject.set(x, "toggleId", value.asInstanceOf[js.Any])
      
      inline def setToggleIdUndefined: Self = StObject.set(x, "toggleId", js.undefined)
    }
  }
  
  type _To = FC[ToggleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTs3Dot9ComponentsReportHighlightToggleMod.foo` */
  override def _to: FC[ToggleProps] = default
}

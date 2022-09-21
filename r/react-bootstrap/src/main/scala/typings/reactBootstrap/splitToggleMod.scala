package typings.reactBootstrap

import typings.react.mod.Component
import typings.reactBootstrap.dropdownToggleMod.DropdownToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitToggleMod {
  
  @JSImport("react-bootstrap/lib/SplitToggle", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[SplitToggleProps, js.Object, Any]
  
  type SplitToggle = Component[SplitToggleProps, js.Object, Any]
  
  trait SplitToggleProps
    extends StObject
       with DropdownToggleProps
  object SplitToggleProps {
    
    inline def apply(): SplitToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitToggleProps]
    }
  }
}

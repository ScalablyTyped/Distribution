package typings.reactBootstrap

import typings.react.mod.Component
import typings.reactBootstrap.dropdownToggleMod.DropdownToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitToggleMod {
  
  @JSImport("react-bootstrap/lib/SplitToggle", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[SplitToggleProps, js.Object, js.Any]
  
  @js.native
  trait SplitToggle
    extends Component[SplitToggleProps, js.Object, js.Any]
  
  trait SplitToggleProps
    extends StObject
       with DropdownToggleProps
  object SplitToggleProps {
    
    @scala.inline
    def apply(): SplitToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitToggleProps]
    }
  }
}

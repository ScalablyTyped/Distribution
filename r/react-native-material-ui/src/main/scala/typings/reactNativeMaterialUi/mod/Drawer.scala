package typings.reactNativeMaterialUi.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-material-ui", "Drawer")
@js.native
class Drawer ()
  extends Component[DrawerProps, js.Any, js.Any]

@JSImport("react-native-material-ui", "Drawer")
@js.native
object Drawer extends js.Object {
  @js.native
  class Header ()
    extends Component[DrawerHeaderProps, js.Any, js.Any]
  
  @js.native
  class Section ()
    extends Component[DrawerSectionProps, js.Any, js.Any]
  
  @js.native
  object Header extends js.Object {
    @js.native
    class Account ()
      extends Component[DrawerHeaderAccountProps, js.Any, js.Any]
    
  }
  
}


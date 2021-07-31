package typings.reactNativeMaterialUi.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-material-ui", "Drawer")
@js.native
class Drawer protected ()
  extends Component[DrawerProps, js.Any, js.Any] {
  def this(props: DrawerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: DrawerProps, context: js.Any) = this()
}
object Drawer {
  
  @JSImport("react-native-material-ui", "Drawer.Header")
  @js.native
  class Header protected ()
    extends Component[DrawerHeaderProps, js.Any, js.Any] {
    def this(props: DrawerHeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DrawerHeaderProps, context: js.Any) = this()
  }
  object Header {
    
    @JSImport("react-native-material-ui", "Drawer.Header.Account")
    @js.native
    class Account protected ()
      extends Component[DrawerHeaderAccountProps, js.Any, js.Any] {
      def this(props: DrawerHeaderAccountProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: DrawerHeaderAccountProps, context: js.Any) = this()
    }
  }
  
  @JSImport("react-native-material-ui", "Drawer.Section")
  @js.native
  class Section protected ()
    extends Component[DrawerSectionProps, js.Any, js.Any] {
    def this(props: DrawerSectionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DrawerSectionProps, context: js.Any) = this()
  }
}

package typings.reactNativeMaterialUi.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-material-ui", "Drawer")
@js.native
open class Drawer protected () extends Component[DrawerProps, Any, Any] {
  def this(props: DrawerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: DrawerProps, context: Any) = this()
}
object Drawer {
  
  @JSImport("react-native-material-ui", "Drawer.Header")
  @js.native
  open class Header protected () extends Component[DrawerHeaderProps, Any, Any] {
    def this(props: DrawerHeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DrawerHeaderProps, context: Any) = this()
  }
  object Header {
    
    @JSImport("react-native-material-ui", "Drawer.Header.Account")
    @js.native
    open class Account protected () extends Component[DrawerHeaderAccountProps, Any, Any] {
      def this(props: DrawerHeaderAccountProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: DrawerHeaderAccountProps, context: Any) = this()
    }
  }
  
  @JSImport("react-native-material-ui", "Drawer.Section")
  @js.native
  open class Section protected () extends Component[DrawerSectionProps, Any, Any] {
    def this(props: DrawerSectionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DrawerSectionProps, context: Any) = this()
  }
}

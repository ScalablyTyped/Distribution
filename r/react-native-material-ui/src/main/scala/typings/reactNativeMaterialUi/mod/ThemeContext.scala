package typings.reactNativeMaterialUi.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeContext {
  
  @JSImport("react-native-material-ui", "ThemeContext.Consumer")
  @js.native
  open class Consumer protected ()
    extends Component[ThemeConsumerProps, js.Object, Any] {
    def this(props: ThemeConsumerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ThemeConsumerProps, context: Any) = this()
  }
  
  @JSImport("react-native-material-ui", "ThemeContext.Provider")
  @js.native
  open class Provider protected ()
    extends Component[ThemeProviderProps, js.Object, Any] {
    def this(props: ThemeProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ThemeProviderProps, context: Any) = this()
  }
}

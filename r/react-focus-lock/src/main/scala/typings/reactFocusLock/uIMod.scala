package typings.reactFocusLock

import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.RefObject
import typings.reactFocusLock.anon.ReactFocusLockPropsReactN
import typings.reactFocusLock.interfacesMod.AutoFocusProps
import typings.reactFocusLock.interfacesMod.FreeFocusProps
import typings.reactFocusLock.interfacesMod.InFocusGuardProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uIMod {
  
  @JSImport("react-focus-lock/UI/UI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Traps Focus inside a Lock
    */
  @JSImport("react-focus-lock/UI/UI", JSImport.Default)
  @js.native
  val default: FC[ReactFocusLockPropsReactN] = js.native
  
  @JSImport("react-focus-lock/UI/UI", "AutoFocusInside")
  @js.native
  open class AutoFocusInside protected ()
    extends Component[AutoFocusProps, js.Object, Any] {
    def this(props: AutoFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoFocusProps, context: Any) = this()
  }
  
  @JSImport("react-focus-lock/UI/UI", "FreeFocusInside")
  @js.native
  open class FreeFocusInside protected ()
    extends Component[FreeFocusProps, js.Object, Any] {
    def this(props: FreeFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FreeFocusProps, context: Any) = this()
  }
  
  @JSImport("react-focus-lock/UI/UI", "InFocusGuard")
  @js.native
  open class InFocusGuard protected ()
    extends Component[InFocusGuardProps, js.Object, Any] {
    def this(props: InFocusGuardProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InFocusGuardProps, context: Any) = this()
  }
  
  @JSImport("react-focus-lock/UI/UI", "MoveFocusInside")
  @js.native
  open class MoveFocusInside protected ()
    extends Component[AutoFocusProps, js.Object, Any] {
    def this(props: AutoFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoFocusProps, context: Any) = this()
  }
  
  inline def useFocusInside(node: RefObject[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusInside")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

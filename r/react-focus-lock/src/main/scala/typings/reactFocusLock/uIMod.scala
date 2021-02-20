package typings.reactFocusLock

import org.scalablytyped.runtime.Shortcut
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uIMod extends Shortcut {
  
  /**
    * Traps Focus inside a Lock
    */
  @JSImport("react-focus-lock/UI/UI", JSImport.Default)
  @js.native
  val default: FC[ReactFocusLockPropsReactN] = js.native
  
  @JSImport("react-focus-lock/UI/UI", "AutoFocusInside")
  @js.native
  class AutoFocusInside protected ()
    extends Component[AutoFocusProps, js.Object, js.Any] {
    def this(props: AutoFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoFocusProps, context: js.Any) = this()
  }
  
  @JSImport("react-focus-lock/UI/UI", "FreeFocusInside")
  @js.native
  class FreeFocusInside protected ()
    extends Component[FreeFocusProps, js.Object, js.Any] {
    def this(props: FreeFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FreeFocusProps, context: js.Any) = this()
  }
  
  @JSImport("react-focus-lock/UI/UI", "InFocusGuard")
  @js.native
  class InFocusGuard protected ()
    extends Component[InFocusGuardProps, js.Object, js.Any] {
    def this(props: InFocusGuardProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InFocusGuardProps, context: js.Any) = this()
  }
  
  @JSImport("react-focus-lock/UI/UI", "MoveFocusInside")
  @js.native
  class MoveFocusInside protected ()
    extends Component[AutoFocusProps, js.Object, js.Any] {
    def this(props: AutoFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoFocusProps, context: js.Any) = this()
  }
  
  @JSImport("react-focus-lock/UI/UI", "useFocusInside")
  @js.native
  def useFocusInside(node: RefObject[HTMLElement]): Unit = js.native
  
  type _To = FC[ReactFocusLockPropsReactN]
  
  /* This means you don't have to write `default`, but can instead just say `uIMod.foo` */
  override def _to: FC[ReactFocusLockPropsReactN] = default
}

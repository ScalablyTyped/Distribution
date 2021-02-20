package typings.reactFocusLock

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.reactFocusLock.interfacesMod.AutoFocusProps
import typings.reactFocusLock.interfacesMod.FreeFocusProps
import typings.reactFocusLock.interfacesMod.InFocusGuardProps
import typings.reactFocusLock.interfacesMod.ReactFocusLockProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Traps Focus inside a Lock
    */
  @JSImport("react-focus-lock", JSImport.Default)
  @js.native
  val default: FC[ReactFocusLockProps[ReactNode, Record[String, js.Any]]] = js.native
  
  @JSImport("react-focus-lock", "AutoFocusInside")
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
  
  @JSImport("react-focus-lock", "FreeFocusInside")
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
  
  @JSImport("react-focus-lock", "InFocusGuard")
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
  
  @JSImport("react-focus-lock", "MoveFocusInside")
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
  
  type _To = FC[ReactFocusLockProps[ReactNode, Record[String, js.Any]]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[ReactFocusLockProps[ReactNode, Record[String, js.Any]]] = default
}

package typings.reactFocusLock

import typings.react.mod.Component
import typings.react.mod.FC
import typings.reactFocusLock.interfacesMod.AutoFocusProps
import typings.reactFocusLock.interfacesMod.FreeFocusProps
import typings.reactFocusLock.interfacesMod.InFocusGuardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-focus-lock/UI/UI", JSImport.Namespace)
@js.native
object uIMod extends js.Object {
  @js.native
  class AutoFocusInside ()
    extends Component[AutoFocusProps, js.Object, js.Any]
  
  @js.native
  class FreeFocusInside ()
    extends Component[FreeFocusProps, js.Object, js.Any]
  
  @js.native
  class InFocusGuard ()
    extends Component[InFocusGuardProps, js.Object, js.Any]
  
  @js.native
  class MoveFocusInside ()
    extends Component[AutoFocusProps, js.Object, js.Any]
  
  /**
    * Traps Focus inside a Lock
    */
  val default: FC[ReactFocusLockPropsReactN] = js.native
}


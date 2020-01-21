package typings.reactFocusLock

import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.reactFocusLock.interfacesMod.AutoFocusProps
import typings.reactFocusLock.interfacesMod.FreeFocusProps
import typings.reactFocusLock.interfacesMod.InFocusGuardProps
import typings.reactFocusLock.interfacesMod.ReactFocusLockProps
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-focus-lock", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  val default: FC[ReactFocusLockProps[ReactNode, Record[String, js.Any]]] = js.native
}


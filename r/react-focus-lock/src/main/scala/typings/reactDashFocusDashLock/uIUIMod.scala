package typings.reactDashFocusDashLock

import typings.react.reactMod.Component
import typings.react.reactMod.FC
import typings.react.reactMod.ReactNode
import typings.reactDashFocusDashLock.interfacesMod.AutoFocusProps
import typings.reactDashFocusDashLock.interfacesMod.FreeFocusProps
import typings.reactDashFocusDashLock.interfacesMod.InFocusGuardProps
import typings.reactDashFocusDashLock.interfacesMod.ReactFocusLockProps
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-focus-lock/UI/UI", JSImport.Namespace)
@js.native
object uIUIMod extends js.Object {
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
  val default: FC[(ReactFocusLockProps[ReactNode, Record[String, _]]) with Anon_SideCar] = js.native
}


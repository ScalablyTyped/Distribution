package typings.reactDashDnd

import typings.react.reactMod.FC
import typings.reactDashDnd.libCommonDndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DndProvider", JSImport.Namespace)
@js.native
object libCommonDndProviderMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashDnd.Anon_Manager
    - typings.reactDashDnd.Anon_Backend[BackendContext, BackendOptions]
  */
  trait DndProviderProps[BackendContext, BackendOptions] extends js.Object
  
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
}


package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/cjs/hooks/useDrag", JSImport.Namespace)
@js.native
object libCjsHooksUseDragMod extends js.Object {
  def useDrag[DragObject /* <: reactDashDndLib.libCjsInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DragSourceHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple2[CollectedProps, reactLib.reactMod.ReactNs.RefObject[_]] = js.native
}


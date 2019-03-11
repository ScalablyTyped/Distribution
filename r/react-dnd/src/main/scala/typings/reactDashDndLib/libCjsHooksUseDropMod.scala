package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/cjs/hooks/useDrop", JSImport.Namespace)
@js.native
object libCjsHooksUseDropMod extends js.Object {
  def useDrop[DragObject, DropResult, CollectedProps](
    spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DropTargetHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple2[CollectedProps, reactLib.reactMod.ReactNs.RefObject[_]] = js.native
}


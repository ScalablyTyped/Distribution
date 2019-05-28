package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Spec extends js.Object {
  def apply[DragObject /* <: reactDashDndLib.libCjsInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DragSourceHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple3[
    CollectedProps, 
    reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragSource, 
    reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragPreview
  ] = js.native
}


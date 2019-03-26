package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/cjs/DragSource", JSImport.Namespace)
@js.native
object libCjsDragSourceMod extends js.Object {
  def default[RequiredProps, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def default[RequiredProps, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def default[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def default[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
}


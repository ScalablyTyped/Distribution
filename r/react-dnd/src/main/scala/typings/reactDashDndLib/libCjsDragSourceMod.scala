package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/cjs/DragSource", JSImport.Namespace)
@js.native
object libCjsDragSourceMod extends js.Object {
  def default[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
}


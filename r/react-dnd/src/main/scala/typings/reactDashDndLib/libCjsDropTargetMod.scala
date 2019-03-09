package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/cjs/DropTarget", JSImport.Namespace)
@js.native
object libCjsDropTargetMod extends js.Object {
  def default[Props, CollectedProps](
    `type`: dndDashCoreLib.libCjsInterfacesMod.TargetType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps](
    `type`: dndDashCoreLib.libCjsInterfacesMod.TargetType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.TargetType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.TargetType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
}


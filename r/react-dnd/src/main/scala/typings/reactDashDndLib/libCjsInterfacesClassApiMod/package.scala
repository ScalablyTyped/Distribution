package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCjsInterfacesClassApiMod {
  type ConnectDragPreview = DragElementWrapper[reactDashDndLib.libCjsInterfacesOptionsMod.DragPreviewOptions]
  type ConnectDragSource = DragElementWrapper[reactDashDndLib.libCjsInterfacesOptionsMod.DragSourceOptions]
  type ConnectDropTarget = DragElementWrapper[js.Any]
  type ConnectableElement = reactLib.reactMod.ReactNs.RefObject[js.Any] | reactLib.reactMod.ReactNs.ReactElement[js.Any] | stdLib.Element | scala.Null
  type DndComponentClass[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */, P] = (reactLib.reactMod.ReactNs.ComponentClass[
    reactLib.reactMod.Global.JSXNs.LibraryManagedAttributes[C, P], 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with (hoistDashNonDashReactDashStaticsLib.hoistDashNonDashReactDashStaticsMod.hoistNonReactStaticsNs.NonReactStatics[C, js.Object]) with reactDashDndLib.Anon_DecoratedComponent[C]
  type DndComponentEnhancer[CollectedProps] = js.Function1[
    /* component */ js.Any, 
    DndComponentClass[js.Any, Omit[GetProps[js.Any], java.lang.String]]
  ]
  type DragElementWrapper[Options] = js.Function2[
    /* elementOrNode */ ConnectableElement, 
    /* options */ js.UndefOr[Options], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any] | scala.Null
  ]
  type DragLayerCollector[TargetProps, CollectedProps] = js.Function2[
    /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragLayerMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type DragSourceCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ DragSourceConnector, 
    /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type DropTargetCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ DropTargetConnector, 
    /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DropTargetMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: DecorationTargetProps[P] | InjectedProps[P]}
    */ reactDashDndLib.reactDashDndLibStrings.Matching with js.Any
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? DecorationTargetProps[P]}
    */ reactDashDndLib.reactDashDndLibStrings.Shared with DecorationTargetProps
}

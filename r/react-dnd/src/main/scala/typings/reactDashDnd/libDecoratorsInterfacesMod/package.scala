package typings.reactDashDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDecoratorsInterfacesMod {
  import typings.hoistDashNonDashReactDashStatics.hoistDashNonDashReactDashStaticsMod.NonReactStatics
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod._Global_.JSX.LibraryManagedAttributes
  import typings.reactDashDnd.Anon_DecoratedComponent
  import typings.reactDashDnd.libInterfacesMonitorsMod.DragLayerMonitor
  import typings.reactDashDnd.libInterfacesMonitorsMod.DragSourceMonitor
  import typings.reactDashDnd.libInterfacesMonitorsMod.DropTargetMonitor
  import typings.std.Exclude
  import typings.std.Pick

  type DndComponentClass[C /* <: ComponentType[_] */, P] = (ComponentClass[LibraryManagedAttributes[C, P], ComponentState]) with (NonReactStatics[C, js.Object]) with Anon_DecoratedComponent[C]
  type DndComponentEnhancer[CollectedProps] = js.Function1[/* component */ js.Any, DndComponentClass[js.Any, Omit[GetProps[js.Any], String]]]
  type DragLayerCollector[TargetProps, CollectedProps] = js.Function2[/* monitor */ DragLayerMonitor, /* props */ TargetProps, CollectedProps]
  type DragSourceCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ DragSourceConnector, 
    /* monitor */ DragSourceMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type DropTargetCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ DropTargetConnector, 
    /* monitor */ DropTargetMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.reactDashDnd.reactDashDndStrings.Matching with js.Any
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.reactDashDnd.reactDashDndStrings.Shared with js.Any
}

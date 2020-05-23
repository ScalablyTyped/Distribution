package typings.reactDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type DndComponentClass[C /* <: typings.react.mod.ComponentType[_] */, P] = (typings.react.mod.ComponentClass[
    typings.react.mod.global.JSX.LibraryManagedAttributes[C, P], 
    typings.react.mod.ComponentState
  ]) with (typings.hoistNonReactStatics.mod.NonReactStatics[C, js.Object]) with typings.reactDnd.anon.DecoratedComponent[C]
  type DndComponentEnhancer[CollectedProps] = js.Function1[
    /* component */ js.Any, 
    typings.reactDnd.interfacesMod.DndComponentClass[
      js.Any, 
      typings.reactDnd.interfacesMod.Omit[
        typings.reactDnd.interfacesMod.GetProps[js.Any], 
        /* keyof react-dnd.react-dnd/lib/decorators/interfaces.Shared<CollectedProps, react-dnd.react-dnd/lib/decorators/interfaces.GetProps<any>> */ java.lang.String
      ]
    ]
  ]
  type DragLayerCollector[TargetProps, CollectedProps] = js.Function2[
    /* monitor */ typings.reactDnd.monitorsMod.DragLayerMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type DragSourceCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ typings.reactDnd.interfacesMod.DragSourceConnector, 
    /* monitor */ typings.reactDnd.monitorsMod.DragSourceMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type DropTargetCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ typings.reactDnd.interfacesMod.DropTargetConnector, 
    /* monitor */ typings.reactDnd.monitorsMod.DropTargetMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.reactDnd.reactDndStrings.Matching with org.scalablytyped.runtime.TopLevel[js.Any]
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.reactDnd.reactDndStrings.Shared with org.scalablytyped.runtime.TopLevel[js.Any]
}

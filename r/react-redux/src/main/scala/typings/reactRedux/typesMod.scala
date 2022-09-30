package typings.reactRedux

import org.scalablytyped.runtime.TopLevel
import typings.hoistNonReactStatics.mod.NonReactStatics
import typings.react.mod.ClassAttributes
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactRedux.anon.WrappedComponent
import typings.reactRedux.connectMod.ConnectProps
import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import typings.std.InstanceType
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[/* component */ ComponentType[TProps], ComponentType[TOwnProps]]
  
  type AnyIfEmpty[T /* <: js.Object */] = T
  
  type ConnectedComponent[C /* <: ComponentType[Any] */, P] = ComponentType[P] & (NonReactStatics[C, js.Object]) & WrappedComponent[C]
  
  trait DispatchProp[A /* <: Action[Any] */] extends StObject {
    
    var dispatch: Dispatch[A]
  }
  object DispatchProp {
    
    inline def apply[A /* <: Action[Any] */](dispatch: A => A): DispatchProp[A] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
      __obj.asInstanceOf[DispatchProp[A]]
    }
    
    extension [Self <: DispatchProp[?], A /* <: Action[Any] */](x: Self & DispatchProp[A]) {
      
      inline def setDispatch(value: A => A): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    }
  }
  
  type DistributiveOmit[T, K /* <: /* keyof T */ String */] = Omit[T, K]
  
  type EqualityFn[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
  
  type FixTypeLater = Any
  
  type GetLibraryManagedProps[C] = LibraryManagedAttributes[C, GetProps[C]]
  
  type GetProps[C] = ClassAttributes[InstanceType[C]] & Any
  
  type HandleThunkActionCreator[TActionCreator] = TActionCreator | InferThunkActionCreatorType[TActionCreator]
  
  type InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ Any, Any] */] = TActionCreator | (js.Function1[/* args */ Any, Any])
  
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ Any, 
    ConnectedComponent[
      Any, 
      (DistributiveOmit[
        GetLibraryManagedProps[Any], 
        /* keyof react-redux.react-redux/es/types.Shared<TInjectedProps, react-redux.react-redux/es/types.GetLibraryManagedProps<any>> */ String
      ]) & TNeedsProps & ConnectProps
    ]
  ]
  
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.reactRedux.reactReduxStrings.Matching & TopLevel[Any]
  
  type ResolveThunks[TDispatchProps] = TDispatchProps | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ C in keyof TDispatchProps ]: react-redux.react-redux/es/types.HandleThunkActionCreator<TDispatchProps[C]>}
    */ typings.reactRedux.reactReduxStrings.ResolveThunks & TopLevel[TDispatchProps])
  
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.reactRedux.reactReduxStrings.Shared & TopLevel[Any]
  
  type TypedUseSelectorHook[TState] = js.Function2[
    /* selector */ js.Function1[/* state */ TState, Any], 
    /* equalityFn */ js.UndefOr[EqualityFn[Any]], 
    Any
  ]
}

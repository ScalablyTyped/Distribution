package typings
package reactDashReduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashReduxMod {
  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[TProps], 
    reactLib.reactMod.ReactNs.ComponentClass[TOwnProps, reactLib.reactMod.ReactNs.ComponentState]
  ]
  type ConnectedComponentClass[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */, P] = (reactLib.reactMod.ReactNs.ComponentClass[
    reactLib.reactMod.Global.JSXNs.LibraryManagedAttributes[C, P], 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with (hoistDashNonDashReactDashStaticsLib.hoistDashNonDashReactDashStaticsMod.hoistNonReactStaticsNs.NonReactStatics[C, js.Object]) with reactDashReduxLib.Anon_WrappedComponent[C]
  type GetProps[C] = js.Any
  type HandleThunkActionCreator[TActionCreator] = TActionCreator | InferThunkActionCreatorType[TActionCreator]
  type InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ js.Any, _] */] = TActionCreator | (js.Function1[/* args */ js.Any, js.Any])
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ js.Any, 
    ConnectedComponentClass[js.Any, (Omit[GetProps[_], java.lang.String]) with TNeedsProps]
  ]
  type MapDispatchToProps[TDispatchProps, TOwnProps] = (MapDispatchToPropsFunction[TDispatchProps, TOwnProps]) | TDispatchProps
  type MapDispatchToPropsFactory[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    MapDispatchToPropsFunction[TDispatchProps, TOwnProps]
  ]
  type MapDispatchToPropsFunction[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    TDispatchProps
  ]
  type MapDispatchToPropsNonObject[TDispatchProps, TOwnProps] = (MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (MapDispatchToPropsFunction[TDispatchProps, TOwnProps])
  type MapDispatchToPropsParam[TDispatchProps, TOwnProps] = (MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (MapDispatchToProps[TDispatchProps, TOwnProps])
  type MapStateToProps[TStateProps, TOwnProps, State] = js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]
  type MapStateToPropsFactory[TStateProps, TOwnProps, State] = js.Function2[
    /* initialState */ State, 
    /* ownProps */ TOwnProps, 
    MapStateToProps[TStateProps, TOwnProps, State]
  ]
  type MapStateToPropsParam[TStateProps, TOwnProps, State] = js.UndefOr[
    (MapStateToPropsFactory[TStateProps, TOwnProps, State]) | (MapStateToProps[TStateProps, TOwnProps, State]) | scala.Null
  ]
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: DecorationTargetProps[P] | InjectedProps[P]}
    */ reactDashReduxLib.reactDashReduxLibStrings.Matching with js.Any
  type MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function3[
    /* stateProps */ TStateProps, 
    /* dispatchProps */ TDispatchProps, 
    /* ownProps */ TOwnProps, 
    TMergedProps
  ]
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type ResolveThunks[TDispatchProps] = TDispatchProps | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ C in keyof TDispatchProps ]: react-redux.react-redux.HandleThunkActionCreator<TDispatchProps[C]>}
    */ reactDashReduxLib.reactDashReduxLibStrings.ResolveThunks with TDispatchProps)
  type Selector[S, TProps, TOwnProps] = (js.Function2[/* state */ S, /* ownProps */ TOwnProps, TProps]) | (js.Function1[/* state */ S, TProps])
  type SelectorFactory[S, TProps, TOwnProps, TFactoryOptions] = js.Function2[
    /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.Action[js.Any]], 
    /* factoryOptions */ TFactoryOptions, 
    Selector[S, TProps, TOwnProps]
  ]
  type Shared[InjectedProps, DecorationTargetProps /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias react-redux.react-redux.Shared<InjectedProps, DecorationTargetProps> */ js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? DecorationTargetProps[P]}
    */ reactDashReduxLib.reactDashReduxLibStrings.Shared with DecorationTargetProps
}

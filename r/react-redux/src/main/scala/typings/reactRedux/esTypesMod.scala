package typings.reactRedux

import typings.hoistNonReactStatics.mod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactRedux.anon.WrappedComponent
import typings.reactRedux.esComponentsConnectMod.ConnectProps
import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypesMod {
  
  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[/* component */ ComponentType[TProps], ComponentType[TOwnProps]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    keyof T extends never ? any : T
    }}}
    */
  @js.native
  trait AnyIfEmpty[T /* <: js.Object */] extends StObject
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends unknown ? std.Omit<T, K> : never
    }}}
    */
  @js.native
  trait DistributiveOmit[T, K /* <: /* keyof T */ String */] extends StObject
  
  type EqualityFn[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
  
  type FixTypeLater = Any
  
  type GetLibraryManagedProps[C] = LibraryManagedAttributes[C, GetProps[C]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    C extends react.react.ComponentType<infer P> ? C extends react.react.ComponentClass<P, react.react.ComponentState> ? react.react.ClassAttributes<std.InstanceType<C>> & P : P : never
    }}}
    */
  @js.native
  trait GetProps[C] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TActionCreator extends (args : ...any): any ? react-redux.react-redux/es/types.InferThunkActionCreatorType<TActionCreator> : TActionCreator
    }}}
    */
  @js.native
  trait HandleThunkActionCreator[TActionCreator] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TActionCreator extends (args : infer TParams): (args : ...any): infer TReturn ? (args : TParams): TReturn : TActionCreator
    }}}
    */
  @js.native
  trait InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject
  
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
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    }}}
    */
  @js.native
  trait Matching[InjectedProps, DecorationTargetProps] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TDispatchProps extends {[key: string] : any} ? {[ C in keyof TDispatchProps ]: react-redux.react-redux/es/types.HandleThunkActionCreator<TDispatchProps[C]>} : TDispatchProps
    }}}
    */
  @js.native
  trait ResolveThunks[TDispatchProps] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    }}}
    */
  @js.native
  trait Shared[InjectedProps, DecorationTargetProps] extends StObject
  
  type TypedUseSelectorHook[TState] = js.Function2[
    /* selector */ js.Function1[/* state */ TState, Any], 
    /* equalityFn */ js.UndefOr[EqualityFn[Any]], 
    Any
  ]
}

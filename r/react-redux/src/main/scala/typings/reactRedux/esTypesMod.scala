package typings.reactRedux

import typings.hoistNonReactStatics.mod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactRedux.anon.WrappedComponent
import typings.reactRedux.esComponentsConnectMod.ConnectProps
import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypesMod {
  
  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[/* component */ ComponentType[TProps], ComponentType[TOwnProps]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    keyof T extends never ? any : T
    }}}
    */
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends unknown ? std.Omit<T, K> : never
    }}}
    */
  type DistributiveOmit[T, K /* <: /* keyof T */ String */] = Omit[T, K]
  
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
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TActionCreator extends (args : ...any): any ? react-redux.react-redux/es/types.InferThunkActionCreatorType<TActionCreator> : TActionCreator
    }}}
    */
  type HandleThunkActionCreator[TActionCreator] = TActionCreator
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TActionCreator extends (args : infer TParams): (args : ...any): infer TReturn ? (args : TParams): TReturn : TActionCreator
    }}}
    */
  type InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ Any, Any] */] = TActionCreator
  
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
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TDispatchProps extends {[key: string] : any} ? {[ C in keyof TDispatchProps ]: react-redux.react-redux/es/types.HandleThunkActionCreator<TDispatchProps[C]>} : TDispatchProps
    }}}
    */
  type ResolveThunks[TDispatchProps] = TDispatchProps
  
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

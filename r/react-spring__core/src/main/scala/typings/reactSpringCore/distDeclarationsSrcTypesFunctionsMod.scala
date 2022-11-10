package typings.reactSpringCore

import typings.reactSpringCore.anon.`3`
import typings.reactSpringCore.anon.`4`
import typings.reactSpringCore.anon.`5`
import typings.reactSpringCore.anon.`6`
import typings.reactSpringCore.distDeclarationsSrcControllerMod.Controller
import typings.reactSpringCore.distDeclarationsSrcControllerMod.ControllerQueue
import typings.reactSpringCore.distDeclarationsSrcSpringValueMod.SpringValue
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.InferProps
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.InferState
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.Readable
import typings.reactSpringCore.distDeclarationsSrcTypesObjectsMod.AnimationResult
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.ControllerProps
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.InlineToProps
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.SpringProps
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.SpringTo
import typings.reactSpringTypes.utilMod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesFunctionsMod {
  
  @js.native
  trait AnyUpdateFn[T /* <: SpringValue[Any] | Controller[Any] */, Props /* <: js.Object */, State] extends StObject {
    
    def apply(to: (`3`[T] & Props & `4`[State]) | SpringTo[State]): js.Promise[AnimationResult[T]] = js.native
    def apply(to: SpringTo[State], props: Props): js.Promise[AnimationResult[T]] = js.native
  }
  
  type ControllerFlushFn[T /* <: Controller[Any] */] = js.Function2[
    /* ctrl */ T, 
    /* queue */ ControllerQueue[InferState[T]], 
    js.Promise[AnimationResult[T]]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Item extends undefined ? (result : @react-spring/core.@react-spring/core/dist/declarations/src/types/objects.AnimationResult<TResult>, ctrl : TSource, item : Item | undefined): void : (result : @react-spring/core.@react-spring/core/dist/declarations/src/types/objects.AnimationResult<TResult>, ctrl : TSource, item : Item): void
    }}}
    */
  type EventHandler[TResult /* <: Readable[Any] */, TSource, Item] = js.Function3[
    /* result */ AnimationResult[TResult], 
    /* ctrl */ TSource, 
    /* item */ js.UndefOr[Item], 
    Unit
  ]
  
  type OnChange[TResult /* <: Readable[Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]
  
  type OnPause[TResult /* <: Readable[Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]
  
  type OnProps[T] = js.Function2[/* props */ SpringProps[T], /* spring */ SpringValue[T], Unit]
  
  type OnResolve[TResult /* <: Readable[Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]
  
  type OnRest[TResult /* <: Readable[Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]
  
  type OnResume[TResult /* <: Readable[Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]
  
  type OnStart[TResult /* <: Readable[Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]
  
  type SpringToFn[T] = js.Function2[/* start */ StartFn[T], /* stop */ StopFn[T], js.Promise[Any] | Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends @react-spring/core.@react-spring/core/dist/declarations/src/types/common.IsPlainObject<T> ? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.UpdateValuesFn<T> : @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.UpdateValueFn<T>
    }}}
    */
  type SpringUpdateFn[T] = UpdateValuesFn[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    @react-spring/core.@react-spring/core/dist/declarations/src/types/internal.InferTarget<T> extends {  start :infer T} ? T : never
    }}}
    */
  @js.native
  trait StartFn[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    @react-spring/core.@react-spring/core/dist/declarations/src/types/internal.InferTarget<T> extends {  stop :infer T} ? T : never
    }}}
    */
  @js.native
  trait StopFn[T] extends StObject
  
  /**
    * Update the props of a spring.
    *
    * The `T` parameter must be a primitive type for a single animated value.
    */
  @js.native
  trait UpdateValueFn[T]
    extends StObject
       with AnyUpdateFn[SpringValue[T], InferProps[SpringValue[T]], InferState[SpringValue[T]]] {
    
    def apply(props: `5`[T] & SpringProps[T]): js.Promise[AnimationResult[SpringValue[T]]] = js.native
  }
  
  /**
    * Update the props of a `Controller` object or `useSpring` call.
    *
    * The `T` parameter must be a set of animated values (as an object type).
    */
  @js.native
  trait UpdateValuesFn[State /* <: Lookup[Any] */]
    extends StObject
       with AnyUpdateFn[Controller[State], InferProps[Controller[State]], InferState[Controller[State]]] {
    
    def apply(props: InlineToProps[State] & (ControllerProps[State, Unit])): js.Promise[AnimationResult[Controller[State]]] = js.native
    def apply(props: `6`[State] & (ControllerProps[State, Unit])): js.Promise[AnimationResult[Controller[State]]] = js.native
  }
}

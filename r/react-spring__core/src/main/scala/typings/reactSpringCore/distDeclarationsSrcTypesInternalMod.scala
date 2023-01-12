package typings.reactSpringCore

import typings.reactSpringCore.distDeclarationsSrcSpringValueMod.SpringValue
import typings.reactSpringCore.distDeclarationsSrcTypesObjectsMod.AnimationResult
import typings.reactSpringTypes.utilMod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesInternalMod {
  
  trait AnimationRange[T] extends StObject {
    
    var from: js.UndefOr[
        T | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any)
      ] = js.undefined
    
    var to: js.UndefOr[
        T | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any)
      ] = js.undefined
  }
  object AnimationRange {
    
    inline def apply[T](): AnimationRange[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationRange[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimationRange[?], T] (val x: Self & AnimationRange[T]) extends AnyVal {
      
      inline def setFrom(
        value: T | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any)
      ): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(
        value: T | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any)
      ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type AnimationResolver[T /* <: Readable[Any] */] = js.Function1[/* result */ AnimationResult[T] | js.Promise[AnimationResult[T]], Unit]
  
  trait AnimationTarget[T]
    extends StObject
       with Readable[T] {
    
    var item: js.UndefOr[Any] = js.undefined
    
    def start(props: Any): js.Promise[AnimationResult[this.type]]
    
    var stop: js.Function
  }
  object AnimationTarget {
    
    inline def apply[T](get: () => T, start: Any => js.Promise[AnimationResult[AnimationTarget[T]]], stop: js.Function): AnimationTarget[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), start = js.Any.fromFunction1(start), stop = stop.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationTarget[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimationTarget[?], T] (val x: Self & AnimationTarget[T]) extends AnyVal {
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setStart(value: Any => js.Promise[AnimationResult[AnimationTarget[T]]]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStop(value: js.Function): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Exclude<keyof @react-spring/core.@react-spring/core/dist/declarations/src/types/props.ReservedEventProps, 'onResolve' | 'onDestroyed'> */
  /* Rewritten from type alias, can be one of: 
    - typings.reactSpringCore.reactSpringCoreStrings.onResume
    - typings.reactSpringCore.reactSpringCoreStrings.onChange
    - typings.reactSpringCore.reactSpringCoreStrings.onRest
    - typings.reactSpringCore.reactSpringCoreStrings.onStart
    - typings.reactSpringCore.reactSpringCoreStrings.onPause
    - typings.reactSpringCore.reactSpringCoreStrings.onProps
  */
  trait EventKey extends StObject
  object EventKey {
    
    inline def onChange: typings.reactSpringCore.reactSpringCoreStrings.onChange = "onChange".asInstanceOf[typings.reactSpringCore.reactSpringCoreStrings.onChange]
    
    inline def onPause: typings.reactSpringCore.reactSpringCoreStrings.onPause = "onPause".asInstanceOf[typings.reactSpringCore.reactSpringCoreStrings.onPause]
    
    inline def onProps: typings.reactSpringCore.reactSpringCoreStrings.onProps = "onProps".asInstanceOf[typings.reactSpringCore.reactSpringCoreStrings.onProps]
    
    inline def onRest: typings.reactSpringCore.reactSpringCoreStrings.onRest = "onRest".asInstanceOf[typings.reactSpringCore.reactSpringCoreStrings.onRest]
    
    inline def onResume: typings.reactSpringCore.reactSpringCoreStrings.onResume = "onResume".asInstanceOf[typings.reactSpringCore.reactSpringCoreStrings.onResume]
    
    inline def onStart: typings.reactSpringCore.reactSpringCoreStrings.onStart = "onStart".asInstanceOf[typings.reactSpringCore.reactSpringCoreStrings.onStart]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<infer State> ? @react-spring/core.@react-spring/core/dist/declarations/src/types/props.ControllerUpdate<State, undefined> : T extends @react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<infer U> ? @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringUpdate<U> : @react-spring/types.@react-spring/types/util.Lookup<any>
    }}}
    */
  type InferProps[T /* <: Readable[Any] */] = Lookup[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<infer State> ? State : T extends @react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<infer U> ? U : unknown
    }}}
    */
  @js.native
  trait InferState[T /* <: Readable[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends object ? T extends std.ReadonlyArray<number | string> ? @react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<T> : @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<T> : @react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<T>
    }}}
    */
  type InferTarget[T] = SpringValue[T]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in std.Extract<keyof T, @react-spring/core.@react-spring/core/dist/declarations/src/types/internal.EventKey> ]:? std.Extract<T[P], std.Function>}
    }}}
    */
  @js.native
  trait PickEventFns[T] extends StObject
  
  trait Readable[T] extends StObject {
    
    def get(): T
  }
  object Readable {
    
    inline def apply[T](get: () => T): Readable[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Readable[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Readable[?], T] (val x: Self & Readable[T]) extends AnyVal {
      
      inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
}

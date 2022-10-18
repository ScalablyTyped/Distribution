package typings.reactSpringShared

import typings.reactSpringShared.anon.EventObserved
import typings.std.Exclude
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcFluidsMod {
  
  @JSImport("@react-spring/shared/dist/declarations/src/fluids", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Extend this class for automatic TypeScript support when passing this
    * value to `fluids`-compatible libraries.
    */
  /* note: abstract class */ @JSImport("@react-spring/shared/dist/declarations/src/fluids", "FluidValue")
  @js.native
  open class FluidValue[T, E /* <: FluidEvent[T] */] () extends StObject {
    def this(get: js.Function0[T]) = this()
    
    /** Get the current value. */
    /* protected */ var get: js.UndefOr[js.Function0[T]] = js.native
    
    /** Called after an observer is added. */
    /* protected */ var observerAdded: js.UndefOr[js.Function2[/* count */ Double, /* observer */ FluidObserver[E], Unit]] = js.native
    
    /** Called after an observer is removed. */
    /* protected */ var observerRemoved: js.UndefOr[js.Function2[/* count */ Double, /* observer */ FluidObserver[E], Unit]] = js.native
  }
  
  inline def addFluidObserver[E /* <: FluidEvent[Any] */](target: js.Object, observer: FluidObserver[E]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Any]
  /** Observe a `fluids`-compatible object. */
  inline def addFluidObserver[T, E /* <: FluidEvent[Any] */](target: FluidValue[T, E], observer: FluidObserver[E]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** Send an event to an observer. */
  inline def callFluidObserver[E /* <: FluidEvent[Any] */](observer: FluidObserver[E], event: E): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callFluidObserver")(observer.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def callFluidObservers(target: js.Object, event: FluidEvent[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callFluidObservers")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /** Send an event to all observers. */
  inline def callFluidObservers[E /* <: FluidEvent[Any] */](target: FluidValue[Any, E], event: E): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callFluidObservers")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Get the current observer set. Never mutate it directly! */
  @JSImport("@react-spring/shared/dist/declarations/src/fluids", "getFluidObservers")
  @js.native
  val getFluidObservers: GetFluidObservers_ = js.native
  
  /**
    * Get the current value.
    * If `arg` is not observable, `arg` is returned.
    */
  @JSImport("@react-spring/shared/dist/declarations/src/fluids", "getFluidValue")
  @js.native
  val getFluidValue: GetFluidValue_ = js.native
  
  /** Returns true if `arg` can be observed. */
  inline def hasFluidValue(arg: Any): /* is @react-spring/shared.@react-spring/shared/dist/declarations/src/fluids.FluidValue<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFluidValue")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is @react-spring/shared.@react-spring/shared/dist/declarations/src/fluids.FluidValue<any, any> */ Boolean]
  
  inline def removeFluidObserver[E /* <: FluidEvent[Any] */](target: js.Object, observer: FluidObserver[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /** Stop observing a `fluids`-compatible object. */
  inline def removeFluidObserver[E /* <: FluidEvent[Any] */](target: FluidValue[Any, E], observer: FluidObserver[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Define the getter called by `getFluidValue`. */
  inline def setFluidGetter(target: js.Object, get: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFluidGetter")(target.asInstanceOf[js.Any], get.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait FluidEvent[T] extends StObject {
    
    var parent: FluidValue[T, Any]
    
    var `type`: String
  }
  object FluidEvent {
    
    inline def apply[T](parent: FluidValue[T, Any], `type`: String): FluidEvent[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluidEvent[T]]
    }
    
    extension [Self <: FluidEvent[?], T](x: Self & FluidEvent[T]) {
      
      inline def setParent(value: FluidValue[T, Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FluidObserver[E /* <: FluidEvent[Any] */] = EventObserved[E] | (js.Function1[/* event */ E, Unit])
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends object ? {[ P in keyof T ]: T[P] | @react-spring/shared.@react-spring/shared/dist/declarations/src/fluids.FluidValue<std.Exclude<T[P], void>, any>} : unknown
    }}}
    */
  @js.native
  trait FluidProps[T] extends StObject
  
  @js.native
  trait GetFluidObservers_ extends StObject {
    
    def apply(target: js.Object): ReadonlySet[FluidObserver[Any]] | Null = js.native
    def apply[E /* <: FluidEvent[Any] */](target: FluidValue[Any, E]): ReadonlySet[FluidObserver[E]] | Null = js.native
  }
  
  type GetFluidValue_ = js.Function1[
    /* target */ Any | (FluidValue[scala.Nothing, Any]), 
    (Exclude[Any, FluidValue[Any, Any]]) | scala.Nothing
  ]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P] extends @react-spring/shared.@react-spring/shared/dist/declarations/src/fluids.FluidValue<infer U, any>? U : T[P]}
    }}}
    */
  @js.native
  trait StaticProps[T /* <: js.Object */] extends StObject
}

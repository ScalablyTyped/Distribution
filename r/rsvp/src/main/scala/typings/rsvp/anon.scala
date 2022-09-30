package typings.rsvp

import typings.rsvp.mod.RSVP.Arg
import typings.rsvp.mod.RSVP.InstrumentEvent
import typings.rsvp.mod.RSVP.ObjectWithEventMixins
import typings.rsvp.mod.RSVP.Promise
import typings.rsvp.rsvpInts.`10`
import typings.rsvp.rsvpInts.`9`
import typings.rsvp.rsvpStrings.chained
import typings.rsvp.rsvpStrings.created
import typings.rsvp.rsvpStrings.error
import typings.rsvp.rsvpStrings.fulfilled
import typings.rsvp.rsvpStrings.rejected
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var length: `9`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(length = 9)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setLength(value: `9`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var length: typings.rsvp.rsvpInts.`8`
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(length = 8)
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setLength(value: typings.rsvp.rsvpInts.`8`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var length: typings.rsvp.rsvpInts.`7`
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal(length = 7)
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setLength(value: typings.rsvp.rsvpInts.`7`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `3` extends StObject {
    
    var length: typings.rsvp.rsvpInts.`6`
  }
  object `3` {
    
    inline def apply(): `3` = {
      val __obj = js.Dynamic.literal(length = 6)
      __obj.asInstanceOf[`3`]
    }
    
    extension [Self <: `3`](x: Self) {
      
      inline def setLength(value: typings.rsvp.rsvpInts.`6`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `4` extends StObject {
    
    var length: typings.rsvp.rsvpInts.`5`
  }
  object `4` {
    
    inline def apply(): `4` = {
      val __obj = js.Dynamic.literal(length = 5)
      __obj.asInstanceOf[`4`]
    }
    
    extension [Self <: `4`](x: Self) {
      
      inline def setLength(value: typings.rsvp.rsvpInts.`5`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `5` extends StObject {
    
    var length: typings.rsvp.rsvpInts.`4`
  }
  object `5` {
    
    inline def apply(): `5` = {
      val __obj = js.Dynamic.literal(length = 4)
      __obj.asInstanceOf[`5`]
    }
    
    extension [Self <: `5`](x: Self) {
      
      inline def setLength(value: typings.rsvp.rsvpInts.`4`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `6` extends StObject {
    
    var length: typings.rsvp.rsvpInts.`3`
  }
  object `6` {
    
    inline def apply(): `6` = {
      val __obj = js.Dynamic.literal(length = 3)
      __obj.asInstanceOf[`6`]
    }
    
    extension [Self <: `6`](x: Self) {
      
      inline def setLength(value: typings.rsvp.rsvpInts.`3`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `7` extends StObject {
    
    var length: typings.rsvp.rsvpInts.`2`
  }
  object `7` {
    
    inline def apply(): `7` = {
      val __obj = js.Dynamic.literal(length = 2)
      __obj.asInstanceOf[`7`]
    }
    
    extension [Self <: `7`](x: Self) {
      
      inline def setLength(value: typings.rsvp.rsvpInts.`2`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `8` extends StObject {
    
    var length: typings.rsvp.rsvpInts.`1`
  }
  object `8` {
    
    inline def apply(): `8` = {
      val __obj = js.Dynamic.literal(length = 1)
      __obj.asInstanceOf[`8`]
    }
    
    extension [Self <: `8`](x: Self) {
      
      inline def setLength(value: typings.rsvp.rsvpInts.`1`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length extends StObject {
    
    var length: `10`
  }
  object Length {
    
    inline def apply(): Length = {
      val __obj = js.Dynamic.literal(length = 10)
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setLength(value: `10`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofEventTarget extends StObject {
    
    /** `RSVP.EventTarget.mixin` extends an object with EventTarget methods. */
    /* static member */
    def mixin(`object`: js.Object): ObjectWithEventMixins = js.native
    
    /**
      * You can use `off` to stop firing a particular callback for an event.
      *
      * If you don't pass a `callback` argument to `off`, ALL callbacks for the
      * event will not be executed when the event fires.
      */
    /* static member */
    def off(eventName: String): Unit = js.native
    def off(eventName: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
    
    /** Registers a callback to be executed when `eventName` is triggered */
    /* static member */
    def on(
      eventName: created | chained | fulfilled | rejected,
      listener: js.Function1[/* event */ InstrumentEvent, Unit]
    ): Unit = js.native
    /* static member */
    def on(eventName: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
    /* static member */
    @JSName("on")
    def on_error(eventName: error, errorHandler: js.Function1[/* reason */ Any, Unit]): Unit = js.native
    
    /**
      * Use `trigger` to fire custom events.
      *
      * You can also pass a value as a second argument to `trigger` that will be
      * passed as an argument to all event listeners for the event
      */
    /* static member */
    def trigger(eventName: String): Unit = js.native
    def trigger(eventName: String, options: Any): Unit = js.native
    def trigger(eventName: String, options: Any, label: String): Unit = js.native
    def trigger(eventName: String, options: Unit, label: String): Unit = js.native
  }
  
  @js.native
  trait TypeofPromise extends StObject {
    
    /* static member */
    def all[T](values: js.Array[Arg[T]]): Promise[js.Array[T]] = js.native
    def all[T](values: js.Array[Arg[T]], label: String): Promise[js.Array[T]] = js.native
    /* static member */
    def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): Promise[js.Tuple2[T1, T2]] = js.native
    def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): Promise[js.Tuple2[T1, T2]] = js.native
    /* static member */
    def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): Promise[js.Tuple3[T1, T2, T3]] = js.native
    def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): Promise[js.Tuple3[T1, T2, T3]] = js.native
    /* static member */
    def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    /* static member */
    def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    /* static member */
    def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    /* static member */
    def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    /* static member */
    def all[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    /* static member */
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    /* static member */
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
    ): Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      label: String
    ): Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    
    /* static member */
    def race[T](values: js.Array[Arg[T]]): Promise[T] = js.native
    def race[T](values: js.Array[Arg[T]], label: String): Promise[T] = js.native
    /* static member */
    def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): Promise[T1 | T2] = js.native
    def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): Promise[T1 | T2] = js.native
    /* static member */
    def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): Promise[T1 | T2 | T3] = js.native
    def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): Promise[T1 | T2 | T3] = js.native
    /* static member */
    def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): Promise[T1 | T2 | T3 | T4] = js.native
    def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): Promise[T1 | T2 | T3 | T4] = js.native
    /* static member */
    def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): Promise[T1 | T2 | T3 | T4 | T5] = js.native
    def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): Promise[T1 | T2 | T3 | T4 | T5] = js.native
    /* static member */
    def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    /* static member */
    def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    /* static member */
    def race[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    /* static member */
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    /* static member */
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          Arg[T1], 
          Arg[T2], 
          Arg[T3], 
          Arg[T4], 
          Arg[T5], 
          Arg[T6], 
          Arg[T7], 
          Arg[T8], 
          Arg[T9], 
          T10 | PromiseLike[T10]
        ]
    ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          Arg[T1], 
          Arg[T2], 
          Arg[T3], 
          Arg[T4], 
          Arg[T5], 
          Arg[T6], 
          Arg[T7], 
          Arg[T8], 
          Arg[T9], 
          T10 | PromiseLike[T10]
        ],
      label: String
    ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    
    /* static member */
    def reject(): Promise[scala.Nothing] = js.native
    def reject(reason: Any): Promise[scala.Nothing] = js.native
    def reject(reason: Any, label: String): Promise[scala.Nothing] = js.native
    def reject(reason: Unit, label: String): Promise[scala.Nothing] = js.native
    
    /* static member */
    def resolve(): Promise[Unit] = js.native
    def resolve[T](value: Unit, label: String): Promise[T] = js.native
    def resolve[T](value: Arg[T]): Promise[T] = js.native
    def resolve[T](value: Arg[T], label: String): Promise[T] = js.native
    /* static member */
    @JSName("resolve")
    def resolve_T[T](): Promise[T] = js.native
  }
}

package typings.rsvp

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rsvp.anon.Length
import typings.rsvp.anon.TypeofEventTarget
import typings.rsvp.anon.TypeofPromise
import typings.rsvp.anon.`0`
import typings.rsvp.anon.`1`
import typings.rsvp.anon.`2`
import typings.rsvp.anon.`3`
import typings.rsvp.anon.`4`
import typings.rsvp.anon.`5`
import typings.rsvp.anon.`6`
import typings.rsvp.anon.`7`
import typings.rsvp.anon.`8`
import typings.rsvp.mod.RSVP.Arg
import typings.rsvp.mod.RSVP.Deferred
import typings.rsvp.mod.RSVP.InstrumentEvent
import typings.rsvp.mod.RSVP.ObjectWithEventMixins
import typings.rsvp.mod.RSVP.PromiseState
import typings.rsvp.mod.RSVP.State.pending
import typings.rsvp.rsvpBooleans.`false`
import typings.rsvp.rsvpBooleans.`true`
import typings.rsvp.rsvpStrings.chained
import typings.rsvp.rsvpStrings.created
import typings.rsvp.rsvpStrings.error
import typings.rsvp.rsvpStrings.fulfilled
import typings.rsvp.rsvpStrings.rejected
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsvp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("rsvp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsvp", "default.EventTarget")
    @js.native
    open class EventTarget ()
      extends StObject
         with typings.rsvp.mod.RSVP.EventTarget
    object EventTarget {
      
      @JSImport("rsvp", "default.EventTarget")
      @js.native
      val ^ : js.Any = js.native
      
      /** `RSVP.EventTarget.mixin` extends an object with EventTarget methods. */
      /* static member */
      inline def mixin(`object`: js.Object): ObjectWithEventMixins = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectWithEventMixins]
      
      /**
        * You can use `off` to stop firing a particular callback for an event.
        *
        * If you don't pass a `callback` argument to `off`, ALL callbacks for the
        * event will not be executed when the event fires.
        */
      /* static member */
      inline def off(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def off(eventName: String, callback: js.Function1[/* value */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /** Registers a callback to be executed when `eventName` is triggered */
      /* static member */
      inline def on(
        eventName: created | chained | fulfilled | rejected,
        listener: js.Function1[/* event */ InstrumentEvent, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /* static member */
      inline def on(eventName: String, callback: js.Function1[/* value */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def on_error(eventName: error, errorHandler: js.Function1[/* reason */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Use `trigger` to fire custom events.
        *
        * You can also pass a value as a second argument to `trigger` that will be
        * passed as an argument to all event listeners for the event
        */
      /* static member */
      inline def trigger(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def trigger(eventName: String, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def trigger(eventName: String, options: Any, label: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def trigger(eventName: String, options: Unit, label: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    @JSImport("rsvp", "default.Promise")
    @js.native
    open class Promise[T] protected ()
      extends StObject
         with typings.rsvp.mod.RSVP.Promise[T]
         with Instantiable1[
              /* executor */ js.Function2[
                /* resolve */ js.Function1[/* value */ js.UndefOr[Arg[js.Object]], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
                Unit
              ], 
              typings.rsvp.mod.RSVP.Promise[js.Object]
            ] {
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ js.UndefOr[Arg[T]], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
                Unit
              ]) = this()
      def this(
        executor: js.Function2[
                /* resolve */ js.Function1[/* value */ js.UndefOr[Arg[T]], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
                Unit
              ],
        label: String
      ) = this()
    }
    object Promise {
      
      @JSImport("rsvp", "default.Promise")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def all[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T]]]
      inline def all[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T]]]
      /* static member */
      inline def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]]
      inline def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]]
      /* static member */
      inline def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]]
      inline def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]]
      /* static member */
      inline def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]]]
      inline def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]]]
      /* static member */
      inline def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]]]
      inline def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]]]
      /* static member */
      inline def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
      inline def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
      /* static member */
      inline def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
      inline def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
      /* static member */
      inline def all[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
      inline def all[T1, T2, T3, T4, T5, T6, T7, T8](
        values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
      /* static member */
      inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]]
      inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
        values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]]
      /* static member */
      inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
        values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
      ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]]
      inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
        values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]]
      
      /* static member */
      /* was `typeof RSVP.Promise.resolve` */
      inline def cast(): typings.rsvp.mod.RSVP.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[Unit]]
      inline def cast[T](value: Unit, label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
      inline def cast[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
      inline def cast[T](value: Arg[T], label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
      
      /* static member */
      /* was `typeof RSVP.Promise.resolve` */
      inline def cast_T[T](): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
      
      /* static member */
      inline def race[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
      inline def race[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
      /* static member */
      inline def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[T1 | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2]]
      inline def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2]]
      /* static member */
      inline def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3]]
      inline def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3]]
      /* static member */
      inline def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4]]
      inline def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4]]
      /* static member */
      inline def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5]]
      inline def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5]]
      /* static member */
      inline def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6]]
      inline def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6]]
      /* static member */
      inline def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7]]
      inline def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7]]
      /* static member */
      inline def race[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
      inline def race[T1, T2, T3, T4, T5, T6, T7, T8](
        values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
      /* static member */
      inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
      inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
        values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
      /* static member */
      inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
      ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]
      inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
      ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]
      
      /* static member */
      inline def reject(): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[scala.Nothing]]
      inline def reject(reason: Any): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(reason.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[scala.Nothing]]
      inline def reject(reason: Any, label: String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(reason.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[scala.Nothing]]
      inline def reject(reason: Unit, label: String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(reason.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[scala.Nothing]]
      
      /* static member */
      inline def resolve(): typings.rsvp.mod.RSVP.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[Unit]]
      inline def resolve[T](value: Unit, label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
      inline def resolve[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
      inline def resolve[T](value: Arg[T], label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
      
      /* static member */
      inline def resolve_T[T](): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    }
    
    // RSVP supplies status for promises in certain places.
    @JSImport("rsvp", "default.State")
    @js.native
    object State extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.rsvp.mod.RSVP.State & String] = js.native
      
      /* "fulfilled" */ val fulfilled: typings.rsvp.mod.RSVP.State.fulfilled & String = js.native
      
      /* "pending" */ val pending: typings.rsvp.mod.RSVP.State.pending & String = js.native
      
      /* "rejected" */ val rejected: typings.rsvp.mod.RSVP.State.rejected & String = js.native
    }
    
    /* static member */
    /* was `typeof Promise.all` */
    inline def all[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T]]]
    inline def all[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T]]]
    /* static member */
    /* was `typeof Promise.all` */
    inline def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]]
    inline def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]]
    /* static member */
    /* was `typeof Promise.all` */
    inline def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]]
    inline def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]]
    /* static member */
    /* was `typeof Promise.all` */
    inline def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]]]
    inline def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]]]
    /* static member */
    /* was `typeof Promise.all` */
    inline def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]]]
    inline def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]]]
    /* static member */
    /* was `typeof Promise.all` */
    inline def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
    inline def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
    /* static member */
    /* was `typeof Promise.all` */
    inline def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
    inline def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
    /* static member */
    /* was `typeof Promise.all` */
    inline def all[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
    inline def all[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
    /* static member */
    /* was `typeof Promise.all` */
    inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]]
    inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]]
    /* static member */
    /* was `typeof Promise.all` */
    inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]]
    inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]]
    
    inline def allSettled[T](entries: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]]]
    inline def allSettled[T](entries: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]]]
    inline def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]]]
    inline def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]]]
    inline def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]]]
    inline def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]]]
    inline def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[
        js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
      ]]
    inline def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[
        js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[
        js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[
        js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[
        js.Tuple6[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple6[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6]
        ]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[
        js.Tuple6[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple6[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6]
        ]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[
        js.Tuple7[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple7[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7]
        ]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[
        js.Tuple7[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple7[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7]
        ]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[
        js.Tuple8[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple8[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8]
        ]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[
        js.Tuple8[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple8[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8]
        ]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]
    ): typings.rsvp.mod.RSVP.Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
    ): typings.rsvp.mod.RSVP.Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ]]
    inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ]]
    
    inline def asap[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asap")(callback.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof asap` */
    inline def async[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(callback.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @deprecated
      */
    /* static member */
    /* was `typeof Promise.cast` */
    inline def cast(): typings.rsvp.mod.RSVP.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[Unit]]
    /**
      * @deprecated
      */
    /* static member */
    /* was `typeof Promise.cast` */
    inline def cast[T](value: Unit, label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    /**
      * @deprecated
      */
    /* static member */
    /* was `typeof Promise.cast` */
    inline def cast[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    /**
      * @deprecated
      */
    /* static member */
    /* was `typeof Promise.cast` */
    inline def cast[T](value: Arg[T], label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    
    /**
      * @deprecated
      */
    /* static member */
    /* was `typeof Promise.cast` */
    inline def cast_T[T](): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    
    inline def configure[T](name: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(name.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def configure[T](name: String, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def defer[T](): Deferred[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Deferred[T]]
    inline def defer[T](label: String): Deferred[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(label.asInstanceOf[js.Any]).asInstanceOf[Deferred[T]]
    
    inline def denodeify[T, A](
      nodeFunc: js.Function2[/* arg1 */ A, /* callback */ js.Function2[/* err */ Any, /* data */ T, Unit], Unit]
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]]]
    inline def denodeify[T, A, K1 /* <: String */](
      nodeFunc: js.Function2[/* arg1 */ A, /* callback */ js.Function2[/* err */ Any, /* data */ T, Unit], Unit],
      options: js.Array[K1]
    ): js.Function1[
        /* arg1 */ A, 
        typings.rsvp.mod.RSVP.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T} */ js.Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
        /* arg1 */ A, 
        typings.rsvp.mod.RSVP.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T} */ js.Any
        ]
      ]]
    inline def denodeify[T1, T2, A, K1 /* <: String */, K2 /* <: String */](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ],
      options: js.Tuple2[K1, K2]
    ): js.Function1[
        /* arg1 */ A, 
        typings.rsvp.mod.RSVP.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T1} */ js.Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
        /* arg1 */ A, 
        typings.rsvp.mod.RSVP.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T1} */ js.Any
        ]
      ]]
    inline def denodeify[T1, T2, T3, A, K1 /* <: String */, K2 /* <: String */, K3 /* <: String */](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ],
      options: js.Tuple3[K1, K2, K3]
    ): js.Function1[
        /* arg1 */ A, 
        typings.rsvp.mod.RSVP.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T1} */ js.Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
        /* arg1 */ A, 
        typings.rsvp.mod.RSVP.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T1} */ js.Any
        ]
      ]]
    
    inline def denodeify_T1T2A[T1, T2, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ]
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]]]
    
    // ----- denodeify ----- //
    // Here be absurd things because we don't have variadic types. All of
    // this will go away if we can ever write this:
    //
    //     denodeify<...T, ...A>(
    //         nodeFunc: (...args: ...A, callback: (err: any, ...cbArgs: ...T) => any) => void,
    //         options?: false
    //     ): (...args: ...A) => RSVP.Promise<...T>
    // That day, however, may never come. So, in the meantime, we do this.
    inline def denodeify_T1T2T3A[T1, T2, T3, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ]
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]]]
    
    inline def denodeify_false[T, A](
      nodeFunc: js.Function2[/* arg1 */ A, /* callback */ js.Function2[/* err */ Any, /* data */ T, Unit], Unit],
      options: `false`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]]]
    
    inline def denodeify_false_T1T2A[T1, T2, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ],
      options: `false`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]]]
    
    inline def denodeify_false_T1T2T3A[T1, T2, T3, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ],
      options: `false`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]]]
    
    inline def denodeify_true[T, A](
      nodeFunc: js.Function2[/* arg1 */ A, /* callback */ js.Function2[/* err */ Any, /* data */ T, Unit], Unit],
      options: `true`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Array[T]]]]
    
    inline def denodeify_true_T1T2A[T1, T2, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ],
      options: `true`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]]]
    
    inline def denodeify_true_T1T2T3A[T1, T2, T3, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ],
      options: `true`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]]]
    
    inline def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T]]]
    inline def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T]]]
    inline def filter[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], filterFn: js.Function1[/* item */ T1 | T2, Boolean]): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]]]
    inline def filter[T1, T2](
      entries: js.Tuple2[Arg[T1], Arg[T2]],
      filterFn: js.Function1[/* item */ T1 | T2, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]]]
    inline def filter[T1, T2, T3](
      entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]]]
    inline def filter[T1, T2, T3](
      entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]]]
    inline def filter[T1, T2, T3, T4](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]]]
    inline def filter[T1, T2, T3, T4](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]]]
    inline def filter[T1, T2, T3, T4, T5](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]]]
    inline def filter[T1, T2, T3, T4, T5](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]]]
    inline def filter[T1, T2, T3, T4, T5, T6](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) & `3`] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) & `3`]]
    inline def filter[T1, T2, T3, T4, T5, T6](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) & `3`] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) & `3`]]
    inline def filter[T1, T2, T3, T4, T5, T6, T7](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]]]
    inline def filter[T1, T2, T3, T4, T5, T6, T7](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]]]
    inline def filter[T1, T2, T3, T4, T5, T6, T7, T8](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]]
    inline def filter[T1, T2, T3, T4, T5, T6, T7, T8](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]]
    inline def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]]
    inline def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]]
    inline def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]]
    inline def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]]
    
    // ----- hash and hashSettled ----- //
    inline def hash[T](
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>} */ js.Any
    ): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    inline def hash[T](
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>} */ js.Any,
      label: String
    ): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(`object`.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    
    inline def hashSettled[T](
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>} */ js.Any
    ): typings.rsvp.mod.RSVP.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>} */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("hashSettled")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>} */ js.Any
      ]]
    inline def hashSettled[T](
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>} */ js.Any,
      label: String
    ): typings.rsvp.mod.RSVP.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>} */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSettled")(`object`.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>} */ js.Any
      ]]
    
    inline def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `8`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `8`]]
    inline def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `8`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `8`]]
    inline def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `7`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `7`]]
    inline def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `7`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `7`]]
    inline def map[T1, T2, T3, U](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], mapFn: js.Function1[/* item */ T1 | T2 | T3, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `6`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `6`]]
    inline def map[T1, T2, T3, U](
      entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `6`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `6`]]
    inline def map[T1, T2, T3, T4, U](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `5`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `5`]]
    inline def map[T1, T2, T3, T4, U](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `5`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `5`]]
    inline def map[T1, T2, T3, T4, T5, U](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `4`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `4`]]
    inline def map[T1, T2, T3, T4, T5, U](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `4`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `4`]]
    inline def map[T1, T2, T3, T4, T5, T6, U](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `3`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `3`]]
    inline def map[T1, T2, T3, T4, T5, T6, U](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `3`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `3`]]
    inline def map[T1, T2, T3, T4, T5, T6, T7, U](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `2`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `2`]]
    inline def map[T1, T2, T3, T4, T5, T6, T7, U](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `2`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `2`]]
    inline def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `1`]]
    inline def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `1`]]
    inline def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `0`]]
    inline def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `0`]]
    inline def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & Length] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & Length]]
    inline def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & Length] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & Length]]
    
    /**
      * You can use `off` to stop firing a particular callback for an event.
      *
      * If you don't pass a `callback` argument to `off`, ALL callbacks for the
      * event will not be executed when the event fires.
      */
    /* static member */
    /* was `typeof EventTarget.off` */
    inline def off(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off(eventName: String, callback: js.Function1[/* value */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Registers a callback to be executed when `eventName` is triggered */
    /* static member */
    /* was `typeof EventTarget.on` */
    inline def on(
      eventName: created | chained | fulfilled | rejected,
      listener: js.Function1[/* event */ InstrumentEvent, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* static member */
    /* was `typeof EventTarget.on` */
    inline def on(eventName: String, callback: js.Function1[/* value */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    /* was `typeof EventTarget.on` */
    inline def on_error(eventName: error, errorHandler: js.Function1[/* reason */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    /* was `typeof Promise.race` */
    inline def race[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    inline def race[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    /* static member */
    /* was `typeof Promise.race` */
    inline def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[T1 | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2]]
    inline def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2]]
    /* static member */
    /* was `typeof Promise.race` */
    inline def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3]]
    inline def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3]]
    /* static member */
    /* was `typeof Promise.race` */
    inline def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4]]
    inline def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4]]
    /* static member */
    /* was `typeof Promise.race` */
    inline def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5]]
    inline def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5]]
    /* static member */
    /* was `typeof Promise.race` */
    inline def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6]]
    inline def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6]]
    /* static member */
    /* was `typeof Promise.race` */
    inline def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7]]
    inline def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7]]
    /* static member */
    /* was `typeof Promise.race` */
    inline def race[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
    inline def race[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
    /* static member */
    /* was `typeof Promise.race` */
    inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
    inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
    /* static member */
    /* was `typeof Promise.race` */
    inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]
    inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]
    
    /* static member */
    /* was `typeof Promise.reject` */
    inline def reject(): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[scala.Nothing]]
    inline def reject(reason: Any): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(reason.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[scala.Nothing]]
    inline def reject(reason: Any, label: String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(reason.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[scala.Nothing]]
    inline def reject(reason: Unit, label: String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(reason.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[scala.Nothing]]
    
    /* static member */
    /* was `typeof Promise.resolve` */
    inline def resolve(): typings.rsvp.mod.RSVP.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[Unit]]
    inline def resolve[T](value: Unit, label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    inline def resolve[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    inline def resolve[T](value: Arg[T], label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    
    /* static member */
    /* was `typeof Promise.resolve` */
    inline def resolve_T[T](): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
    
    inline def rethrow(reason: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rethrow")(reason.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("rsvp", "EventTarget")
  @js.native
  val EventTarget: TypeofEventTarget & Instantiable0[typings.rsvp.mod.RSVP.EventTarget] = js.native
  type EventTarget = typings.rsvp.mod.RSVP.EventTarget
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rsvp", "EventTarget")
  @js.native
  open class EventTargetCls ()
    extends StObject
       with typings.rsvp.mod.RSVP.EventTarget
  
  @JSImport("rsvp", "Promise")
  @js.native
  val Promise: TypeofPromise & (Instantiable2[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[
        /* value */ js.UndefOr[Arg[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
      Unit
    ], 
    /* label */ js.UndefOr[String], 
    typings.rsvp.mod.RSVP.Promise[js.Object]
  ]) = js.native
  type Promise[T] = typings.rsvp.mod.RSVP.Promise[T]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rsvp", "Promise")
  @js.native
  open class PromiseCls[T] protected ()
    extends StObject
       with typings.rsvp.mod.RSVP.Promise[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[
              /* value */ js.UndefOr[Arg[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]], 
              Unit
            ], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
    def this(
      executor: js.Function2[
            /* resolve */ js.Function1[
              /* value */ js.UndefOr[Arg[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]], 
              Unit
            ], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ],
      label: String
    ) = this()
  }
  
  object RSVP {
    
    @js.native
    sealed trait State extends StObject
    // RSVP supplies status for promises in certain places.
    @JSImport("rsvp", "RSVP.State")
    @js.native
    object State extends StObject {
      
      @js.native
      sealed trait fulfilled
        extends StObject
           with State
      
      @js.native
      sealed trait pending
        extends StObject
           with State
      
      @js.native
      sealed trait rejected
        extends StObject
           with State
    }
    
    // All the Promise methods essentially flatten existing promises, so that
    // you don't end up with `Promise<Promise<Promise<string>>>` if you happen
    // to return another `Promise` from a `.then()` invocation, etc. So all of
    // them can take a type or a promise-like/then-able type.
    type Arg[T] = T | PromiseLike[T]
    
    @js.native
    trait Deferred[T] extends StObject {
      
      var promise: typings.rsvp.mod.RSVP.Promise[T] = js.native
      
      def reject(): Unit = js.native
      def reject(reason: Any): Unit = js.native
      
      def resolve(): Unit = js.native
      def resolve(value: Arg[T]): Unit = js.native
    }
    
    trait EventTarget extends StObject
    
    trait InstrumentEvent extends StObject {
      
      // guid of promise. Must be globally unique, not just within the implementation
      var childGuid: String
      
      // one of ['created', 'chained', 'fulfilled', 'rejected']
      var detail: Any
      
      // child of child promise (for chained via `then`)
      var eventName: String
      
      var guid: String
      
      // fulfillment value or rejection reason, if applicable
      var label: String
      
      // label passed to promise's constructor
      var timeStamp: Double
    }
    object InstrumentEvent {
      
      inline def apply(childGuid: String, detail: Any, eventName: String, guid: String, label: String, timeStamp: Double): InstrumentEvent = {
        val __obj = js.Dynamic.literal(childGuid = childGuid.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[InstrumentEvent]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InstrumentEvent] (val x: Self) extends AnyVal {
        
        inline def setChildGuid(value: String): Self = StObject.set(x, "childGuid", value.asInstanceOf[js.Any])
        
        inline def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
        
        inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
        
        inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ObjectWithEventMixins extends StObject {
      
      def off(eventName: String): Unit = js.native
      def off(eventName: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
      
      def on(
        eventName: created | chained | fulfilled | rejected,
        listener: js.Function1[/* event */ InstrumentEvent, Unit]
      ): Unit = js.native
      def on(eventName: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
      @JSName("on")
      def on_error(eventName: error, errorHandler: js.Function1[/* reason */ Any, Unit]): Unit = js.native
      
      def trigger(eventName: String): Unit = js.native
      def trigger(eventName: String, options: Any): Unit = js.native
      def trigger(eventName: String, options: Any, label: String): Unit = js.native
      def trigger(eventName: String, options: Unit, label: String): Unit = js.native
    }
    
    trait Pending
      extends StObject
         with _PromiseState[Any] {
      
      var state: pending
    }
    object Pending {
      
      inline def apply(state: pending): Pending = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[Pending]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Pending] (val x: Self) extends AnyVal {
        
        inline def setState(value: pending): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Promise[T]
      extends StObject
         with PromiseLike[T] {
      
      def `catch`[TResult](): typings.rsvp.mod.RSVP.Promise[T | TResult] = js.native
      def `catch`[TResult](onRejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): typings.rsvp.mod.RSVP.Promise[T | TResult] = js.native
      def `catch`[TResult](onRejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]], label: String): typings.rsvp.mod.RSVP.Promise[T | TResult] = js.native
      def `catch`[TResult](onRejected: Null, label: String): typings.rsvp.mod.RSVP.Promise[T | TResult] = js.native
      def `catch`[TResult](onRejected: Unit, label: String): typings.rsvp.mod.RSVP.Promise[T | TResult] = js.native
      
      def `finally`[U](): typings.rsvp.mod.RSVP.Promise[T] = js.native
      def `finally`[U](onFinally: U): typings.rsvp.mod.RSVP.Promise[T] = js.native
      def `finally`[U](onFinally: PromiseLike[U]): typings.rsvp.mod.RSVP.Promise[T] = js.native
      
      def `then`[TResult1, TResult2](
        onFulfilled: js.Function1[/* value */ T, TResult1 | PromiseLike[TResult1]],
        onRejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onFulfilled: js.Function1[/* value */ T, TResult1 | PromiseLike[TResult1]],
        onRejected: Null,
        label: String
      ): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onFulfilled: js.Function1[/* value */ T, TResult1 | PromiseLike[TResult1]],
        onRejected: Unit,
        label: String
      ): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onFulfilled: Null,
        onRejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onFulfilled: Null, onRejected: Null, label: String): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onFulfilled: Null, onRejected: Unit, label: String): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onFulfilled: Unit,
        onRejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onFulfilled: Unit, onRejected: Null, label: String): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onFulfilled: Unit, onRejected: Unit, label: String): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      
      @JSName(js.Symbol.toStringTag)
      val toStringTag: typings.rsvp.rsvpStrings.Promise = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.rsvp.mod.RSVP.Resolved[T]
      - typings.rsvp.mod.RSVP.Rejected[scala.Any]
      - typings.rsvp.mod.RSVP.Pending
    */
    type PromiseState[T] = _PromiseState[T] | Rejected[Any]
    
    trait Rejected[T] extends StObject {
      
      var reason: T
      
      var state: typings.rsvp.mod.RSVP.State.rejected
    }
    object Rejected {
      
      inline def apply[T](reason: T, state: typings.rsvp.mod.RSVP.State.rejected): Rejected[T] = {
        val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[Rejected[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Rejected[?], T] (val x: Self & Rejected[T]) extends AnyVal {
        
        inline def setReason(value: T): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setState(value: typings.rsvp.mod.RSVP.State.rejected): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    trait Resolved[T]
      extends StObject
         with _PromiseState[T] {
      
      var state: typings.rsvp.mod.RSVP.State.fulfilled
      
      var value: T
    }
    object Resolved {
      
      inline def apply[T](state: typings.rsvp.mod.RSVP.State.fulfilled, value: T): Resolved[T] = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Resolved[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Resolved[?], T] (val x: Self & Resolved[T]) extends AnyVal {
        
        inline def setState(value: typings.rsvp.mod.RSVP.State.fulfilled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait _PromiseState[T] extends StObject
    object _PromiseState {
      
      inline def Pending(state: pending): typings.rsvp.mod.RSVP.Pending = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.rsvp.mod.RSVP.Pending]
      }
      
      inline def Resolved[T](state: typings.rsvp.mod.RSVP.State.fulfilled, value: T): typings.rsvp.mod.RSVP.Resolved[T] = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.rsvp.mod.RSVP.Resolved[T]]
      }
    }
  }
  
  inline def all[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T]]]
  inline def all[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T]]]
  inline def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]]
  inline def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]]
  inline def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]]
  inline def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]]
  inline def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]]]
  inline def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]]]
  inline def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]]]
  inline def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]]]
  inline def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
  inline def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
  inline def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
  inline def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
  inline def all[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
  inline def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
  inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]]
  inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]]
  inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]]
  inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]]
  
  inline def allSettled[T](entries: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]]]
  inline def allSettled[T](entries: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]]]
  inline def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]]]
  inline def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]]]
  inline def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]]]
  inline def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]]]
  inline def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ]]
  inline def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple7[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple7[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7]
    ]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[
    js.Tuple7[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple7[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7]
    ]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple8[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple8[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8]
    ]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[
    js.Tuple8[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple8[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8]
    ]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]
  ): typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
  ): typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ]]
  inline def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(entries.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ]]
  
  inline def asap[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asap")(callback.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def async[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(callback.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cast(): typings.rsvp.mod.RSVP.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[Unit]]
  inline def cast[T](value: Unit, label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  inline def cast[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  inline def cast[T](value: Arg[T], label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  
  inline def cast_T[T](): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  
  inline def configure[T](name: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(name.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def configure[T](name: String, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defer[T](): Deferred[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Deferred[T]]
  inline def defer[T](label: String): Deferred[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(label.asInstanceOf[js.Any]).asInstanceOf[Deferred[T]]
  
  inline def denodeify[T, A](
    nodeFunc: js.Function2[/* arg1 */ A, /* callback */ js.Function2[/* err */ Any, /* data */ T, Unit], Unit]
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]]]
  inline def denodeify[T, A](
    nodeFunc: js.Function2[/* arg1 */ A, /* callback */ js.Function2[/* err */ Any, /* data */ T, Unit], Unit],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]]]
  inline def denodeify[T, A](
    nodeFunc: js.Function2[/* arg1 */ A, /* callback */ js.Function2[/* err */ Any, /* data */ T, Unit], Unit],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Array[T]]]]
  inline def denodeify[T, A, K1 /* <: String */](
    nodeFunc: js.Function2[/* arg1 */ A, /* callback */ js.Function2[/* err */ Any, /* data */ T, Unit], Unit],
    options: js.Array[K1]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T} */ js.Any
    ]
  ]]
  inline def denodeify[T1, T2, A, K1 /* <: String */, K2 /* <: String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: js.Tuple2[K1, K2]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T1} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T1} */ js.Any
    ]
  ]]
  inline def denodeify[T1, T2, T3, A, K1 /* <: String */, K2 /* <: String */, K3 /* <: String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: js.Tuple3[K1, K2, K3]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T1} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in K1 ]: T1} */ js.Any
    ]
  ]]
  
  inline def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]]]
  inline def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]]]
  inline def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]]]
  
  inline def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]]]
  inline def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]]]
  inline def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]]]
  
  inline def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T]]]
  inline def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T]]]
  inline def filter[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], filterFn: js.Function1[/* item */ T1 | T2, Boolean]): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]]]
  inline def filter[T1, T2](
    entries: js.Tuple2[Arg[T1], Arg[T2]],
    filterFn: js.Function1[/* item */ T1 | T2, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]]]
  inline def filter[T1, T2, T3](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]]]
  inline def filter[T1, T2, T3](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]]]
  inline def filter[T1, T2, T3, T4](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]]]
  inline def filter[T1, T2, T3, T4](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]]]
  inline def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]]]
  inline def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]]]
  inline def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) & `3`] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) & `3`]]
  inline def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) & `3`] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) & `3`]]
  inline def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]]]
  inline def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]]]
  inline def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]]
  inline def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]]
  inline def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]]
  inline def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]]
  inline def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]]
  inline def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(entries.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]]
  
  inline def hash[T](
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>} */ js.Any
  ): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  inline def hash[T](
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>} */ js.Any,
    label: String
  ): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(`object`.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  
  inline def hashSettled[T](
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>} */ js.Any
  ): typings.rsvp.mod.RSVP.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("hashSettled")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>} */ js.Any
  ]]
  inline def hashSettled[T](
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>} */ js.Any,
    label: String
  ): typings.rsvp.mod.RSVP.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSettled")(`object`.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>} */ js.Any
  ]]
  
  inline def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `8`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `8`]]
  inline def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `8`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `8`]]
  inline def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `7`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `7`]]
  inline def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `7`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `7`]]
  inline def map[T1, T2, T3, U](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], mapFn: js.Function1[/* item */ T1 | T2 | T3, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `6`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `6`]]
  inline def map[T1, T2, T3, U](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `6`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `6`]]
  inline def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `5`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `5`]]
  inline def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `5`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `5`]]
  inline def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `4`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `4`]]
  inline def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `4`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `4`]]
  inline def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `3`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `3`]]
  inline def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `3`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `3`]]
  inline def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `2`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `2`]]
  inline def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `2`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `2`]]
  inline def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `1`]]
  inline def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `1`]]
  inline def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `0`]]
  inline def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & `0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & `0`]]
  inline def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & Length] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & Length]]
  inline def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] & Length] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(entries.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[js.Array[U] & Length]]
  
  @JSImport("rsvp", "off")
  @js.native
  val off: js.Function2[
    /* eventName */ String, 
    /* callback */ js.UndefOr[js.Function1[/* value */ Any, Unit]], 
    Unit
  ] = js.native
  
  inline def on(
    eventName: created | chained | fulfilled | rejected,
    listener: js.Function1[/* event */ InstrumentEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: String, callback: js.Function1[/* value */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: error, errorHandler: js.Function1[/* reason */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def race[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  inline def race[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  inline def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[T1 | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2]]
  inline def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2]]
  inline def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3]]
  inline def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3]]
  inline def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4]]
  inline def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4]]
  inline def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5]]
  inline def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5]]
  inline def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6]]
  inline def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6]]
  inline def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7]]
  inline def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7]]
  inline def race[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
  inline def race[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
  inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
  inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
  inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]
  inline def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]
  
  @JSImport("rsvp", "reject")
  @js.native
  val reject: js.Function2[
    /* reason */ js.UndefOr[Any], 
    /* label */ js.UndefOr[String], 
    typings.rsvp.mod.RSVP.Promise[scala.Nothing]
  ] = js.native
  
  inline def resolve(): typings.rsvp.mod.RSVP.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[Unit]]
  inline def resolve[T](value: Unit, label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  inline def resolve[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  inline def resolve[T](value: Arg[T], label: String): typings.rsvp.mod.RSVP.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  
  inline def resolve_T[T](): typings.rsvp.mod.RSVP.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[typings.rsvp.mod.RSVP.Promise[T]]
  
  @JSImport("rsvp", "rethrow")
  @js.native
  val rethrow: js.Function1[/* reason */ Any, Unit] = js.native
}

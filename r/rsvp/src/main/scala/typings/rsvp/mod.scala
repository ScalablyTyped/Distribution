package typings.rsvp

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("rsvp", "default.EventTarget")
    @js.native
    class EventTarget ()
      extends typings.rsvp.mod.RSVP.EventTarget
    object EventTarget {
      
      /** `RSVP.EventTarget.mixin` extends an object with EventTarget methods. */
      /* static member */
      @JSImport("rsvp", "default.EventTarget.mixin")
      @js.native
      def mixin(`object`: js.Object): ObjectWithEventMixins = js.native
      
      /**
        * You can use `off` to stop firing a particular callback for an event.
        *
        * If you don't pass a `callback` argument to `off`, ALL callbacks for the
        * event will not be executed when the event fires.
        */
      /* static member */
      @JSImport("rsvp", "default.EventTarget.off")
      @js.native
      def off(eventName: String): Unit = js.native
      @JSImport("rsvp", "default.EventTarget.off")
      @js.native
      def off(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
      
      /* static member */
      @JSImport("rsvp", "default.EventTarget.on")
      @js.native
      def on(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
      @JSImport("rsvp", "default.EventTarget.on")
      @js.native
      def on_chained(eventName: chained, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
      /** Registers a callback to be executed when `eventName` is triggered */
      /* static member */
      @JSImport("rsvp", "default.EventTarget.on")
      @js.native
      def on_created(eventName: created, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
      /* static member */
      @JSImport("rsvp", "default.EventTarget.on")
      @js.native
      def on_error(eventName: error, errorHandler: js.Function1[/* reason */ js.Any, Unit]): Unit = js.native
      @JSImport("rsvp", "default.EventTarget.on")
      @js.native
      def on_fulfilled(eventName: fulfilled, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
      @JSImport("rsvp", "default.EventTarget.on")
      @js.native
      def on_rejected(eventName: rejected, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
      
      /**
        * Use `trigger` to fire custom events.
        *
        * You can also pass a value as a second argument to `trigger` that will be
        * passed as an argument to all event listeners for the event
        */
      /* static member */
      @JSImport("rsvp", "default.EventTarget.trigger")
      @js.native
      def trigger(eventName: String): Unit = js.native
      @JSImport("rsvp", "default.EventTarget.trigger")
      @js.native
      def trigger(eventName: String, options: js.UndefOr[scala.Nothing], label: String): Unit = js.native
      @JSImport("rsvp", "default.EventTarget.trigger")
      @js.native
      def trigger(eventName: String, options: js.Any): Unit = js.native
      @JSImport("rsvp", "default.EventTarget.trigger")
      @js.native
      def trigger(eventName: String, options: js.Any, label: String): Unit = js.native
    }
    
    @JSImport("rsvp", "default.Promise")
    @js.native
    class Promise[T] protected ()
      extends typings.rsvp.mod.RSVP.Promise[T]
         with Instantiable1[
              /* executor */ js.Function2[
                /* resolve */ js.Function1[/* value */ js.UndefOr[Arg[js.Object]], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ], 
              typings.rsvp.mod.RSVP.Promise[js.Object]
            ] {
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ js.UndefOr[Arg[T]], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ]) = this()
      def this(
        executor: js.Function2[
                /* resolve */ js.Function1[/* value */ js.UndefOr[Arg[T]], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ],
        label: String
      ) = this()
    }
    object Promise {
      
      /* static member */
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5, T6, T7, T8](
        values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
        values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
        values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
      ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
      @JSImport("rsvp", "default.Promise.all")
      @js.native
      def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
        values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
      
      /* static member */
      /* was `typeof RSVP.Promise.resolve` */
      @JSImport("rsvp", "default.Promise.cast")
      @js.native
      def cast(): typings.rsvp.mod.RSVP.Promise[Unit] = js.native
      @JSImport("rsvp", "default.Promise.cast")
      @js.native
      def cast[T](value: js.UndefOr[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = js.native
      @JSImport("rsvp", "default.Promise.cast")
      @js.native
      def cast[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = js.native
      /* static member */
      /* was `typeof RSVP.Promise.resolve` */
      @JSImport("rsvp", "default.Promise.cast")
      @js.native
      def cast_T[T](): typings.rsvp.mod.RSVP.Promise[T] = js.native
      
      /* static member */
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[T] = js.native
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4, T5, T6, T7, T8](
        values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
      @JSImport("rsvp", "default.Promise.race")
      @js.native
      def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
        values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.race")
      @js.native
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
              T10 | js.Thenable[T10]
            ]
      ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
      @JSImport("rsvp", "default.Promise.race")
      @js.native
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
              T10 | js.Thenable[T10]
            ],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
      
      /* static member */
      @JSImport("rsvp", "default.Promise.reject")
      @js.native
      def reject(): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
      @JSImport("rsvp", "default.Promise.reject")
      @js.native
      def reject(reason: js.UndefOr[scala.Nothing], label: String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
      @JSImport("rsvp", "default.Promise.reject")
      @js.native
      def reject(reason: js.Any): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
      @JSImport("rsvp", "default.Promise.reject")
      @js.native
      def reject(reason: js.Any, label: String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
      
      /* static member */
      @JSImport("rsvp", "default.Promise.resolve")
      @js.native
      def resolve(): typings.rsvp.mod.RSVP.Promise[Unit] = js.native
      @JSImport("rsvp", "default.Promise.resolve")
      @js.native
      def resolve[T](value: js.UndefOr[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = js.native
      @JSImport("rsvp", "default.Promise.resolve")
      @js.native
      def resolve[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = js.native
      /* static member */
      @JSImport("rsvp", "default.Promise.resolve")
      @js.native
      def resolve_T[T](): typings.rsvp.mod.RSVP.Promise[T] = js.native
    }
    
    // RSVP supplies status for promises in certain places.
    @JSImport("rsvp", "default.State")
    @js.native
    object State extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.rsvp.mod.RSVP.State with String] = js.native
      
      /* "fulfilled" */ val fulfilled: typings.rsvp.mod.RSVP.State.fulfilled with String = js.native
      
      /* "pending" */ val pending: typings.rsvp.mod.RSVP.State.pending with String = js.native
      
      /* "rejected" */ val rejected: typings.rsvp.mod.RSVP.State.rejected with String = js.native
    }
    
    /* static member */
    /* was `typeof Promise.all` */
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
    /* static member */
    /* was `typeof Promise.all` */
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
    /* static member */
    /* was `typeof Promise.all` */
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
    /* static member */
    /* was `typeof Promise.all` */
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    /* static member */
    /* was `typeof Promise.all` */
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    /* static member */
    /* was `typeof Promise.all` */
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    /* static member */
    /* was `typeof Promise.all` */
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    /* static member */
    /* was `typeof Promise.all` */
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    /* static member */
    /* was `typeof Promise.all` */
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    /* static member */
    /* was `typeof Promise.all` */
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    @JSImport("rsvp", "default.all")
    @js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T](entries: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T](entries: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[
        js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[
        js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[
        js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[
        js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[
        js.Tuple6[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6]
        ]
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[
        js.Tuple6[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6]
        ]
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[
        js.Tuple7[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7]
        ]
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[
        js.Tuple7[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7]
        ]
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[
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
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
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
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
      ] = js.native
    @JSImport("rsvp", "default.allSettled")
    @js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
      ] = js.native
    
    @JSImport("rsvp", "default.asap")
    @js.native
    def asap[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
    
    /* was `typeof asap` */
    @JSImport("rsvp", "default.async")
    @js.native
    def async[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
    
    /**
      * @deprecated
      */
    /* static member */
    /* was `typeof Promise.cast` */
    @JSImport("rsvp", "default.cast")
    @js.native
    def cast(): typings.rsvp.mod.RSVP.Promise[Unit] = js.native
    /**
      * @deprecated
      */
    /* static member */
    /* was `typeof Promise.cast` */
    @JSImport("rsvp", "default.cast")
    @js.native
    def cast[T](value: js.UndefOr[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = js.native
    /**
      * @deprecated
      */
    /* static member */
    /* was `typeof Promise.cast` */
    @JSImport("rsvp", "default.cast")
    @js.native
    def cast[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = js.native
    /**
      * @deprecated
      */
    /* static member */
    /* was `typeof Promise.cast` */
    @JSImport("rsvp", "default.cast")
    @js.native
    def cast_T[T](): typings.rsvp.mod.RSVP.Promise[T] = js.native
    
    @JSImport("rsvp", "default.configure")
    @js.native
    def configure[T](name: String): T = js.native
    @JSImport("rsvp", "default.configure")
    @js.native
    def configure[T](name: String, value: T): Unit = js.native
    
    @JSImport("rsvp", "default.defer")
    @js.native
    def defer[T](): Deferred[T] = js.native
    @JSImport("rsvp", "default.defer")
    @js.native
    def defer[T](label: String): Deferred[T] = js.native
    
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify[T, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
          Unit
        ]
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]] = js.native
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify[T, A, K1 /* <: String */](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
          Unit
        ],
      options: js.Array[K1]
    ): js.Function1[
        /* arg1 */ A, 
        typings.rsvp.mod.RSVP.Promise[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in K1 ]: T}
      */ typings.rsvp.rsvpStrings.denodeify with TopLevel[js.Any]
        ]
      ] = js.native
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify[T1, T2, A, K1 /* <: String */, K2 /* <: String */](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ],
      options: js.Tuple2[K1, K2]
    ): js.Function1[
        /* arg1 */ A, 
        typings.rsvp.mod.RSVP.Promise[typings.rsvp.rsvpStrings.denodeify with TopLevel[js.Any]]
      ] = js.native
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify[T1, T2, T3, A, K1 /* <: String */, K2 /* <: String */, K3 /* <: String */](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ],
      options: js.Tuple3[K1, K2, K3]
    ): js.Function1[
        /* arg1 */ A, 
        typings.rsvp.mod.RSVP.Promise[typings.rsvp.rsvpStrings.denodeify with TopLevel[js.Any]]
      ] = js.native
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify_T1T2A[T1, T2, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ]
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
    // ----- denodeify ----- //
    // Here be absurd things because we don't have variadic types. All of
    // this will go away if we can ever write this:
    //
    //     denodeify<...T, ...A>(
    //         nodeFunc: (...args: ...A, callback: (err: any, ...cbArgs: ...T) => any) => void,
    //         options?: false
    //     ): (...args: ...A) => RSVP.Promise<...T>
    // That day, however, may never come. So, in the meantime, we do this.
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify_T1T2T3A[T1, T2, T3, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ]
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify_false[T, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
          Unit
        ],
      options: `false`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]] = js.native
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify_false_T1T2A[T1, T2, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ],
      options: `false`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify_false_T1T2T3A[T1, T2, T3, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ],
      options: `false`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify_true[T, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
          Unit
        ],
      options: `true`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Array[T]]] = js.native
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify_true_T1T2A[T1, T2, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ],
      options: `true`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]] = js.native
    @JSImport("rsvp", "default.denodeify")
    @js.native
    def denodeify_true_T1T2T3A[T1, T2, T3, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ],
      options: `true`
    ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]] = js.native
    
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], filterFn: js.Function1[/* item */ T1 | T2, Boolean]): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2](
      entries: js.Tuple2[Arg[T1], Arg[T2]],
      filterFn: js.Function1[/* item */ T1 | T2, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3](
      entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3](
      entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5, T6](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with `3`] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5, T6](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with `3`] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5, T6, T7](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5, T6, T7](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
    @JSImport("rsvp", "default.filter")
    @js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
    
    // ----- hash and hashSettled ----- //
    @JSImport("rsvp", "default.hash")
    @js.native
    def hash[T](
      `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
      */ typings.rsvp.rsvpStrings.hash with TopLevel[T]
    ): typings.rsvp.mod.RSVP.Promise[T] = js.native
    @JSImport("rsvp", "default.hash")
    @js.native
    def hash[T](
      `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
      */ typings.rsvp.rsvpStrings.hash with TopLevel[T],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[T] = js.native
    
    @JSImport("rsvp", "default.hashSettled")
    @js.native
    def hashSettled[T](
      `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
      */ typings.rsvp.rsvpStrings.hashSettled with TopLevel[T]
    ): typings.rsvp.mod.RSVP.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
      */ typings.rsvp.rsvpStrings.hashSettled with TopLevel[T]
      ] = js.native
    @JSImport("rsvp", "default.hashSettled")
    @js.native
    def hashSettled[T](
      `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
      */ typings.rsvp.rsvpStrings.hashSettled with TopLevel[T],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
      */ typings.rsvp.rsvpStrings.hashSettled with TopLevel[T]
      ] = js.native
    
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `8`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `8`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `7`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `7`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, U](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], mapFn: js.Function1[/* item */ T1 | T2 | T3, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `6`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, U](
      entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `6`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, U](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `5`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, U](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `5`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, U](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `4`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, U](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `4`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, T6, U](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `3`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, T6, U](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `3`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, T6, T7, U](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `2`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, T6, T7, U](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `2`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `1`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `1`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `0`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `0`] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U]
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with Length] = js.native
    @JSImport("rsvp", "default.map")
    @js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with Length] = js.native
    
    /**
      * You can use `off` to stop firing a particular callback for an event.
      *
      * If you don't pass a `callback` argument to `off`, ALL callbacks for the
      * event will not be executed when the event fires.
      */
    /* static member */
    /* was `typeof EventTarget.off` */
    @JSImport("rsvp", "default.off")
    @js.native
    def off(eventName: String): Unit = js.native
    @JSImport("rsvp", "default.off")
    @js.native
    def off(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    
    /* static member */
    /* was `typeof EventTarget.on` */
    @JSImport("rsvp", "default.on")
    @js.native
    def on(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    @JSImport("rsvp", "default.on")
    @js.native
    def on_chained(eventName: chained, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    /** Registers a callback to be executed when `eventName` is triggered */
    /* static member */
    /* was `typeof EventTarget.on` */
    @JSImport("rsvp", "default.on")
    @js.native
    def on_created(eventName: created, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    /* static member */
    /* was `typeof EventTarget.on` */
    @JSImport("rsvp", "default.on")
    @js.native
    def on_error(eventName: error, errorHandler: js.Function1[/* reason */ js.Any, Unit]): Unit = js.native
    @JSImport("rsvp", "default.on")
    @js.native
    def on_fulfilled(eventName: fulfilled, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    @JSImport("rsvp", "default.on")
    @js.native
    def on_rejected(eventName: rejected, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    
    /* static member */
    /* was `typeof Promise.race` */
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[T] = js.native
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = js.native
    /* static member */
    /* was `typeof Promise.race` */
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
    /* static member */
    /* was `typeof Promise.race` */
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
    /* static member */
    /* was `typeof Promise.race` */
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
    /* static member */
    /* was `typeof Promise.race` */
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
    /* static member */
    /* was `typeof Promise.race` */
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    /* static member */
    /* was `typeof Promise.race` */
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    /* static member */
    /* was `typeof Promise.race` */
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    /* static member */
    /* was `typeof Promise.race` */
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    @JSImport("rsvp", "default.race")
    @js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    /* static member */
    /* was `typeof Promise.race` */
    @JSImport("rsvp", "default.race")
    @js.native
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
          T10 | js.Thenable[T10]
        ]
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    @JSImport("rsvp", "default.race")
    @js.native
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
          T10 | js.Thenable[T10]
        ],
      label: String
    ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    
    /* static member */
    /* was `typeof Promise.reject` */
    @JSImport("rsvp", "default.reject")
    @js.native
    def reject(): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    @JSImport("rsvp", "default.reject")
    @js.native
    def reject(reason: js.UndefOr[scala.Nothing], label: String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    @JSImport("rsvp", "default.reject")
    @js.native
    def reject(reason: js.Any): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    @JSImport("rsvp", "default.reject")
    @js.native
    def reject(reason: js.Any, label: String): typings.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    
    /* static member */
    /* was `typeof Promise.resolve` */
    @JSImport("rsvp", "default.resolve")
    @js.native
    def resolve(): typings.rsvp.mod.RSVP.Promise[Unit] = js.native
    @JSImport("rsvp", "default.resolve")
    @js.native
    def resolve[T](value: js.UndefOr[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = js.native
    @JSImport("rsvp", "default.resolve")
    @js.native
    def resolve[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = js.native
    /* static member */
    /* was `typeof Promise.resolve` */
    @JSImport("rsvp", "default.resolve")
    @js.native
    def resolve_T[T](): typings.rsvp.mod.RSVP.Promise[T] = js.native
    
    @JSImport("rsvp", "default.rethrow")
    @js.native
    def rethrow(reason: js.Any): Unit = js.native
  }
  
  @JSImport("rsvp", "EventTarget")
  @js.native
  val EventTarget: TypeofEventTarget with Instantiable0[typings.rsvp.mod.RSVP.EventTarget] = js.native
  type EventTarget = typings.rsvp.mod.RSVP.EventTarget
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rsvp", "EventTarget")
  @js.native
  class EventTargetCls ()
    extends typings.rsvp.mod.RSVP.EventTarget
  
  @JSImport("rsvp", "Promise")
  @js.native
  val Promise: TypeofPromise with (Instantiable2[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[
        /* value */ js.UndefOr[Arg[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ], 
    /* label */ js.UndefOr[String], 
    typings.rsvp.mod.RSVP.Promise[js.Object]
  ]) = js.native
  type Promise[T] = typings.rsvp.mod.RSVP.Promise[T]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rsvp", "Promise")
  @js.native
  class PromiseCls[T] protected ()
    extends typings.rsvp.mod.RSVP.Promise[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[
              /* value */ js.UndefOr[Arg[/* import warning: RewrittenClass.unapply cls was tparam T */ _]], 
              Unit
            ], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
    def this(
      executor: js.Function2[
            /* resolve */ js.Function1[
              /* value */ js.UndefOr[Arg[/* import warning: RewrittenClass.unapply cls was tparam T */ _]], 
              Unit
            ], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
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
      sealed trait fulfilled extends State
      
      @js.native
      sealed trait pending extends State
      
      @js.native
      sealed trait rejected extends State
    }
    
    // All the Promise methods essentially flatten existing promises, so that
    // you don't end up with `Promise<Promise<Promise<string>>>` if you happen
    // to return another `Promise` from a `.then()` invocation, etc. So all of
    // them can take a type or a promise-like/then-able type.
    type Arg[T] = T | js.Thenable[T]
    
    @js.native
    trait Deferred[T] extends StObject {
      
      var promise: typings.rsvp.mod.RSVP.Promise[T] = js.native
      
      def reject(): Unit = js.native
      def reject(reason: js.Any): Unit = js.native
      
      def resolve(): Unit = js.native
      def resolve(value: Arg[T]): Unit = js.native
    }
    
    @js.native
    trait EventTarget extends StObject
    
    @js.native
    trait InstrumentEvent extends StObject {
      
      // guid of promise. Must be globally unique, not just within the implementation
      var childGuid: String = js.native
      
      // one of ['created', 'chained', 'fulfilled', 'rejected']
      var detail: js.Any = js.native
      
      // child of child promise (for chained via `then`)
      var eventName: String = js.native
      
      var guid: String = js.native
      
      // fulfillment value or rejection reason, if applicable
      var label: String = js.native
      
      // label passed to promise's constructor
      var timeStamp: Double = js.native
    }
    object InstrumentEvent {
      
      @scala.inline
      def apply(
        childGuid: String,
        detail: js.Any,
        eventName: String,
        guid: String,
        label: String,
        timeStamp: Double
      ): InstrumentEvent = {
        val __obj = js.Dynamic.literal(childGuid = childGuid.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[InstrumentEvent]
      }
      
      @scala.inline
      implicit class InstrumentEventMutableBuilder[Self <: InstrumentEvent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildGuid(value: String): Self = StObject.set(x, "childGuid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetail(value: js.Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ObjectWithEventMixins extends StObject {
      
      def off(eventName: String): Unit = js.native
      def off(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
      
      def on(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
      @JSName("on")
      def on_chained(eventName: chained, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
      @JSName("on")
      def on_created(eventName: created, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
      @JSName("on")
      def on_error(eventName: error, errorHandler: js.Function1[/* reason */ js.Any, Unit]): Unit = js.native
      @JSName("on")
      def on_fulfilled(eventName: fulfilled, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
      @JSName("on")
      def on_rejected(eventName: rejected, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
      
      def trigger(eventName: String): Unit = js.native
      def trigger(eventName: String, options: js.UndefOr[scala.Nothing], label: String): Unit = js.native
      def trigger(eventName: String, options: js.Any): Unit = js.native
      def trigger(eventName: String, options: js.Any, label: String): Unit = js.native
    }
    
    @js.native
    trait Pending
      extends _PromiseState[js.Any] {
      
      var state: pending = js.native
    }
    object Pending {
      
      @scala.inline
      def apply(state: pending): Pending = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[Pending]
      }
      
      @scala.inline
      implicit class PendingMutableBuilder[Self <: Pending] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setState(value: pending): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Promise[T] extends PromiseLike[T] {
      
      def `catch`[TResult](): typings.rsvp.mod.RSVP.Promise[T | TResult] = js.native
      def `catch`[TResult](onRejected: js.UndefOr[scala.Nothing], label: String): typings.rsvp.mod.RSVP.Promise[T | TResult] = js.native
      def `catch`[TResult](onRejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): typings.rsvp.mod.RSVP.Promise[T | TResult] = js.native
      def `catch`[TResult](onRejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]], label: String): typings.rsvp.mod.RSVP.Promise[T | TResult] = js.native
      def `catch`[TResult](onRejected: Null, label: String): typings.rsvp.mod.RSVP.Promise[T | TResult] = js.native
      
      def `finally`[U](): typings.rsvp.mod.RSVP.Promise[T] = js.native
      def `finally`[U](onFinally: U): typings.rsvp.mod.RSVP.Promise[T] = js.native
      def `finally`[U](onFinally: js.Thenable[U]): typings.rsvp.mod.RSVP.Promise[T] = js.native
      
      def `then`[TResult1, TResult2](onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.UndefOr[scala.Nothing], label: String): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onFulfilled: js.UndefOr[scala.Nothing],
        onRejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onFulfilled: js.UndefOr[scala.Nothing], onRejected: Null, label: String): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onFulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
        onRejected: js.UndefOr[scala.Nothing],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onFulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
        onRejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onFulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
        onRejected: Null,
        label: String
      ): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onFulfilled: Null, onRejected: js.UndefOr[scala.Nothing], label: String): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onFulfilled: Null,
        onRejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]],
        label: String
      ): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onFulfilled: Null, onRejected: Null, label: String): typings.rsvp.mod.RSVP.Promise[TResult1 | TResult2] = js.native
      
      @JSName(js.Symbol.toStringTag)
      val toStringTag: typings.rsvp.rsvpStrings.Promise = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.rsvp.mod.RSVP.Resolved[T]
      - typings.rsvp.mod.RSVP.Rejected[js.Any]
      - typings.rsvp.mod.RSVP.Pending
    */
    type PromiseState[T] = _PromiseState[T] | Rejected[js.Any]
    
    @js.native
    trait Rejected[T] extends StObject {
      
      var reason: T = js.native
      
      var state: typings.rsvp.mod.RSVP.State.rejected = js.native
    }
    object Rejected {
      
      @scala.inline
      def apply[T](reason: T, state: typings.rsvp.mod.RSVP.State.rejected): Rejected[T] = {
        val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[Rejected[T]]
      }
      
      @scala.inline
      implicit class RejectedMutableBuilder[Self <: Rejected[_], T] (val x: Self with Rejected[T]) extends AnyVal {
        
        @scala.inline
        def setReason(value: T): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setState(value: typings.rsvp.mod.RSVP.State.rejected): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Resolved[T] extends _PromiseState[T] {
      
      var state: typings.rsvp.mod.RSVP.State.fulfilled = js.native
      
      var value: T = js.native
    }
    object Resolved {
      
      @scala.inline
      def apply[T](state: typings.rsvp.mod.RSVP.State.fulfilled, value: T): Resolved[T] = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Resolved[T]]
      }
      
      @scala.inline
      implicit class ResolvedMutableBuilder[Self <: Resolved[_], T] (val x: Self with Resolved[T]) extends AnyVal {
        
        @scala.inline
        def setState(value: typings.rsvp.mod.RSVP.State.fulfilled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait _PromiseState[T] extends StObject
    object _PromiseState {
      
      @scala.inline
      def Pending(state: pending): typings.rsvp.mod.RSVP.Pending = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.rsvp.mod.RSVP.Pending]
      }
      
      @scala.inline
      def Resolved[T](state: typings.rsvp.mod.RSVP.State.fulfilled, value: T): typings.rsvp.mod.RSVP.Resolved[T] = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.rsvp.mod.RSVP.Resolved[T]]
      }
    }
  }
  
  @JSImport("rsvp", "all")
  @js.native
  def all[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  @JSImport("rsvp", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T](entries: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T](entries: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[
    js.Tuple7[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7]
    ]
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[
    js.Tuple7[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7]
    ]
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[
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
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
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
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
  ] = js.native
  @JSImport("rsvp", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
  ] = js.native
  
  @JSImport("rsvp", "asap")
  @js.native
  def asap[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
  
  @JSImport("rsvp", "async")
  @js.native
  def async[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
  
  @JSImport("rsvp", "cast")
  @js.native
  def cast(): typings.rsvp.mod.RSVP.Promise[Unit] = js.native
  @JSImport("rsvp", "cast")
  @js.native
  def cast[T](value: js.UndefOr[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = js.native
  @JSImport("rsvp", "cast")
  @js.native
  def cast[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = js.native
  @JSImport("rsvp", "cast")
  @js.native
  def cast_T[T](): typings.rsvp.mod.RSVP.Promise[T] = js.native
  
  @JSImport("rsvp", "configure")
  @js.native
  def configure[T](name: String): T = js.native
  @JSImport("rsvp", "configure")
  @js.native
  def configure[T](name: String, value: T): Unit = js.native
  
  @JSImport("rsvp", "defer")
  @js.native
  def defer[T](): Deferred[T] = js.native
  @JSImport("rsvp", "defer")
  @js.native
  def defer[T](label: String): Deferred[T] = js.native
  
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]] = js.native
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T]] = js.native
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Array[T]]] = js.native
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify[T, A, K1 /* <: String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: js.Array[K1]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in K1 ]: T}
    */ typings.rsvp.rsvpStrings.apply with TopLevel[js.Any]
    ]
  ] = js.native
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify[T1, T2, A, K1 /* <: String */, K2 /* <: String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: js.Tuple2[K1, K2]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[typings.rsvp.rsvpStrings.apply with TopLevel[js.Any]]
  ] = js.native
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify[T1, T2, T3, A, K1 /* <: String */, K2 /* <: String */, K3 /* <: String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: js.Tuple3[K1, K2, K3]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.mod.RSVP.Promise[typings.rsvp.rsvpStrings.apply with TopLevel[js.Any]]
  ] = js.native
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]] = js.native
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[T1]] = js.native
  @JSImport("rsvp", "denodeify")
  @js.native
  def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]] = js.native
  
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean]): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], filterFn: js.Function1[/* item */ T1 | T2, Boolean]): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2](
    entries: js.Tuple2[Arg[T1], Arg[T2]],
    filterFn: js.Function1[/* item */ T1 | T2, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with `3`] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with `3`] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
  @JSImport("rsvp", "filter")
  @js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
  
  @JSImport("rsvp", "hash")
  @js.native
  def hash[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typings.rsvp.rsvpStrings.apply with TopLevel[T]
  ): typings.rsvp.mod.RSVP.Promise[T] = js.native
  @JSImport("rsvp", "hash")
  @js.native
  def hash[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typings.rsvp.rsvpStrings.apply with TopLevel[T],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[T] = js.native
  
  @JSImport("rsvp", "hashSettled")
  @js.native
  def hashSettled[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typings.rsvp.rsvpStrings.apply with TopLevel[T]
  ): typings.rsvp.mod.RSVP.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
    */ typings.rsvp.rsvpStrings.apply with TopLevel[T]
  ] = js.native
  @JSImport("rsvp", "hashSettled")
  @js.native
  def hashSettled[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typings.rsvp.rsvpStrings.apply with TopLevel[T],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
    */ typings.rsvp.rsvpStrings.apply with TopLevel[T]
  ] = js.native
  
  @JSImport("rsvp", "map")
  @js.native
  def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `8`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `8`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `7`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U], label: String): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `7`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, U](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], mapFn: js.Function1[/* item */ T1 | T2 | T3, U]): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `6`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, U](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `6`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `5`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `5`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `4`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `4`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `3`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `3`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `2`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `2`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `1`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `1`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `0`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with `0`] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U]
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with Length] = js.native
  @JSImport("rsvp", "map")
  @js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[js.Array[U] with Length] = js.native
  
  @JSImport("rsvp", "off")
  @js.native
  val off: js.Function2[
    /* eventName */ String, 
    /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, Unit]], 
    Unit
  ] = js.native
  
  @JSImport("rsvp", "on")
  @js.native
  def on(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  @JSImport("rsvp", "on")
  @js.native
  def on(eventName: chained, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  @JSImport("rsvp", "on")
  @js.native
  def on(eventName: created, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  @JSImport("rsvp", "on")
  @js.native
  def on(eventName: error, errorHandler: js.Function1[/* reason */ js.Any, Unit]): Unit = js.native
  @JSImport("rsvp", "on")
  @js.native
  def on(eventName: fulfilled, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  @JSImport("rsvp", "on")
  @js.native
  def on(eventName: rejected, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  
  @JSImport("rsvp", "race")
  @js.native
  def race[T](values: js.Array[Arg[T]]): typings.rsvp.mod.RSVP.Promise[T] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T](values: js.Array[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  @JSImport("rsvp", "race")
  @js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  @JSImport("rsvp", "race")
  @js.native
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
      T10 | js.Thenable[T10]
    ]
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  @JSImport("rsvp", "race")
  @js.native
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
      T10 | js.Thenable[T10]
    ],
    label: String
  ): typings.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  
  @JSImport("rsvp", "reject")
  @js.native
  val reject: js.Function2[
    /* reason */ js.UndefOr[js.Any], 
    /* label */ js.UndefOr[String], 
    typings.rsvp.mod.RSVP.Promise[scala.Nothing]
  ] = js.native
  
  @JSImport("rsvp", "resolve")
  @js.native
  def resolve(): typings.rsvp.mod.RSVP.Promise[Unit] = js.native
  @JSImport("rsvp", "resolve")
  @js.native
  def resolve[T](value: js.UndefOr[Arg[T]], label: String): typings.rsvp.mod.RSVP.Promise[T] = js.native
  @JSImport("rsvp", "resolve")
  @js.native
  def resolve[T](value: Arg[T]): typings.rsvp.mod.RSVP.Promise[T] = js.native
  @JSImport("rsvp", "resolve")
  @js.native
  def resolve_T[T](): typings.rsvp.mod.RSVP.Promise[T] = js.native
  
  @JSImport("rsvp", "rethrow")
  @js.native
  val rethrow: js.Function1[/* reason */ js.Any, Unit] = js.native
}

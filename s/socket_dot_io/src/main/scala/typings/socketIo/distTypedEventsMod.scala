package typings.socketIo

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.socketIo.socketIoStrings.clear
import typings.socketIo.socketIoStrings.delete
import typings.socketIo.socketIoStrings.entries
import typings.socketIo.socketIoStrings.forEach
import typings.socketIo.socketIoStrings.get
import typings.socketIo.socketIoStrings.has
import typings.socketIo.socketIoStrings.keys
import typings.socketIo.socketIoStrings.set
import typings.socketIo.socketIoStrings.size
import typings.socketIo.socketIoStrings.values
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypedEventsMod {
  
  /* note: abstract class */ @JSImport("socket.io/dist/typed-events", "StrictEventEmitter")
  @js.native
  open class StrictEventEmitter[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ReservedEvents /* <: EventsMap */] ()
    extends EventEmitter
       with TypedEventBroadcaster[EmitEvents] {
    def this(options: EventEmitterOptions) = this()
    
    /* CompleteClass */
    override def emit[Ev /* <: EventNames[EmitEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, Ev> is not an array type */ args: EventParams[EmitEvents, Ev]
    ): Boolean = js.native
    
    /**
      * Emits a reserved event.
      *
      * This method is `protected`, so that only a class extending
      * `StrictEventEmitter` can emit its own reserved events.
      *
      * @param ev Reserved event name
      * @param args Arguments to emit along with the event
      */
    /* protected */ def emitReserved[Ev /* <: EventNames[ReservedEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<ReservedEvents, Ev> is not an array type */ args: EventParams[ReservedEvents, Ev]
    ): Boolean = js.native
    
    /**
      * Emits an event.
      *
      * This method is `protected`, so that only a class extending
      * `StrictEventEmitter` can get around the strict typing. This is useful for
      * calling `emit.apply`, which can be called as `emitUntyped.apply`.
      *
      * @param ev Event name
      * @param args Arguments to emit along with the event
      */
    /* protected */ def emitUntyped(ev: String, args: Any*): Boolean = js.native
    
    /**
      * Returns the listeners listening to an event.
      *
      * @param event Event name
      * @returns Array of listeners subscribed to `event`
      */
    def listeners[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](event: Ev): js.Array[ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]] = js.native
    
    /**
      * Adds the `listener` function as an event listener for `ev`.
      *
      * @param ev Name of the event
      * @param listener Callback function
      */
    def on[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
    
    /**
      * Adds a one-time `listener` function as an event listener for `ev`.
      *
      * @param ev Name of the event
      * @param listener Callback function
      */
    def once[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [...infer H, infer L] ? H : std.Array<any>
    }}}
    */
  type AllButLast[T /* <: js.Array[Any] */] = js.Array[Any]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof E ]: E[K] extends (args : infer Params): infer Result? (args : socket.io.socket.io/dist/typed-events.PrependTimeoutError<Params>): Result : E[K]}
    }}}
    */
  @js.native
  trait DecorateAcknowledgements[E] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof E ]: E[K] extends (args : infer Params): infer Result? (args : socket.io.socket.io/dist/typed-events.ExpectMultipleResponses<Params>): Result : E[K]}
    }}}
    */
  @js.native
  trait DecorateAcknowledgementsWithMultipleResponses[E] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof E ]: E[K] extends (args : infer Params): infer Result? (args : socket.io.socket.io/dist/typed-events.ExpectMultipleResponses<socket.io.socket.io/dist/typed-events.PrependTimeoutError<Params>>): Result : E[K]}
    }}}
    */
  @js.native
  trait DecorateAcknowledgementsWithTimeoutAndMultipleResponses[E] extends StObject
  
  type DefaultEventsMap = StringDictionary[js.Function1[/* repeated */ Any, Unit]]
  
  type EventNames[Map /* <: EventsMap */] = (String & (/* keyof Map */ clear | delete | forEach | get | has | set | size | entries | keys | values)) | (js.Symbol & (/* keyof Map */ clear | delete | forEach | get | has | set | size | entries | keys | values))
  
  type EventParams[Map /* <: EventsMap */, Ev /* <: EventNames[Map] */] = Parameters[
    /* import warning: importer.ImportType#apply Failed type conversion: Map[Ev] */ js.Any
  ]
  
  type EventsMap = StringDictionary[Any]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] extends (err : std.Error, arg : infer Param): infer Result? (err : std.Error, arg : std.Array<Param>): Result : T[K]}
    }}}
    */
  @js.native
  trait ExpectMultipleResponses[T /* <: js.Array[Any] */] extends StObject
  
  /**
    * Returns an untyped listener type if `T` is `never`; otherwise, returns `T`.
    *
    * This is a hack to mitigate https://github.com/socketio/socket.io/issues/3833.
    * Needed because of https://github.com/microsoft/TypeScript/issues/41778
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [never] ? (args : ...any): void | std.Promise<void> : T
    }}}
    */
  type FallbackToUntypedListener[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (arg : infer Param): infer Result ? Param : any
    }}}
    */
  @js.native
  trait FirstArg[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends [...infer H, infer L] ? L : any
    }}}
    */
  @js.native
  trait Last[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] extends (args : infer Params): infer Result? (err : std.Error, args : Params): Result : T[K]}
    }}}
    */
  @js.native
  trait PrependTimeoutError[T /* <: js.Array[Any] */] extends StObject
  
  type ReservedOrUserEventNames[ReservedEventsMap /* <: EventsMap */, UserEvents /* <: EventsMap */] = EventNames[ReservedEventsMap | UserEvents]
  
  type ReservedOrUserListener[ReservedEvents /* <: EventsMap */, UserEvents /* <: EventsMap */, Ev /* <: ReservedOrUserEventNames[ReservedEvents, UserEvents] */] = FallbackToUntypedListener[
    /* import warning: importer.ImportType#apply Failed type conversion: Ev extends socket.io.socket.io/dist/typed-events.EventNames<ReservedEvents> ? ReservedEvents[Ev] : Ev extends socket.io.socket.io/dist/typed-events.EventNames<UserEvents> ? UserEvents[Ev] : never */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (err : std.Error, arg : infer Param): infer Result ? Param : any
    }}}
    */
  @js.native
  trait SecondArg[T] extends StObject
  
  trait TypedEventBroadcaster[EmitEvents /* <: EventsMap */] extends StObject {
    
    def emit[Ev /* <: EventNames[EmitEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, Ev> is not an array type */ args: EventParams[EmitEvents, Ev]
    ): Boolean
  }
  object TypedEventBroadcaster {
    
    inline def apply[EmitEvents /* <: EventsMap */](emit: (Any, EventParams[EmitEvents, Any]) => Boolean): TypedEventBroadcaster[EmitEvents] = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit))
      __obj.asInstanceOf[TypedEventBroadcaster[EmitEvents]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypedEventBroadcaster[?], EmitEvents /* <: EventsMap */] (val x: Self & TypedEventBroadcaster[EmitEvents]) extends AnyVal {
      
      inline def setEmit(value: (Any, EventParams[EmitEvents, Any]) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    }
  }
}

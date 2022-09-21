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

object typedEventsMod {
  
  @JSImport("socket.io/dist/typed-events", "StrictEventEmitter")
  @js.native
  abstract class StrictEventEmitter[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ReservedEvents /* <: EventsMap */] ()
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
  
  type DefaultEventsMap = StringDictionary[js.Function1[/* repeated */ Any, Unit]]
  
  type EventNames[Map /* <: EventsMap */] = (String & (/* keyof Map */ clear | delete | forEach | get | has | set | size | entries | keys | values)) | (js.Symbol & (/* keyof Map */ clear | delete | forEach | get | has | set | size | entries | keys | values))
  
  type EventParams[Map /* <: EventsMap */, Ev /* <: EventNames[Map] */] = Parameters[
    /* import warning: importer.ImportType#apply Failed type conversion: Map[Ev] */ js.Any
  ]
  
  type EventsMap = StringDictionary[Any]
  
  /**
    * Returns an untyped listener type if `T` is `never`; otherwise, returns `T`.
    *
    * This is a hack to mitigate https://github.com/socketio/socket.io/issues/3833.
    * Needed because of https://github.com/microsoft/TypeScript/issues/41778
    */
  type FallbackToUntypedListener[T] = T | (js.Function1[/* repeated */ Any, Unit | js.Promise[Unit]])
  
  type ReservedOrUserEventNames[ReservedEventsMap /* <: EventsMap */, UserEvents /* <: EventsMap */] = EventNames[ReservedEventsMap | UserEvents]
  
  type ReservedOrUserListener[ReservedEvents /* <: EventsMap */, UserEvents /* <: EventsMap */, Ev /* <: ReservedOrUserEventNames[ReservedEvents, UserEvents] */] = FallbackToUntypedListener[
    /* import warning: importer.ImportType#apply Failed type conversion: UserEvents[Ev] */ js.Any
  ]
  
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
    
    extension [Self <: TypedEventBroadcaster[?], EmitEvents /* <: EventsMap */](x: Self & TypedEventBroadcaster[EmitEvents]) {
      
      inline def setEmit(value: (Any, EventParams[EmitEvents, Any]) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    }
  }
}

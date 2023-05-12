package typings.socketIoComponentEmitter

import org.scalablytyped.runtime.StringDictionary
import typings.socketIoComponentEmitter.socketIoComponentEmitterStrings.clear
import typings.socketIoComponentEmitter.socketIoComponentEmitterStrings.delete
import typings.socketIoComponentEmitter.socketIoComponentEmitterStrings.entries
import typings.socketIoComponentEmitter.socketIoComponentEmitterStrings.forEach
import typings.socketIoComponentEmitter.socketIoComponentEmitterStrings.get
import typings.socketIoComponentEmitter.socketIoComponentEmitterStrings.has
import typings.socketIoComponentEmitter.socketIoComponentEmitterStrings.keys
import typings.socketIoComponentEmitter.socketIoComponentEmitterStrings.set
import typings.socketIoComponentEmitter.socketIoComponentEmitterStrings.size
import typings.socketIoComponentEmitter.socketIoComponentEmitterStrings.values
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@socket.io/component-emitter", "Emitter")
  @js.native
  open class Emitter[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ReservedEvents /* <: EventsMap */] () extends StObject {
    
    /**
      * Emits a reserved event.
      *
      * This method is `protected`, so that only a class extending
      * `StrictEventEmitter` can emit its own reserved events.
      *
      * @param ev Reserved event name
      * @param args Arguments to emit along with the event
      */
    /* protected */ def _emitReserved[Ev /* <: EventNames[ReservedEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<ReservedEvents, Ev> is not an array type */ args: EventParams[ReservedEvents, Ev]
    ): this.type = js.native
    
    /**
      * Emits an event.
      *
      * @param ev Name of the event
      * @param args Values to send to listeners of this event
      */
    def emit[Ev /* <: EventNames[EmitEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, Ev> is not an array type */ args: EventParams[EmitEvents, Ev]
    ): this.type = js.native
    
    /**
      * Returns true if there is a listener for this event.
      *
      * @param event Event name
      * @returns boolean
      */
    def hasListeners[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](event: Ev): Boolean = js.native
    
    /**
      * Returns the listeners listening to an event.
      *
      * @param event Event name
      * @returns Array of listeners subscribed to `event`
      */
    def listeners[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](event: Ev): js.Array[ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]] = js.native
    
    /**
      * Removes the `listener` function as an event listener for `ev`.
      *
      * @param ev Name of the event
      * @param listener Callback function
      */
    def off[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](): this.type = js.native
    def off[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev): this.type = js.native
    def off[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
    def off[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Unit, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
    
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
    
    /**
      * Removes all `listener` function as an event listener for `ev`.
      *
      * @param ev Name of the event
      */
    def removeAllListeners[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](): this.type = js.native
    def removeAllListeners[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev): this.type = js.native
    
    /**
      * Removes the `listener` function as an event listener for `ev`.
      *
      * @param ev Name of the event
      * @param listener Callback function
      */
    def removeListener[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](): this.type = js.native
    def removeListener[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev): this.type = js.native
    def removeListener[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
    def removeListener[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Unit, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
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
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [never] ? (args : ...any): void | std.Promise<void> : T
    }}}
    */
  type FallbackToUntypedListener[T] = T
  
  type ReservedOrUserEventNames[ReservedEventsMap /* <: EventsMap */, UserEvents /* <: EventsMap */] = EventNames[ReservedEventsMap | UserEvents]
  
  type ReservedOrUserListener[ReservedEvents /* <: EventsMap */, UserEvents /* <: EventsMap */, Ev /* <: ReservedOrUserEventNames[ReservedEvents, UserEvents] */] = FallbackToUntypedListener[
    /* import warning: importer.ImportType#apply Failed type conversion: Ev extends @socket.io/component-emitter.@socket.io/component-emitter.EventNames<ReservedEvents> ? ReservedEvents[Ev] : Ev extends @socket.io/component-emitter.@socket.io/component-emitter.EventNames<UserEvents> ? UserEvents[Ev] : never */ js.Any
  ]
}

package typings.proggy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proggy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("proggy", "Client")
  @js.native
  open class Client ()
    extends typings.node.nodeColoneventsMod.^ {
    def this(options: ClientOptions) = this()
    
    def addListener(eventName: ClientEvent, listener: js.Function2[/* key */ String, /* data */ ClientData, Unit]): this.type = js.native
    
    def listening: Boolean = js.native
    
    /**
      * Whether this Client is in normalizing mode
      */
    var normalize: Boolean = js.native
    
    def off(eventName: ClientEvent, listener: js.Function2[/* key */ String, /* data */ ClientData, Unit]): this.type = js.native
    
    def on(eventName: ClientEvent, listener: js.Function2[/* key */ String, /* data */ ClientData, Unit]): this.type = js.native
    
    def removeListener(eventName: ClientEvent, listener: js.Function2[/* key */ String, /* data */ ClientData, Unit]): this.type = js.native
    
    /**
      * The number of active trackers this Client is aware of
      */
    def size: Double = js.native
    
    /**
      * Stop listening for 'progress' events on the process object.
      *
      * Called implicitly when the 'done' event is emitted, if options.stopOnDone is true.
      */
    def start(): Unit = js.native
    
    /**
      * Begin listening for 'progress' events on the process object.
      *
      * Called implicitly if client.on('progress', fn) is called.
      */
    def stop(): Unit = js.native
  }
  
  @JSImport("proggy", "Tracker")
  @js.native
  open class Tracker protected ()
    extends typings.node.nodeColoneventsMod.^ {
    def this(name: String) = this()
    def this(name: String, key: String) = this()
    def this(name: String, total: Double) = this()
    def this(name: String, key: String, total: Double) = this()
    def this(name: String, key: Unit, total: Double) = this()
    
    /**
      * true if the tracker is completed.
      */
    var done: Boolean = js.native
    
    /**
      * Alias for tracker.update(tracker.total, tracker.total, metadata)
      */
    def finish(): Unit = js.native
    def finish(metadata: js.Object): Unit = js.native
    
    /**
      * The identifer set in the constructor
      */
    var key: String = js.native
    
    /**
      * The name set in the constructor
      */
    var name: String = js.native
    
    /**
      * The most recent values updated.
      */
    var total: Double = js.native
    
    /**
      * Update the tracker and emit a 'progress' event on the process object.
      */
    def update(value: Double): Unit = js.native
    def update(value: Double, metadata: js.Object): Unit = js.native
    def update(value: Double, total: Double): Unit = js.native
    def update(value: Double, total: Double, metadata: js.Object): Unit = js.native
  }
  
  inline def createClient(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[Client]
  inline def createClient(options: ClientOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  inline def createTracker(name: String): Tracker = ^.asInstanceOf[js.Dynamic].applyDynamic("createTracker")(name.asInstanceOf[js.Any]).asInstanceOf[Tracker]
  inline def createTracker(name: String, key: String): Tracker = (^.asInstanceOf[js.Dynamic].applyDynamic("createTracker")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Tracker]
  inline def createTracker(name: String, key: String, total: Double): Tracker = (^.asInstanceOf[js.Dynamic].applyDynamic("createTracker")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], total.asInstanceOf[js.Any])).asInstanceOf[Tracker]
  inline def createTracker(name: String, key: Unit, total: Double): Tracker = (^.asInstanceOf[js.Dynamic].applyDynamic("createTracker")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], total.asInstanceOf[js.Any])).asInstanceOf[Tracker]
  
  @js.native
  trait ClientData extends StObject {
    
    /**
      * The total originally sent by the tracker. If client.normalize is not true, then this is always equal to total.
      */
    var actualTotal: Double = js.native
    
    /**
      * The value originally sent by the tracker. If client.normalize is not true, then this is always equal to value.
      */
    var actualValue: Double = js.native
    
    /**
      * True if the tracker explicitly sent done: true in the data, or if value is greater than or equal to total.
      */
    var done: Boolean = js.native
    
    /**
      * The unique key for this progress bar.
      */
    var key: String = js.native
    
    /**
      * The name for this progress bar.
      */
    var name: String = js.native
    
    /**
      * The expected final value of the progress. If client.normalize is true, then this number will always be 100.
      */
    var total: Double = js.native
    
    /**
      * The current value of the progress. If client.normalize is true, then this will always be a number less than 100, and never reduce from one update to the next.
      */
    var value: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.proggy.proggyStrings.bar
    - typings.proggy.proggyStrings.progress
    - typings.proggy.proggyStrings.barDone
    - typings.proggy.proggyStrings.done
  */
  trait ClientEvent extends StObject
  object ClientEvent {
    
    inline def bar: typings.proggy.proggyStrings.bar = "bar".asInstanceOf[typings.proggy.proggyStrings.bar]
    
    inline def barDone: typings.proggy.proggyStrings.barDone = "barDone".asInstanceOf[typings.proggy.proggyStrings.barDone]
    
    inline def done: typings.proggy.proggyStrings.done = "done".asInstanceOf[typings.proggy.proggyStrings.done]
    
    inline def progress: typings.proggy.proggyStrings.progress = "progress".asInstanceOf[typings.proggy.proggyStrings.progress]
  }
  
  trait ClientOptions extends StObject {
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var stopOnDone: js.UndefOr[Boolean] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setStopOnDone(value: Boolean): Self = StObject.set(x, "stopOnDone", value.asInstanceOf[js.Any])
      
      inline def setStopOnDoneUndefined: Self = StObject.set(x, "stopOnDone", js.undefined)
    }
  }
}

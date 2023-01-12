package typings.pusherJs

import typings.pusherJs.typesSrcCoreTimelineLevelMod.TimelineLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTimelineTimelineMod {
  
  @JSImport("pusher-js/types/src/core/timeline/timeline", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Timeline {
    def this(key: String, session: Double, options: TimelineOptions) = this()
    
    /* CompleteClass */
    override def debug(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def error(event: Any): Unit = js.native
    
    /* CompleteClass */
    var events: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def generateUniqueID(): Double = js.native
    
    /* CompleteClass */
    override def info(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    var key: String = js.native
    
    /* CompleteClass */
    override def log(level: Any, event: Any): Unit = js.native
    
    /* CompleteClass */
    var options: TimelineOptions = js.native
    
    /* CompleteClass */
    override def send(sendfn: Any, callback: Any): Boolean = js.native
    
    /* CompleteClass */
    var sent: Double = js.native
    
    /* CompleteClass */
    var session: Double = js.native
    
    /* CompleteClass */
    var uniqueID: Double = js.native
  }
  
  trait Timeline extends StObject {
    
    def debug(event: Any): Unit
    
    def error(event: Any): Unit
    
    var events: js.Array[Any]
    
    def generateUniqueID(): Double
    
    def info(event: Any): Unit
    
    def isEmpty(): Boolean
    
    var key: String
    
    def log(level: Any, event: Any): Unit
    
    var options: TimelineOptions
    
    def send(sendfn: Any, callback: Any): Boolean
    
    var sent: Double
    
    var session: Double
    
    var uniqueID: Double
  }
  object Timeline {
    
    inline def apply(
      debug: Any => Unit,
      error: Any => Unit,
      events: js.Array[Any],
      generateUniqueID: () => Double,
      info: Any => Unit,
      isEmpty: () => Boolean,
      key: String,
      log: (Any, Any) => Unit,
      options: TimelineOptions,
      send: (Any, Any) => Boolean,
      sent: Double,
      session: Double,
      uniqueID: Double
    ): Timeline = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), events = events.asInstanceOf[js.Any], generateUniqueID = js.Any.fromFunction0(generateUniqueID), info = js.Any.fromFunction1(info), isEmpty = js.Any.fromFunction0(isEmpty), key = key.asInstanceOf[js.Any], log = js.Any.fromFunction2(log), options = options.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), sent = sent.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], uniqueID = uniqueID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeline]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timeline] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setEvents(value: js.Array[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: Any*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setGenerateUniqueID(value: () => Double): Self = StObject.set(x, "generateUniqueID", js.Any.fromFunction0(value))
      
      inline def setInfo(value: Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLog(value: (Any, Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setOptions(value: TimelineOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSend(value: (Any, Any) => Boolean): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
      
      inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Double): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setUniqueID(value: Double): Self = StObject.set(x, "uniqueID", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimelineOptions extends StObject {
    
    var cluster: js.UndefOr[String] = js.undefined
    
    var features: js.UndefOr[js.Array[String]] = js.undefined
    
    var level: js.UndefOr[TimelineLevel] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object TimelineOptions {
    
    inline def apply(): TimelineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimelineOptions] (val x: Self) extends AnyVal {
      
      inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
      
      inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setLevel(value: TimelineLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}

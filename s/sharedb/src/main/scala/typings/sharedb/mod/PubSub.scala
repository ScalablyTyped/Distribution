package typings.sharedb.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharedb", "PubSub")
@js.native
/* protected */ abstract class PubSub () extends StObject {
  /* protected */ def this(options: PubSubOptions) = this()
  
  /* private */ def _createStream(channel: Any): Unit = js.native
  
  /* protected */ def _emit(channel: String, data: StringDictionary[Any]): Unit = js.native
  
  /* protected */ def _publish(channels: js.Array[String], data: Any, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  /* private */ def _removeStream(channel: Any, stream: Any): Unit = js.native
  
  /* protected */ def _subscribe(channel: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  /* protected */ def _unsubscribe(channel: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  def close(): Unit = js.native
  def close(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  /* protected */ var nextStreamId: Double = js.native
  
  /* protected */ var prefix: js.UndefOr[String] = js.native
  
  def publish(
    channels: js.Array[String],
    data: StringDictionary[Any],
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  
  /* protected */ var streams: StringDictionary[Stream] = js.native
  
  /* protected */ var streamsCount: Double = js.native
  
  def subscribe(
    channel: String,
    callback: js.Function2[/* err */ Error | Null, /* stream */ js.UndefOr[Stream], Unit]
  ): Unit = js.native
  
  /* protected */ var subscribed: StringDictionary[Boolean] = js.native
}
object PubSub {
  
  @JSImport("sharedb", "PubSub")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def shallowCopy(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCopy")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
}

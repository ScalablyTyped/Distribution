package typings.std

import typings.std.stdStrings.dequeue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder)
  */
@js.native
trait VideoEncoder
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_dequeue(`type`: dequeue, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dequeue(
    `type`: dequeue,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dequeue(
    `type`: dequeue,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/close) */
  /* standard dom */
  def close(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure) */
  /* standard dom */
  def configure(config: VideoEncoderConfig): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/encode) */
  /* standard dom */
  def encode(frame: VideoFrame): Unit = js.native
  def encode(frame: VideoFrame, options: VideoEncoderEncodeOptions): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/encodeQueueSize) */
  /* standard dom */
  val encodeQueueSize: Double = js.native
  
  /* standard dom */
  def flush(): js.Promise[Unit] = js.native
  
  /* standard dom */
  var ondequeue: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_dequeue(`type`: dequeue, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dequeue(
    `type`: dequeue,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dequeue(
    `type`: dequeue,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/reset) */
  /* standard dom */
  def reset(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/state) */
  /* standard dom */
  val state: CodecState = js.native
}

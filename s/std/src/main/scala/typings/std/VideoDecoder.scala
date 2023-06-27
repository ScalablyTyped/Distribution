package typings.std

import typings.std.stdStrings.dequeue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder)
  */
@js.native
trait VideoDecoder
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/close) */
  /* standard dom */
  def close(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure) */
  /* standard dom */
  def configure(config: VideoDecoderConfig): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/decode) */
  /* standard dom */
  def decode(chunk: EncodedVideoChunk): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/decodeQueueSize) */
  /* standard dom */
  val decodeQueueSize: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/flush) */
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/reset) */
  /* standard dom */
  def reset(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/state) */
  /* standard dom */
  val state: CodecState = js.native
}

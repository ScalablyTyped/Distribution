package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message received by a target object.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent)
  */
@js.native
trait MessageEvent[T]
  extends StObject
     with Event {
  
  /**
    * Returns the data of the message.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/data)
    */
  /* standard dom */
  val data: T = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/initMessageEvent)
    */
  /* standard dom */
  /* standard dom.iterable */
  def initMessageEvent(
    `type`: java.lang.String,
    bubbles: js.UndefOr[scala.Boolean],
    cancelable: js.UndefOr[scala.Boolean],
    data: js.UndefOr[Any],
    origin: js.UndefOr[java.lang.String],
    lastEventId: js.UndefOr[java.lang.String],
    source: js.UndefOr[MessageEventSource | Null],
    ports: js.UndefOr[js.Array[MessagePort] | js.Iterable[MessagePort]]
  ): Unit = js.native
  
  /**
    * Returns the last event ID string, for server-sent events.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/lastEventId)
    */
  /* standard dom */
  val lastEventId: java.lang.String = js.native
  
  /**
    * Returns the origin of the message, for server-sent events and cross-document messaging.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/origin)
    */
  /* standard dom */
  val origin: java.lang.String = js.native
  
  /**
    * Returns the MessagePort array sent with the message, for cross-document messaging and channel messaging.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/ports)
    */
  /* standard dom */
  val ports: js.Array[MessagePort] = js.native
  
  /**
    * Returns the WindowProxy of the source window, for cross-document messaging, and the MessagePort being attached, in the connect event fired at SharedWorkerGlobalScope objects.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/source)
    */
  /* standard dom */
  val source: MessageEventSource | Null = js.native
}

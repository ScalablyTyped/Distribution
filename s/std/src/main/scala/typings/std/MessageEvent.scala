package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A message received by a target object. */
@js.native
trait MessageEvent extends Event {
  /**
    * Returns the data of the message.
    */
  val data: js.Any = js.native
  /**
    * Returns the last event ID string, for server-sent events.
    */
  val lastEventId: java.lang.String = js.native
  /**
    * Returns the origin of the message, for server-sent events and cross-document messaging.
    */
  val origin: java.lang.String = js.native
  /**
    * Returns the MessagePort array sent with the message, for cross-document messaging and channel messaging.
    */
  val ports: js.Array[MessagePort] = js.native
  /**
    * Returns the WindowProxy of the source window, for cross-document messaging, and the MessagePort being attached, in the connect event fired at SharedWorkerGlobalScope objects.
    */
  val source: MessageEventSource | Null = js.native
}


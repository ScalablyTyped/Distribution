package typings.std

import typings.std.stdStrings.keystatuseschange
import typings.std.stdStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This EncryptedMediaExtensions API interface represents a context for message exchange with a content decryption module (CDM).
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession)
  */
@js.native
trait MediaKeySession
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(`type`: keystatuseschange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/close) */
  /* standard dom */
  def close(): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/closed) */
  /* standard dom */
  val closed: js.Promise[MediaKeySessionClosedReason] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/expiration) */
  /* standard dom */
  val expiration: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/generateRequest) */
  /* standard dom */
  def generateRequest(initDataType: java.lang.String, initData: BufferSource): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/keyStatuses) */
  /* standard dom */
  val keyStatuses: MediaKeyStatusMap = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/load) */
  /* standard dom */
  def load(sessionId: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/keystatuseschange_event) */
  /* standard dom */
  var onkeystatuseschange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/message_event) */
  /* standard dom */
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/remove) */
  /* standard dom */
  def remove(): js.Promise[Unit] = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(`type`: keystatuseschange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/sessionId) */
  /* standard dom */
  val sessionId: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/update) */
  /* standard dom */
  def update(response: BufferSource): js.Promise[Unit] = js.native
}

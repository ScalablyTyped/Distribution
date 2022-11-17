package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This EncryptedMediaExtensions API interface represents a context for message exchange with a content decryption module (CDM).
  * Available only in secure contexts.
  */
@js.native
trait MediaKeySession
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_keystatuseschange")
  def addEventListener(`type`: "keystatuseschange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_keystatuseschange")
  def addEventListener(
    `type`: "keystatuseschange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_keystatuseschange")
  def addEventListener(
    `type`: "keystatuseschange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def close(): js.Promise[Unit] = js.native
  
  /* standard dom */
  val closed: js.Promise[MediaKeySessionClosedReason] = js.native
  
  /* standard dom */
  val expiration: Double = js.native
  
  /* standard dom */
  def generateRequest(initDataType: java.lang.String, initData: BufferSource): js.Promise[Unit] = js.native
  
  /* standard dom */
  val keyStatuses: MediaKeyStatusMap = js.native
  
  /* standard dom */
  def load(sessionId: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  /* standard dom */
  var onkeystatuseschange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any]) | Null = js.native
  
  /* standard dom */
  def remove(): js.Promise[Unit] = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_keystatuseschange")
  def removeEventListener(`type`: "keystatuseschange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_keystatuseschange")
  def removeEventListener(
    `type`: "keystatuseschange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_keystatuseschange")
  def removeEventListener(
    `type`: "keystatuseschange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val sessionId: java.lang.String = js.native
  
  /* standard dom */
  def update(response: BufferSource): js.Promise[Unit] = js.native
}

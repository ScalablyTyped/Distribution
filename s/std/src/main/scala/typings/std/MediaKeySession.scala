package typings.std

import typings.std.stdStrings.keystatuseschange
import typings.std.stdStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This EncryptedMediaExtensions API interface represents a context for message exchange with a content decryption module (CDM). */
@js.native
trait MediaKeySession
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  val closed: js.Promise[Unit] = js.native
  
  val expiration: Double = js.native
  
  def generateRequest(initDataType: java.lang.String, initData: BufferSource): js.Promise[Unit] = js.native
  
  val keyStatuses: MediaKeyStatusMap = js.native
  
  def load(sessionId: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  var onkeystatuseschange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, js.Any]) | Null = js.native
  
  def remove(): js.Promise[Unit] = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  val sessionId: java.lang.String = js.native
  
  def update(response: BufferSource): js.Promise[Unit] = js.native
}

package typings.std

import typings.std.stdStrings.keystatuseschange
import typings.std.stdStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This EncryptedMediaExtensions API interface represents a context for message exchange with a content decryption module (CDM). */
@js.native
trait MediaKeySession extends EventTarget {
  val closed: js.Promise[Unit] = js.native
  val expiration: Double = js.native
  val keyStatuses: MediaKeyStatusMap = js.native
  var onkeystatuseschange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _]) | Null = js.native
  val sessionId: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(`type`: keystatuseschange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def close(): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: BufferSource): js.Promise[Unit] = js.native
  def load(sessionId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def remove(): js.Promise[Unit] = js.native
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(`type`: keystatuseschange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  def update(response: BufferSource): js.Promise[Unit] = js.native
}


package typings.std

import typings.std.stdStrings.message
import typings.std.stdStrings.messageerror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel) */
@js.native
trait BroadcastChannel
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Closes the BroadcastChannel object, opening it up to garbage collection.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/close)
    */
  /* standard dom */
  def close(): Unit = js.native
  
  /**
    * Returns the channel name (as passed to the constructor).
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/name)
    */
  /* standard dom */
  val name: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/message_event) */
  /* standard dom */
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/messageerror_event) */
  /* standard dom */
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
  
  /**
    * Sends the given message to other BroadcastChannel objects set up for this channel. Messages can be structured objects, e.g. nested objects and arrays.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/postMessage)
    */
  /* standard dom */
  def postMessage(message: Any): Unit = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: EventListenerOptions
  ): Unit = js.native
}

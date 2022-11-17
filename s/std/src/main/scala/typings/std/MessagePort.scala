package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Channel Messaging API interface represents one of the two ports of a MessageChannel, allowing messages to be sent from one port and listening out for them arriving at the other. */
@js.native
trait MessagePort
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_messageerror")
  def addEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_messageerror")
  def addEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_messageerror")
  def addEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** Disconnects the port, so that it is no longer active. */
  /* standard dom */
  def close(): Unit = js.native
  
  /* standard dom */
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
  
  /* standard dom */
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
  
  /* standard dom */
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, options: StructuredSerializeOptions): Unit = js.native
  /**
    * Posts a message through the channel. Objects listed in transfer are transferred, not just cloned, meaning that they are no longer usable on the sending side.
    *
    * Throws a "DataCloneError" DOMException if transfer contains duplicate objects or port, or if message could not be cloned.
    */
  /* standard dom */
  def postMessage(message: Any, transfer: js.Array[Transferable]): Unit = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_messageerror")
  def removeEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_messageerror")
  def removeEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_messageerror")
  def removeEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** Begins dispatching messages received on the port. */
  /* standard dom */
  def start(): Unit = js.native
}

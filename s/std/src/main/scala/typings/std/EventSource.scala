package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSource
  extends StObject
     with EventTarget {
  
  /* standard dom */
  val CLOSED: Double = js.native
  
  /* standard dom */
  val CONNECTING: Double = js.native
  
  /* standard dom */
  val OPEN: Double = js.native
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(`type`: "error", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_open")
  def addEventListener(`type`: "open", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_open")
  def addEventListener(
    `type`: "open",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_open")
  def addEventListener(
    `type`: "open",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  /* standard dom */
  def addEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent[Any], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent[Any], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** Aborts any instances of the fetch algorithm started for this EventSource object, and sets the readyState attribute to CLOSED. */
  /* standard dom */
  def close(): Unit = js.native
  
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
  
  /* standard dom */
  var onopen: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** Returns the state of this EventSource object's connection. It can have the values described below. */
  /* standard dom */
  val readyState: Double = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_open")
  def removeEventListener(`type`: "open", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(`type`: "error", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_open")
  def removeEventListener(
    `type`: "open",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_open")
  def removeEventListener(
    `type`: "open",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: EventListenerOptions
  ): Unit = js.native
  /* standard dom */
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent[Any], Any]
  ): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent[Any], Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** Returns the URL providing the event stream. */
  /* standard dom */
  val url: java.lang.String = js.native
  
  /** Returns true if the credentials mode for connection requests to the URL providing the event stream is set to "include", and false otherwise. */
  /* standard dom */
  val withCredentials: scala.Boolean = js.native
}

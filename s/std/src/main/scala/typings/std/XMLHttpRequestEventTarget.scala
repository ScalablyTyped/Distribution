package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequestEventTarget
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_progress")
  def addEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadend")
  def addEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_load")
  def addEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadstart")
  def addEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_timeout")
  def addEventListener(
    `type`: "timeout",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadend")
  def addEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_load")
  def addEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadstart")
  def addEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_timeout")
  def addEventListener(
    `type`: "timeout",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_progress")
  def addEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadend")
  def addEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadstart")
  def addEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_load")
  def addEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_progress")
  def addEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_timeout")
  def addEventListener(
    `type`: "timeout",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  var onabort: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  /* standard dom */
  var onload: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  /* standard dom */
  var onloadend: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  /* standard dom */
  var onloadstart: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  /* standard dom */
  var onprogress: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  /* standard dom */
  var ontimeout: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_progress")
  def removeEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadend")
  def removeEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadstart")
  def removeEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_load")
  def removeEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_timeout")
  def removeEventListener(
    `type`: "timeout",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_progress")
  def removeEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_timeout")
  def removeEventListener(
    `type`: "timeout",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_load")
  def removeEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadend")
  def removeEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadstart")
  def removeEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadend")
  def removeEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_load")
  def removeEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_timeout")
  def removeEventListener(
    `type`: "timeout",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_progress")
  def removeEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadstart")
  def removeEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
}
